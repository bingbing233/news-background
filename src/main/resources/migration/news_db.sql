create table if not exists admin
(
    admin_id int default 0 not null
        primary key,
    admin_name varchar(50) null,
    admin_contact varchar(50) null,
    admin_password varchar(50) null
);

create table if not exists apartment
(
    apartment_id int default 0 not null
        primary key,
    apartment_name varchar(50) null
);

create table if not exists chars
(
    char_id int default 0 not null
        primary key,
    char_name varchar(50) null,
    char_permission varchar(50) null
);

create table if not exists colume
(
    colume_id int auto_increment,
    colume_name varchar(50) not null,
    constraint colume_colume_id_uindex
        unique (colume_id)
);

alter table colume
    add primary key (colume_id);

create table if not exists employee
(
    emp_id int default 0 not null
        primary key,
    emp_login varchar(50) not null,
    emp_name varchar(50) null,
    emp_gender varchar(50) null,
    emp_password varchar(50) not null,
    contact varchar(150) null,
    apartment_id int default 0 not null,
    char_id int default 0 not null,
    leave_or_not int default 0 not null
);

create table if not exists news
(
    news_id int auto_increment,
    news_title varchar(50) not null,
    news_sum varchar(200) null,
    news_source varchar(30) null,
    public_time datetime null,
    news_content varchar(10000) not null,
    news_format_id int not null,
    colume_id int null,
    news_creator_id int not null,
    public_state_id int not null,
    constraint news_news_id_uindex
        unique (news_id)
);

alter table news
    add primary key (news_id);

create table if not exists news_state
(
    news_id int not null,
    news_state int null
);

create table if not exists permission
(
    permission_id int default 0 not null
        primary key,
    permission_name varchar(50) null,
    permission_des varchar(2000) null
);

create table if not exists permission_authority
(
    permission_id int not null
        primary key,
    emp_id int null
);

create table if not exists pic
(
    pic_id int default 0 not null
        primary key,
    pic_des varchar(50) null,
    news_id int default 0 not null,
    pic_path varchar(50) null,
    pic_type int default 0 not null
);

create table if not exists public_state
(
    public_state_id int default 0 not null
        primary key,
    public_state_name varchar(50) null
);

create table if not exists review_record
(
    review_id int default 0 not null
        primary key,
    news_id int default 0 not null,
    submiter_id int not null,
    submiter_time datetime null,
    reviewer_name varchar(50) null,
    review_time datetime null,
    review_remark varchar(800) null,
    state_id int not null
);

