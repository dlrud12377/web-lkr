// 처음 페이지가 로딩됐을 때 전체 목록이 나오게 하기
const API_URL = "http://localhost:10000/reservations";

//HTML 요소 가져오기
const reservationId = document.querySelector("#reservationId");

const petName = document.getElementById("petName");
const ownerName = document.getElementById("ownerName");
const animalType = document.getElementById("animalType");
const doctorName = document.getElementById("doctorName");
const reservationDate = document.getElementById("reservationDate");
const reservationStatus = document.getElementById("reservationStatus");
const expectedCost = document.getElementById("expectedCost");

