// JS 유효성검사 조건
// 검사 항목   조건
// 빈 값   검색 불가
// 길이   3자 이상 20자 이하
// 허용 문자   영어, 숫자, 하이픈만 허용
// 하이픈 위치   처음과 끝에는 하이픈 불가
// 사용자 없음   “존재하지 않는 사용자입니다” 출력
// API 제한 오류   “잠시 후 다시 시도하세요” 출력

// id값 따오기

// 입력용 객체
const gitId =  document.getElementById("githubId");
const searchBtn = document.getElementById("searchBtn");

// 출력용 객체
let message = document.getElementById("message");
let profileBox = document.getElementById("profileBox");

// input 유효성 검사

// 검사용 정규식
const regex = /^[A-Za-z0-9](?:[A-Za-z0-9-]*[A-Za-z0-9])?$/;

const inputTest = () => {

    if(gitId.value === ""){
        message.innerText = "Github 아이디를 입력하세요";
        message.className = "unqualified";
        searchBtn.disabled = true;
        return false;
    }

    if(gitId.value.length < 3 || gitId.value.length > 20) {
        message.innerText = "3자 이상 20자 이하로 입력해주세요";
        message.className = "unqualified";
        searchBtn.disabled = true;
        return false;
    }

    if(!regex.test(gitId.value)){
        message.innerText = "잘못된 입력값입니다.";
        message.className = "unqualified";
        searchBtn.disabled = true;
        return false;
    }

    message.innerText = "정상적인 입력값입니다."
    message.classList.value = "qualified";
    searchBtn.disabled = false;
    return true;
}

// 페이지 초기에 한번 검사
inputTest();

gitId.addEventListener("input", () => {
    inputTest();
})

const searchGithubUser = async () => {
    if(!inputTest()) {
        return;
    }

    const id = gitId.value.trim();
    const url = `https://api.github.com/users/${id}`;

    try{
        message.textContent = "사용자 정보를 불러오는 중입니다...";
        profileBox.innerHTML = "";

        const response = await fetch(url);

        // 거절이 왔을 때 : 404
        if(response.status === 404){
            message.textContent = "존재하지 않는 사용자입니다.";
            message.className = "unqualified";
            return;
        }

        // 거절이 왔을 때 : 403
        if(response.status === 403){
            message.textContent = "접근 권한이 없습니다.";
            message.className = "unqualified";
            return;
        }

        // 응답 자체가 오지 않았을 때("API 통신 과정에서 문제가 생김")
        if(!response.ok){
            throw new Error("API 오류");
        }

        // 오류, 거절이 진행되지 않았을 때 비동기 함수 
        // 사용하여 response에서 정보를 json 형식으로 추출
        const user = await response.json();

        message.textContent = "";

        profileBox.innerHTML = 
            `<div class="card">
                <img alt="${user.login}" class="card__image" src="${user.avatar_url}">
                <div class="card__text">
                    <h2>${id}</h2>
                    <p><strong>이름 : </strong>${user.name || "이름 정보 없음"}</p>
                    <p><strong>소개 : </strong>${user.bio || "소개 정보 없음"}</p>
                    <p><span>팔로워 ${user.followers}</span> <span>팔로잉 ${user.following}</span> <span>저장소 ${user.public_repos}</span></p>
                    <a href="${user.html_url}"> GitHub 페이지 이동 </a>
                </div>
            </div>`;
    }
    catch(error){
        message.textContent = "사용자 정보를 불러오지 못했습니다.";
        message.className = "unqualified";
    }
}

// 버튼 클릭 시 흐름
// 1. 내용이 제대로 입력되었는지 확인
// 2. github api 서버에 정보를 요청을 하고 응답을 받아와서 화면에 보여줘야 한다.
searchBtn.addEventListener("click", () => {
    searchGithubUser();
})