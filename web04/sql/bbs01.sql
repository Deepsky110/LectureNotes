drop table bbs01;
drop sequence bbs01_seq;
-- 다시 실행하면 초기화 될 수 있도록, 최초 실행시 오류는 무시하면 됨
create table bbs01(
	num number primary key,
	sub varchar2(30) default '제목없음',
	nalja date,
	id varchar2(30),
	cntnt varchar2(2000),
-- 답글 설정
	ref number, -- 참조할 번호, 첫글 0
	no number, -- 재정렬의 기준, 첫글 0 답글 1부터
	lev number --답글 제목 들여쓰기 정도
);
create sequence bbs01_seq;
--dummy data

commit;