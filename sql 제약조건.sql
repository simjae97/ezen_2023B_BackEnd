/*	여러줄 주석	*/
#	한줄주석
-- 한줄주석(띄어쓰기 필요)
-- 1. 데이터베이스 : 데이터가 모여있는 공간 = 테이블을 여러개 저장할수 있는 공간

drop database if exists test3;
create database test3;
use test3;

-- 2. 테이블: 행/열로 이루어진 표/테이블 [*테이블 간 관계기능 -> 관계형 데이터베이스]
drop table if exists member; -- 만일 'member' 테이블이 존재하면 삭제.
create table member(
	mno int,			-- 회원번호
	mid varchar(30),	-- 회원아이디[최대 30글자]
    mphone char(13),
    -- char 고정길이: 필드의 저장할 문자의 길이가 절대적으로 고정일때
    mname varchar(10),
	-- varchar 가변길이: 필드의 저장할 문자의 길이가 명확하지 않을때
    confirm boolean,	-- 광고문자 전송여부 boolean true /false
    joindate datetime	-- 날짜 0000-00-00 0:00:00
    -- 마지막 필드뒤에는 쉼표 X
);

select * from member; -- 멤버테이블 검색

# 테이블 : 행/열로 이루어진 데이터 집합
# 레코드 : 테이블의 행 단위,
##### 필드 : 테이블의 열 단위 attribute

# 1. 레코드(=필드값) 삽입		insert into 테이블명 values(값,값,값,값,값)
insert into member values(1,"qwe","010-0000-000","유재석",false,'2024-01-22 16:06:01');

# 필드 데이터의 제약 조건
drop table if exists member2;
create table member2(
	회원번호1 int,		# 1. notnull
    회원번호2 int	not null #2. not null  -- null 입력 불가능
);

insert into member2 values(1,2);
insert into member2(회원번호2) values(1); -- 트겆ㅇ 필드에 값 대입시 필드명 명시
# insert into member2(회원번호1) values(1); -- 트겆ㅇ 필드에 값 대입시 필드명 명시 -- 회원번호 2가 null이므로 오류
select * from member2;

# 2. default : 해당 필드의 기본값 설정

drop table if exists member3;
create table member3(
	회원번호1 int	,	# 1. not null
    회원번호2 int default 0,   # 2. defualt 값/ 함수
    국적 char(4) default "대한민국",
    동의여부 boolean default true,
    날짜 datetime default now() # now()함수는 현재 날짜와 시간을 반환해주는 sql함수
);
insert into member3 values();
insert into member3 values(10,20,"일본",false,"2024-01-23 16:14:22");
select * from member3;

# 3. unique :중복을 허용하지 않는다
drop table if exists member4;
create table member4(
	회원번호1 int,
    회원번호2 int unique				# 3. 유니크
);

insert into member4 values(1,2);
select * from member4;

# 4. primary key 기본키
	# 1. 레코드를 고유하게 구분하기 위한 최소의 정보 (=식별)
    
# 5. foreign key 외래키
	# 1. 다른 테이블의 기본키와 연결된 정보 (=참조)
    
# ---------------------회원제 게시판: 회원들이 글을 작성해서 저장-------------------------#
# 계층구조: 회원(상위) 게시판(하위)
# 테이블 1개: 서로 다른 목적의 데이터들을 하나의 테이블로 작성시 이상현상(중복/불필요한정보)발생
# 테이블2개(분해) : 동일한 목적의 데이터 끼리 테이블을 생성해서 연결/관계(pk-fk) 이용한 관계형 데이터베이스 구축


# 5-1 회원테이블
	#1. 회원번호/2.아이디/3.비밀번호/4.이름
    # 필드별 타입 선정 -> 제약 조건 -> pk 선정 ( 식별키 : 중복x,공백 x -> not null unique, 하나의 레코드가 대표!!)
    # primary key(기본키로 선언할 키)
drop table if exists member5;
create table member5(
	mno int not null unique,  -- not null이고 중복이 없는 필드
    mid varchar(30) not null unique,	-- not null이고 중복
    mpw varchar(30) not null,		--	not null
    mname varchar(20) default "익명" ,
    primary key(mno)		-- mno 필드를 기본키로 사용 /관례적으로 테이블 1개당 pk필드 1개이상
);

# 5-2 게시판 테이블
	# 1.게시물 번호/2.게시물 제목/3.게시물 내용
drop table if exists board;
create table board(
	bno int not null unique,
    btitle varchar(255) not null ,
    bcontent longtext,
    primary key(bno),  -- bno 필드를 기본키로 사용
    mno int unique,
    -- 참조 만들기
    foreign key (mno) references member5 (mno)
    # foreign key (fk로 사용할 필드) references 참조할테이블(pk필드)
);

select * from board