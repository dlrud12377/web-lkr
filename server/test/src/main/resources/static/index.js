const btn = document.getElementById("btn");
const name = document.querySelector("input[type=text]");
const result = document.getElementById("result");

btn.addEventListener("click", () => {
    fetch(`http://localhost:10000/api/hello?name=${name.value}`)
    .then(res => res.text()) // text() : 받은 응답을 문자열로 나타내는 함수
    .then(data => {
        result.textContent = data;
    })
})