CREATE database IF NOT EXISTS academy_db
character set = utf8mb4
collate = utf8mb4_unicode_ci;

# 한줄 주석
-- 한줄 주석2

/* 범위 주석
띄어진
줄도
가능
*/

# TBL_MEMBER라는 이름의 테이블 만들기
# 속성
-- 문자열 : 이름 (길이 50)
-- 정수 : 나이
-- 제약조건 없음

# SQL은 스크립트 전체가 실행되지 않는다.
# 구문별로 실행이 된다.

# 테이블을 생성하는 SQL이기 때문에 다시 실행하면
# 이미 만들어져 있다고 에러가 발생한다.
create table if not exists TBL_MEMBER (
	NAME VARCHAR(50),
	AGE INT
);

# 테이블명 TBL_CAR
# 속성
# 정수 : ID
# 문자열 : BRAND (길이 100)
# 문자열 : COLOR (길이 100)
# 정수 : PRICE
# ID속성에 기본키 제약조건 주기(속성 옆에 쓰기 X)

create table if not exists TBL_CAR (
	ID INT,
	BRAND VARCHAR(100),
	COLOR VARCHAR(100),
	PRICE INT,
	constraint car_pk primary key (id)
);

# 속성 옆에 제약조건을 주는 것과
# CONSTRAINT 써서 제약조건을 주는 거랑 무슨 차이가 있는가

# 속성 옆에 작성하는 방법(inline 방식)
# 장점 : 간단하고 직관적이다.

# CONSTRAINT로 제약조건 작성하는 방법(Table-level 방식)

# 장점 1 : 이름 지정 여부
# Constraint car_pk primary key(id);
# inline 방식은 이름이 자동생성 되기 때문에 나중에 수정 또는 삭제가 어렵다.

# 장점 2 : 여러 컬럼 제약조건 가능 여부
# inline 방식은 단일컬럼에만 가능

# CONSTRAINT PK_ORDER PRIMARY KEY(USER_ID, PRODUCT_ID);
# 다음과 같이 constraint는 여러 컬럼을 한번에 제약조건을 걸 수 있다.

# 총정리
# inline 방식 : 간단, 빠르게 작성, 소규모 테이블에 적합

# CONSTRAINT 방식 : 구조가 명확, 제약조건을 한 곳에서 관리
# -> 실무에서 더 많이 사용됨


# 테이블의 삭제
drop table tbl_car;

# 테이블이 존재할 때만 삭제하는 방식
# DROP TABLE IF EXISTS 테이블명;

# 테이블 안의 데이터도 전부 삭제된다.
# 외래키(FK)

create table EXAMPLE(
COL1 VARCHAR(10) not null,
COL2 VARCHAR(10),
CREATE_DATE DATETIME default CURRENT_TIMESTAMP()
);

# 수정하기
# ALTER TABLE 테이블명...

# 컬럼 추가하기
# ADD COLUMN 컬럼명 데이터타입;
alter table EXAMPLE add column COL3 VARCHAR(50);

# 컬럼 삭제하기
# DROP COLUMN 컬럼명;
alter table EXAMPLE drop column COL2;

# 컬럼명 변경하기
# RENAME COLUMN 컬럼명 TO 바꿀 컬럼명;
alter table EXAMPLE rename column COL1 to first_col;

# 컬럼의 타입 변경하기
# MODIFY COLUMN 컬럼명 타입;
alter table EXAMPLE modify column COL3 INT;

# 제약조건 추가하기
# ADD 제약조건 종류 (대상컬럼);
alter table EXAMPLE add primary key (FIRST_COL);

# 제약조건 삭제하기
# DROP 제약조건종류;
alter table EXAMPLE drop primary key;

# SHOW INDEX FROM 테이블
# 제약조건에 부여된 이름 찾기
# KEY_NAME 부분이 부여된 이름임
show index from TBL_CAR;
# 이를 이용해서 제약조건의 이름을 본 후, 제약조건을 삭제할 수 있음(또는 이름이 겹치지 않게 추가)

# Q1-1. STUDENT 테이블 만들기
create table if not exists STUDENT(
ID INT primary key,
NAME VARCHAR(50) not null,
AGE INT,
EMAIL VARCHAR(100)
);

# 다음의 컬럼을 테이블에 추가하세요
# PHONE : 문자열(20)
alter table STUDENT add PHONE VARCHAR(20);

# AGE컬럼의 타입을 정수 -> TINYINT로 수정하세요
alter table student modify AGE tinyint;

# NAME컬럼의 이름을 STUDENT_NAME으로 변경하세요
alter table STUDENT rename column NAME to STUDENT_NAME;

# PHONE 컬럼을 삭제하세요
alter table STUDENT drop PHONE;

# EMAIL 컬럼을 NOT NULL로 변경하세요
alter table STUDENT modify EMAIL VARCHAR(100) not null;

# 여러 칼럼을 한 번에 추가하기
# ADDRESS : 문자열 (100)
# GRADE : 정수

alter table STUDENT add ADDRESS VARCHAR(100), add GRADE INT;
# 형식이 테이블 초기값 지정이랑 동일함. UNIFORMITY

create table TBL_ANIMAL(
	ID INT primary key,
	type VARCHAR(100),
	AGE INT,
	FEED VARCHAR(100)
);

create table TBL_STUDENT(
	ID INT primary key,
	NAME VARCHAR(100),
	MAJOR VARCHAR(100),
	BIRTH date,
	GENDER CHAR(1) not null default 'W',
	constraint BAN_CHAR CHECK(GENDER in ('M', 'W')),
	constraint BAN_DATE CHECK(BIRTH >= '1980-01-01')
);

# defualt : 컬럼에 값이 아예 주어지지 않았을 때 자동으로 들어가는 값을 설정하는 명령어
# not null : 컬럼에 NULL값 자체를 허용하지 않겠다

# 같이 사용하면 값 생략 시 'W'가 들어가게 되고, 누군가 NULL을 넣으려고 하면
# DB가 거부한다.

# NOT NULL이 없고 DEFAULT만 있을 때 누군가 GENDER 자리에
# NULL이라고 넣으면 데이터가 NULL이라고 들어가게 된다.
# 따라서 애초에 밴을 시켜주는게 좋음

# GENDER에 들어갈 수 있는 데이터는 M과 W만 들어갔으면 좋겠음
# NULL이 들어오면 무결성이 깨진다.

alter table student add column GRADE tinyint;

alter table student 
modify column GRADE INT default 1;

# ADD로 추가하기
# PK, UNIQUE, CHECK

# MODIFY로 수정하기
# NOT NULL, DEFAULT