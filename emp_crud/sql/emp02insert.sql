-- emp02insert
-- execute emp02insert(5555,'홍길동',5000); cmd에서 프로시저 실행방법
create or replace procedure emp02insert
(
	v_sabun emp02.sabun%type,
	v_name emp02.name%type,
	v_pay emp02.pay%type
)
is

begin
	insert into emp02 values(v_sabun, v_name, sysdate, v_pay);
	commit;
end;
/