create or replace table member
(
    id         bigint auto_increment
        primary key,
    email      varchar(1000)                        not null,
    password   varchar(1000)                        not null,
    name       varchar(255)                         not null,
    created_at datetime default current_timestamp() not null,
    updated_at datetime                             null,
    deleted_at datetime                             null,
    constraint member_email_uindex
        unique (email) /*using hash*/
);

create or replace table board
(
    id          bigint auto_increment
        primary key,
    member_id   bigint                               null,
    member_name varchar(255)                         null,
    title       varchar(1000)                        not null,
    content     longtext                             null,
    created_at  datetime default current_timestamp() not null,
    modified_at datetime                             null,
    deleted_at  datetime                             null,
    constraint board_member_id_fk
        foreign key (member_id) references member (id)
);

create or replace table board_comment
(
    id                bigint auto_increment
        primary key,
    board_id          bigint                               not null,
    parent_comment_id bigint                               null,
    member_id         bigint                               null,
    member_name       bigint                               null,
    content           text                                 not null,
    created_at        datetime default current_timestamp() not null,
    updated_at        datetime                             null,
    deleted_at        int                                  null,
    constraint board_comment_board_id_fk
        foreign key (board_id) references board (id),
    constraint board_comment_member_id_fk
        foreign key (member_id) references member (id)
);

