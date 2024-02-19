# 1. 데이터베이스 생성
drop database if exists test6;
create database test6;
use test6;

# 2. 테이블 생성
	# 회원제 기능, 카테고리게시물기능 ,댓글기능
    # 1.필드의 중복 최소화
	# 1. 저장할 데이터 선정
drop table member;
create table member(
	mno int auto_increment,
    mid varchar(10),
    mpw varchar(10),
	primary key(mno)
);

create table bcategory(
	bcno int auto_increment,
    bcname varchar(20),
	primary key(bcno)
);

create table board(
	bno int auto_increment,
    btitle text,
    bcontent text,
    mno int,
    bcno int,
    primary key(bno),
    foreign key(mno) references member(mno) on delete cascade ,
    foreign key(bcno) references bcategory(bcno) on delete cascade
);

create table reply(
	rno int auto_increment,
    rcontent text,
    bno int,
    primary key(rno),
    foreign key(bno) references board(bno) on delete cascade
);