/*员工表*/
create table employee(
                         emp_id       int not null default 0 primary key,    /*员工ID*/
                         emp_login    varchar(50) not null,                  /*员工登录名*/
                         emp_name     varchar(50),                           /*员工姓名*/
                         emp_gender   varchar(50),                           /*员工性别*/
                         emp_password varchar(50) not null,                  /*员工密码*/
                         contact      varchar(150),                          /*联系方式*/
                         apartment_id int not null default 0,                /*部门ID*/
                         char_id      int not null default 0,                /*角色ID*/
                         leave_or_not        int not null default 0                 /*离职与否*/
);

/*新闻表*/
create table news(
                     news_id         int not null default 1 primary key, /*新闻ID*/
                     news_title      varchar(50) not null,               /*新闻标题*/
                     news_sum        varchar(200),                       /*新闻概述*/
                     news_source     varchar(30),                        /*新闻来源*/
                     public_time     datetime,                           /*发布时间*/
                     news_content    varchar(10000) not null,            /*新闻内容*/
                     news_format_id  int not null,                       /*版式ID*/
                     colume_id       int,                                /*栏目ID*/
                     news_creator_id int not null,                       /*创建人ID*/
                     state_id        int not null,                       /*状态ID*/
                     public_state_id int not null,                       /*发布状态ID*/
                     order_id        int                                 /*顺序ID*/
);

/*审核记录表*/
create table review_record(
                              review_id      int not null default 0 primary key, /*审核id*/
                              news_id        int not null default 0,             /*新闻id*/
                              submiter_id    int not null,                       /*提交人id*/
                              submiter_time  datetime,                           /*提交时间*/
                              reviewer_name  varchar(50),                        /*审核人姓名*/
                              review_time    datetime,                           /*审核时间*/
                              review_remark  varchar(800),                       /*审核意见*/
                              state_id       int not null                        /*状态id*/
);

/*图片表*/
create table pic(
                    pic_id      int not null default 0 primary key,  /*图片id*/
                    pic_des     varchar(50),                         /*图片描述*/
                    news_id     int not null default 0,              /*新闻id*/
                    pic_path    varchar(50),                         /*图片路径*/
                    pic_type    int not null default 0              /*图片类型*/
);

/*栏目表*/
create table colume(
                       colume_id   int not null default 0 primary key, /*栏目ID*/
                       colume_name varchar(50) not null,               /*栏目名称*/
                       order_id    int                                 /*顺序ID*/
);

/*管理员表*/
create table admin(
                      admin_id int not null default 0 primary key,    /*管理员id*/
                      admin_name varchar(50),                         /*管理员姓名*/
                      admin_contact varchar(50),                      /*管理员联系方式*/
                      admin_password varchar(50)                      /*管理员密码*/
);

/*角色表*/
create table chars(
                      char_id int not null default 0 primary key,     /*角色ID*/
                      char_name varchar(50),                          /*角色名称*/
                      char_permission varchar(50)                    /*角色权限*/
);

/*基本权限表*/
create table permission(
                           permission_id int not null default 0 primary key,/*权限id*/
                           permission_name varchar(50),                     /*权限名称*/
                           permission_des varchar(2000)                     /*权限描述*/
);

/*权限分配表*/
create table permission_authority(
                                     permission_id int not null primary key,         /*权限id*/
                                     emp_id int                                    /*员工ID*/
);

/*部门表*/
create table apartment(
                          apartment_id int not null default 0 primary key,/*部门ID*/
                          apartment_name varchar(50)                      /*部门名称*/
);

/*新闻状态表*/
create table news_state(
                           news_id int not null,                           /*新闻ID*/
                           news_state int                                  /*新闻状态*/
);

/*发布状态表*/
create table public_state(
                             public_state_id int not null default 0 primary key, /*发布状态ID*/
                             public_state_name varchar(50)                   /*发布状态名称*/
);