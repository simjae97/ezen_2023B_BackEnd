/*# 1. 제약조건에 이름 달기. (제약조건 이름을 부여해서 식별용) 생략시 자동 이름 부여
	# 1. constraint 제약조건명 primary keyI(속성명)
    # 2. constraint 제약조건명 foreign key(속성명) references 참조테이블명(참조속성명)
# 2.제약조건 무결성 옵션 성정
	# 무결성 : 데이터의 정확성,일관성, 유효성을 유지
    constraint 제약조건명
    foreign key (fk필드명)
    references 참조할테이블(참조할pk필드명)
    (무결성옵션)
    on [DELETE/UPDATE] [RESTRICT / CASCADE / SET NULL / NO ACTION]
    #on delete restrict 기본값 = pk-fk 데이터가 서로 참조하는 데이터가 존재하면 취소 
    on delete cascade : pk-fk데이터가 서로 참조하고있는 데이터가 존재하면 같이 삭제
	on delete set null
    */
drop database if exists test7;

create database test7;

use test7;

# 1. 회원 테이블
create table member(
		mno int auto_increment,
        mid varchar(30),
        mpw varchar(30),
        constraint member_mno_pk primary key(mno)
);
# 2. 게시판 테이블
create table board(
	bno int auto_increment, btitle text, bcontent text,
    mno int,
    primary key(bno) ,
    foreign key(mno) references member(mno) on delete set null 
    #on update cascade
    on update set null
    #on delete restrict 기본값 = pk-fk 데이터가 서로 참조하는 데이터가 존재하면 취소 
);


# 3 샘플
insert into member(mid,mpw) values("ezen01","1234");
insert into member(mid,mpw) values("ezen02","1234");
insert into member(mid,mpw) values("ezen03","1234");
insert into board(btitle,bcontent,mno) values("안녕","자바",1);

select * from board;
select * from member;

delete from member where mno = 1;  

select * from member natural join board;
select * from member join board on member.mno = board.mno;
select * from member join board using(mno);
select * from member inner join board on member.mno = board.mno;

select * from member left outer join board on member.mno = board.mno;
select * from member right outer join board on member.mno = board.mno;
select * from member full outer join board on member.mno = board.mno;
select * from member cross join board;
