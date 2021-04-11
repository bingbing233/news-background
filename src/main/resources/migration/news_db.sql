create table admin
(
    admin_id       int auto_increment,
    admin_name     varchar(50) null,
    admin_contact  varchar(50) null,
    admin_password varchar(50) null,
    admin_type     varchar(50) null,
    constraint admin_admin_id_uindex
        unique (admin_id)
);

create table apartment
(
    apartment_id   int default 0 not null
        primary key,
    apartment_name varchar(50)   null
);

create table chars
(
    char_id         int default 0 not null
        primary key,
    char_name       varchar(50)   null,
    char_permission varchar(50)   null
);

create table `column`
(
    column_id   int auto_increment,
    column_name varchar(100) null,
    constraint column_column_id_uindex
        unique (column_id)
);

create table emp
(
    emp_id        int auto_increment
        primary key,
    emp_name      varchar(50) null,
    emp_password  varchar(50) null,
    emp_gender    varchar(10) null,
    emp_phone     varchar(50) null,
    emp_apartment varchar(50) null,
    emp_role      varchar(50) null
)
    comment '员工表';

create table news
(
    news_id           int auto_increment,
    news_title        varchar(50)    not null,
    news_sum          varchar(200)   null,
    news_source       varchar(30)    null,
    news_public_time  datetime       null,
    news_content      varchar(10000) not null,
    news_column       varchar(20)    null,
    news_creator      varchar(20)    not null,
    news_public_state varchar(20)    not null,
    news_pic_url      varchar(200)   null,
    constraint news_news_id_uindex
        unique (news_id)
);

create table news_content
(
    news_content_id   int auto_increment,
    news_id           int            not null,
    news_content_text varchar(10000) null,
    news_pic_url      varchar(200)   null,
    constraint news_content_news_content_id_uindex
        unique (news_content_id)
)
    comment '用于记录新闻对应内容和图片url';

create table permission
(
    permission_id   int auto_increment,
    permission_name varchar(50)   null,
    permission_des  varchar(2000) null,
    permission_rule varchar(100)  null,
    constraint permission_permission_id_uindex
        unique (permission_id)
);

create table permission_authority
(
    permission_id int not null
        primary key,
    emp_id        int null
);

create table public_state
(
    public_state_id   int auto_increment,
    public_state_name varchar(50) null,
    constraint public_state_public_state_id_uindex
        unique (public_state_id)
);

create table review_record
(
    review_id     int default 0 not null
        primary key,
    news_id       int default 0 not null,
    submiter_id   int           not null,
    submiter_time datetime      null,
    reviewer_name varchar(50)   null,
    review_time   datetime      null,
    review_remark varchar(800)  null,
    state_id      int           not null
);

