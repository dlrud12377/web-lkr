const name = document.getElementById("name");
const course = document.getElementById("course");
const email = document.getElementById("email");
const addBtn = document.getElementById("addBtn");
const loadBtn = document.getElementById("loadBtn");
const studentList = document.getElementById("studentList");

const API_URL = "http://localhost:10000/api/students";

// 에러 메시지 출력
const nameMsg = document.getElementById("nameMsg");
const courseMsg = document.getElementById("courseMsg");
const emailMsg = document.getElementById("emailMsg");

const message = document.getElementById("message");

// 유효성검사1
const inputTest = (param, inputMsg, errorMsg) => {
    if (!param.value) {
        inputMsg.innerText = errorMsg;
        inputMsg.className = "error";
        return false;
    }

    inputMsg.innerText = "";
    return true;
};

// 유효성검사2
const emailTest = () => {
    let regex = /^[A-Za-z0-9가-힇]+@[A-Za-z0-9가-힇\.]+$/
    let emailValue = email.value;
    if(!emailValue) {
        emailMsg.innerText = "이메일을 입력해야 합니다.";
        emailMsg.className = "error";
        return false;
    }

    if(!regex.test(emailValue)) {
        emailMsg.innerText = "이메일 형식이 올바르지 않습니다.";
        emailMsg.className = "error";
        return false;
    }

    emailMsg.innerText = "";
    return true;
};

// 메시지 출력 함수
const showMessage = (text, type) => {
    message.innerText = text;
    message.className = type;
};

// 학생데이터를 테이블에 표현하는 함수
const renderStudents = (students) => {
    if(students === null || students.length === 0){
        studentList.innerHMTL = `
        <tr>
            <td colspan="4" class="empty">
                등록된 수강생이 없습니다.
            </td>
        </tr>
        `;
        return;
    }

    const html = students.map(student => {
        return `
            <tr>
                <td>${student.id}</td>
                <td>${student.name}</td>
                <td>${student.course}</td>
                <td>${student.email}</td>
            </tr>
        `
    }).join("");

    studentList.innerHTML = html;
}

// 서버에 요청하여 학생 데이터를 가져오는 함수
const showStudentList = () => {
    let html = "";

    fetch(API_URL)
        .then(response => {
            if(!response.ok){
                throw new Error("수강생 목록 조회 실패");
            }
            return response.json();
        })
        .then(result => {
            // 서버에서 error가 반환된 경우
            // 서버 error가 발생하면 error attribute에 not null이 뜸
            if(result.error !== null){ 
                showMessage(result.error, "error")
            }

            //ResponseDTO의 data에 실제 수강생 목록이 들어있다.
            renderStudents(result.data);

            showMessage("수강생 목록을 조회했습니다.", "success");
        })
        .catch(error => {
            console.log(error);

            showMessage("서버와 통신할 수 없습니다.", "error");
        })
};

// 입력창 초기화함수
const clearInput = () => {
    name.value = "";
    course.value = "";
    email.value = "";

    name.focus();
}

// 학생을 java로 데이터를 넘기는 함수
const postStudent = () => {
    fetch(API_URL, {
    method : "POST",
    headers : {
        "Content-Type": "application/json"
    },
    body : JSON.stringify({
        name : name.value,
        course : course.value,
        email : email.value
    })
    })
    .then(response => {
        if(!response.ok) {
            throw new Error("수강생 등록 실패");
        }

        return response.json();
    })
    .then(result => {
        if(result.error !== null){
            showMessage(result.error, "error");
            return;
        }

        const savedStudent = result.data[0];

        showMessage(savedStudent.name + " 수강생이 등록되었습니다.", "success");

        // 입력창 비우기
        clearInput();

        // 학생 정보 테이블 갱신
        showStudentList();
        
    })
    .catch(err => {

    console.error(err);

    showMessage("서버와 통신할 수 없습니다.", "error");
    
});
}

addBtn.addEventListener("click", () => {

    // 내용이 비어있는지 검사
    let nameFlag = inputTest(name, nameMsg, "이름을 입력해야 합니다.");

    let courseFlag = inputTest(course, courseMsg, "과정명을 선택해야 합니다.");

    let emailFlag = emailTest();

    console.log(nameFlag);
    console.log(courseFlag);
    console.log(emailFlag);

    if(!(nameFlag && courseFlag && emailFlag)) {
        alert("미선택 또는 작성되지 않은 내용이 있습니다.");
        return;
    }

    console.log("유효성 검사 완료");

    // 학생 정보 java로 보내기 + 목록 수정
    postStudent();

})

loadBtn.addEventListener("click", () => {
    showStudentList();
})