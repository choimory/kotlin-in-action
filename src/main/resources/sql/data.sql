insert into member (id, email, password, name, created_at, updated_at, deleted_at)
values (1, 'choimory@naver.com', 'qwe123!@#', '중윤최', '2020-01-01 01:01:01', null, null);

insert into board (id, member_id, member_name, title, content, created_at, updated_at, deleted_at)
values (1, 1, null, '제목', '내용', '2020-01-01 01:01:01', null, null);