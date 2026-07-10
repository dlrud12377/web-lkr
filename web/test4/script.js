// id 객체

// 정보 입력 & 반응 입력
const searchInput = document.getElementById("searchInput");
const searchBtn = document.getElementById("searchBtn");
const allBtn = document.getElementById("allBtn");


// 정보 출력
const message = document.getElementById("message");
const count = document.getElementById("count");
const productList = document.getElementById("productList");

// 사용 정규식
let regex = /^[a-zA-Z0-9가-힇 ]+$/;

// 사용 함수
const inputTest = () => {
    if(searchInput.value.length < 2) {

        message.className = "error";
        message.innerText = "검색어는 2글자 이상 입력하세요.";

        return false;
    }

    if(!regex.test(searchInput.value.trim())){
        message.className = "error";
        message.innerText = "검색어에는 특수문자를 입력할 수 없습니다.";

        return false;
    }

    // 둘다 통과하면 true 반환

    return true;
}

const loadProducts = () => {

    // input값 가져오기
    let input = searchInput.value;
    // list 초기화
    productList.innerHTML = "";



    fetch(`https://dummyjson.com/products?q=${input}`)
    .then(response => response.json())
    .then(data => {

        let products = data.products;

        count.innerText = `상품 개수 : ${data.products.length}개`;


        // 카드 출력
        let html = "";

        products.forEach(product => {
            html += `
            <div class="product-card">
                <img src="${product.thumbnail}" alt="상품 이미지">
                <p><strong>${product.title}</strong></p>
                <p><strong>카테고리 : </strong>${product.category}</p>
                <p><strong>가격 : </strong>$${product.price}</p>
                <p><strong>할인률 : </strong>${product.discountPercentage}%</p>
                <p><strong>평점 : </strong>${product.rating}</p>
                <p><strong>재고 : </strong>${product.stock}</p>`

            if(Number(product.stock) >= 10){
                console.log(product.stock);
                html += `<p class="stock-normal">재고 정상</p>
                    </div>`;
            }
            else{
                html += `<p class="stock-low">재고 부족</p>
                    </div>`;
            }

        });

        productList.innerHTML = html;
    })
}

const loadAllProducts = () => {

    // list 초기화
    productList.innerHTML = "";

    fetch(`https://dummyjson.com/products?limit=30`)
    .then(response => response.json())
    .then(data => {


        let products = data.products;

        count.innerText = `상품 개수 : ${data.products.length}개`;


        // 카드 출력
        let html = "";

        products.forEach(product => {
            html += `
            <div class="product-card">
                <img src="${product.thumbnail}" alt="상품 이미지">
                <p><strong>${product.title}</strong></p>
                <p><strong>카테고리 : </strong>${product.category}</p>
                <p><strong>가격 : </strong>$${product.price}</p>
                <p><strong>할인률 : </strong>${product.discountPercentage}%</p>
                <p><strong>평점 : </strong>${product.rating}</p>
                <p><strong>재고 : </strong>${product.stock}</p>`

            if(Number(product.stock) >= 10){
                console.log(product.stock);
                html += `<p class="stock-normal">재고 정상</p>
                    </div>`;
            }
            else{
                html += `<p class="stock-low">재고 부족</p>
                    </div>`;
            }

        });

        productList.innerHTML = html;
    
    })
}


// 눌렀을 때 eventlistener

searchBtn.addEventListener("click", () => {
    inputTest();

    if (!inputTest()) {
        return;
    }

    loadProducts();

    if (!loadProducts()) {
        return;
    }
})

allBtn.addEventListener("click", () => {
    loadAllProducts();
})