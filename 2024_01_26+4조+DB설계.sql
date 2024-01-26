# DAY18 회원가입 게시판
# 1. 데이터베이스 생성
drop database if exists java;
create database java;
use java;

# 2 (회원가입)테이블
drop table if exists member;
drop table if exists category; 
drop table if exists board;
drop table if exists comment;

create table member(
	mno int not null auto_increment,
    mid varchar(30) not null unique ,
    mpw varchar(30) not null,
    mphone char(13) not null unique,
    mdate datetime default now(),
    primary key(mno)
);

create table category( 
	cno int auto_increment,
	cname varchar(20) not null unique,
	primary key(cno)
 );


create table board(
	cno int not null,
	bno int  auto_increment,
	mno int not null,
	btitle varchar(30),
	bcontents longtext,
	bdate datetime default now(),
	bview bigint default 0,
	primary key(bno),
	foreign key(cno) references category(cno),
	foreign key(mno) references member(mno)
);

create table comment(
	bno int not null,
	cono int auto_increment,
	mno int not null,
	cocontents varchar(100),
	primary key(cono),
	foreign key(bno) references board(bno),
	foreign key(mno) references member(mno)
);

select * from member;
select * from category;
select * from board;
select * from comment;
