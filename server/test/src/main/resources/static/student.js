const name = document.getElementById("name");
const course = document.getElementById("course");
const email = document.getElementById("email");
const addBtn = document.getElementById("addBtn");
const loadBtn = document.getElementById("loadBtn");

// 에러 메시지 출력
const nameMsg = document.getElementById("nameMsg");
const courseMsg = document.getElementById("courseMsg");
const emailMsg = document.getElementById("emailMsg");

const inputTest = (param, inputMsg, errorMsg) => {
    if (!param.value) {
        inputMsg.innerText = errorMsg;
        inputMsg.className = "error";
        return false;
    }

    inputMsg.innerText = "";
    return true;
};

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
}


addBtn.addEventListener("click", () => {

    let nameFlag = inputTest(name, nameMsg, "이름을 입력해야 합니다.");

    let courseFlag = inputTest(course, courseMsg, "과정명을 선택해야 합니다.");

    let emailFlag = emailTest();

    console.log(nameFlag);
    console.log(courseFlag);
    console.log(emailFlag);

    if(!(nameFlag && courseFlag && emailFlag)) {
        return;
    }

    console.log("도착");

    fetch("http://localhost:10000/api/students", {
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
    .then(Response => {
        if(Response.ok) {
            alert("등록 성공");
            name.value = "";
            course.value = "";
            email.value = "";
            showStudentList();
        }
    })
    .catch(err => {
    console.error(err);
});

})

loadBtn.addEventListener("click", () => {
    
})