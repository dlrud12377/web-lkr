
// 값을 받아오는 변수
let keyword = document.getElementById("keyword");

// 검색 버튼
let searchBtn = document.getElementById("searchBtn");

// 검색결과 반영
let message = document.getElementById("message");

// 검색결과(카드형)
let bookList = document.getElementById("bookList");

// 1. 유효성 검사

// 검사용 정규식
const regex = /^[a-zA-Z가-힇ㄱ-ㅎ0-9\s]+$/;

// inputTest 함수
const inputTest =  () => {

    if (keyword.value.length < 2){
    message.innerText = "글자 수는 2자 이상 작성해야 합니다.";
    return false;
    }

    if (!regex.test(keyword.value)){
        message.innerText = "한글, 영어, 숫자, 공백 제외 문자는 사용하실 수 없습니다.";
        return false;
    }

    return true;

}

// 책 찾기 함수
const findBook =  () => {
    fetch(`https://openlibrary.org/search.json?title=${keyword.value}`)
    .then(response => response.json())
    .then(books => {

        bookList.innerHTML = "";

        if(books.numFound == 0){
            message.innerText = "검색 결과가 없습니다."
            return;
        }

        message.innerHTML = `${books.numFound}개의 결과 중 10개 출력`;

        // 10개 출력
        const count = Math.min(10, books.docs.length);
        let html = "";

        for (let i = 0; i < count; i++) {
            const book = books.docs[i];

            html += `
                <div class="card">
                    <strong>${book.title}</strong>
                    <p><span>저자 : </span>${book.author_name ? book.author_name.join(", ") : "정보 없음"}</p>
                    <p><span>출판연도 : </span>${book.first_publish_year ?? "정보 없음"}</p>
                    <p><span>출판사 : </span>${book.publisher ? book.publisher[0] : "정보 없음"}</p>
                </div>
            `;
    }
    bookList.innerHTML = html;
    
    })
    .catch((error) => {
        alert("정보를 정상적으로 불러오지 못했습니다.");
        console.error("에러 발생 : ", error);
    });
}

// 검색 버튼 클릭 시 예외사항 발생 처리
// 그 후 검색 진행

searchBtn.addEventListener("click", () => {
    if (keyword.value.trim() == "") {
        alert("검색어를 입력하세요");
        return;
    }

    if (!inputTest()){
        alert("검색 조건이 충족되지 않았습니다. 확인 후 진행해주세요");
        return;
    }
    findBook();
});

// 검색창에 입력 시 정규식 + 2자 이상 조건 검사

keyword.addEventListener("input", () => {

        // innerText 초기화
        message.innerText = "";

        inputTest();

})




