문제 5. E-R 다이어그램을 이용한 테이블 정의하기
시나리오
도서 대여 시스템의 E-R 다이어그램이 다음과 같이 주어졌다.

회원(Member)은 여러 권의 도서를 대여할 수 있다.
도서(Book)는 여러 번 대여될 수 있다.
대여(Rental)는 회원과 도서 사이의 관계를 저장한다.
엔터티와 속성은 다음과 같다.

사진~
 

Member
- member_id
- name
- phone

Book
- book_id
- title
- author

Rental
- rental_id
- member_id
- book_id
- rental_date
- return_date

 

요구사항
위 E-R 구조를 바탕으로 관계형 데이터베이스 테이블을 정의하시오.

각 테이블의 기본키를 지정하시오.
Rental 테이블에 외래키를 지정하시오.
MySQL 기준 CREATE TABLE 문을 작성하시오.


create table if not exists Member(
	member_id int primary key,
	name varchar(100),
	phone varchar(100)
);

create table if not exists Book(
	book_id int primary key,
	title varchar(100),
	author varchar(100)
);

create table if not exists Rental(
	rental_id int primary key,
	member_id int,
	book_id int,
	rental_date date,
	return_date date
);

alter table rental add foreign key(member_id) references member;
alter table rental add foreign key(book_id) references book;



문제 6. DDL 명령문 작성하기
시나리오
학원 관리 시스템에서 수강생 정보를 저장하는 student 테이블을 관리해야 한다.
처음에는 테이블을 생성하고, 이후 요구사항 변경으로 컬럼과 제약조건을 수정해야 한다.

 

요구사항
MySQL 기준으로 다음 작업을 수행하는 SQL문을 작성하시오.

6-1. student 테이블을 생성하시오.
컬럼은 student_id, name, email, age로 구성하시오.

create table if not exists student1(
	student_id int primary key, -- 기본키 설정
	name varchar(50),
	email varchar(200) unique, -- unique 제약
	age int
);

6-2. age 컬럼을 삭제하시오.
alter table student1 drop column age;

6-3. phone 컬럼을 추가하시오.
alter table student1 add column phone varchar(100);

6-4. name 컬럼의 길이를 VARCHAR(100)으로 수정하시오.
alter table student1 modify name varchar(100);



문제 9. CHECK 및 DEFAULT 제약조건 적용하기
시나리오
당신은 쇼핑몰 시스템의 상품 테이블을 설계하는 개발자이다.
기획팀에서 다음과 같은 요구사항을 전달하였다.

상품 가격(price)은 0보다 커야 한다.
상품 재고(stock)는 0 이상이어야 한다.
상품 상태(status)는 'SALE', 'SOLD_OUT' 중 하나만 가능해야 한다.
상품 등록일(created_at)은 입력하지 않으면 현재 날짜로 자동 설정되어야 한다.
 
요구사항
MySQL 기준으로 다음 조건을 만족하는 product 테이블을 생성하시오.

컬럼 구성
product_id (기본키)
name (상품명)
price (가격)
stock (재고)
status (상품 상태)
created_at (등록일)
 
제약조건
price는 0보다 커야 한다. (CHECK)
stock은 0 이상이어야 한다. (CHECK)
status는 'SALE', 'SOLD_OUT'만 허용한다. (CHECK)
created_at은 기본값으로 현재 날짜를 사용한다. (DEFAULT)
※현재 날짜 : CURRENT_DATE 를 넣는다.

create table if not exists product2(
	product_id int primary key,
	name varchar(100),
	price int,
	stock int,
	status varchar(10),
	created_at date default(CURRENT_DATE()),
	constraint BAN_PRICE CHECK(PRICE >= 0),
	constraint BAN_STOCK CHECK(STOCK >= 0),
	constraint BAN_STATUS CHECK(STATUS = 'SALE' or 'SOLD_OUT')
);

select * FROM PRODUCT2;


문제 10. LIKE, BETWEEN, IN 조건을 활용한 데이터 조회
시나리오
당신은 쇼핑몰 관리 시스템의 데이터 조회 기능을 개발하고 있다.
관리자는 특정 조건에 맞는 상품 데이터를 조회할 수 있는 기능을 요청하였다.

현재 사용 중인 테이블 구조는 다음과 같다.

 

create table if not exists product3 (
    product_id INT,
    name VARCHAR(100),
    price INT,
    category VARCHAR(50),
    created_at DATE
);

 

요구사항
다음 조건을 만족하는 SQL SELECT 문을 각각 작성하시오.

 

10-1. LIKE 조건

상품명(name)에 "노트북"이 포함된 상품을 조회하시오.

select * from PRODUCT3
where NAME like '%노트북%';
 

10-2. BETWEEN 조건

가격(price)이 100,000원 이상 500,000원 이하인 상품을 조회하시오.

select * from PRODUCT3
where PRICE between 100000 and 500000;
 

10-3. IN 조건

카테고리(category)가 '전자기기', '가전', '컴퓨터' 중 하나인 상품을 조회하시오.

select * from PRODUCT3
where CATEGORY in ('전자기기', '가전', '컴퓨터');

 

10-4. 복합 조건 (중요)

다음 조건을 모두 만족하는 상품을 조회하시오.

상품명에 "프로"가 포함된 상품
가격이 200,000원 이상 1,000,000원 이하
카테고리가 '전자기기', '컴퓨터' 중 하나

select * from PRODUCT3
where CATEGORY in ('전자기기', '컴퓨터')
and PRICE between 200000 and 1000000
and NAME like '%프로%';