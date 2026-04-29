create database if not exists academy_db
character set  = utf8mb4
collate = utf8mb4_unicode_ci;


CREATE TABLE product1 (
    product_id INT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    price INT NOT NULL,
    stock INT NOT NULL
);

-- 상품 3개 삽입
insert into product1 (product_id, name, price, stock)
values 
(1, '모니터', 240000, 4),
(2, 'HDMI케이블', 8000, 7),
(3, '마우스', 35000, 12);

-- 전체 상품 조회하기
select * from product1;

-- 가격이 10000원 이상인 상품만 조회하기
select * from product1
where price >= 10000;

-- 특정 상품의 재고를 10개 증가시키기
update product1
set stock = stock + 10
where product_id = 1;

-- 특정 상품의 가격을 수정하기
update product1
set price = price + 3400
where product_id = 2;

-- 특정 상품을 삭제하기
delete from product1 where product_id = 1;