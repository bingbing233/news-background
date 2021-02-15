-- we don't know how to generate database NEWS (class Database) :(
create table NEWS
(
    NEWS_ID INT auto_increment
        primary key,
    TITLE VARCHAR(50) not null,
    SUM VARCHAR(10000),
    SOURCE VARCHAR(30),
    PUBLIC_TIME LONG,
    CONTENT VARCHAR(100000) not null,
    FORMAT_ID INT not null,
    COLUMN_ID INT,
    CREATOR_ID INT not null,
    STATE_ID INT not null,
    PUBLIC_STATE_ID INT not null,
    ORDER_ID INT,
    PIC_PATH VARCHAR(1000)
);

create unique index NEWS_TITLE_UINDEX
	on NEWS (TITLE);

create table NEWS_STATE
(
    NEWS_ID INT auto_increment,
    NEWS_STATE INT
);

create unique index NEWS_STATE_NEWS_ID_UINDEX
	on NEWS_STATE (NEWS_ID);

alter table NEWS_STATE
    add constraint NEWS_STATE_PK
        primary key (NEWS_ID);

create table PUBLIC_STATE
(
    PUBLIC_STATE_ID INT auto_increment
        primary key,
    PUBLIC_STATE_NAME VARCHAR(50)
);

create table EMPLOYEE
(
    EMP_ID INT auto_increment
        primary key,
    EMP_LOGIN VARCHAR(50) not null,
    EMP_NAME VARCHAR(50),
    EMP_GENDER VARCHAR(50),
    EMP_PASSWORD VARCHAR(50) not null,
    CONTACT VARCHAR(150),
    APARTMENT_ID INT default 0 not null,
    CHAR_ID INT default 0 not null,
    LEAVE_OR_NOT INT default 0 not null
);

create table ADMIN
(
    ADMIN_ID INT auto_increment
        primary key,
    ADMIN_NAME VARCHAR(50),
    ADMIN_CONTACT VARCHAR(50),
    ADMIN_PASSWORD VARCHAR(50)
);

create unique index ADMIN_ADMIN_NAME_UINDEX
	on ADMIN (ADMIN_NAME);

create table COLUME
(
    COLUME_ID INT auto_increment
        primary key,
    COLUME_NAME VARCHAR(50) not null,
    ORDER_ID INT
);

create table PERMISSION_AUTHORITY
(
    PERMISSION_ID INT auto_increment
        primary key,
    EMP_ID INT
);

create table PIC
(
    PIC_ID INT auto_increment
        primary key,
    PIC_DES VARCHAR(50),
    NEWS_ID INT default 0 not null,
    PIC_PATH VARCHAR(50),
    PIC_TYPE INT default 0 not null
);

create table CHARS
(
    CHAR_ID INT default 0 not null
        primary key,
    CHAR_NAME VARCHAR(50),
    CHAR_PERMISSION VARCHAR(50)
);

create table REVIEW_RECORD
(
    REVIEW_ID INT auto_increment
        primary key,
    NEWS_ID INT default 0 not null,
    SUBMITTER_ID INT not null,
    SUBMIT_TIME DATETIME,
    REVIEWER_NAME VARCHAR(50),
    REVIEW_TIME DATETIME,
    REVIEW_REMARK VARCHAR(800),
    STATE_ID INT not null
);

create table APARTMENT
(
    APARTMENT_ID INT default 0 not null
        primary key,
    APARTMENT_NAME VARCHAR(50)
);

create table PERMISSION
(
    PERMISSION_ID INT auto_increment
        primary key,
    PERMISSION_NAME VARCHAR(50),
    PERMISSION_DES VARCHAR(2000)
);

create table INFORMATION_SCHEMA.CATALOGS
(
    CATALOG_NAME VARCHAR
);

create table INFORMATION_SCHEMA.COLLATIONS
(
    NAME VARCHAR,
    KEY VARCHAR
);

create table INFORMATION_SCHEMA.COLUMNS
(
    TABLE_CATALOG VARCHAR,
    TABLE_SCHEMA VARCHAR,
    TABLE_NAME VARCHAR,
    COLUMN_NAME VARCHAR,
    ORDINAL_POSITION INTEGER,
    DOMAIN_CATALOG VARCHAR,
    DOMAIN_SCHEMA VARCHAR,
    DOMAIN_NAME VARCHAR,
    COLUMN_DEFAULT VARCHAR,
    IS_NULLABLE VARCHAR,
    DATA_TYPE INTEGER,
    CHARACTER_MAXIMUM_LENGTH INTEGER,
    CHARACTER_OCTET_LENGTH INTEGER,
    NUMERIC_PRECISION INTEGER,
    NUMERIC_PRECISION_RADIX INTEGER,
    NUMERIC_SCALE INTEGER,
    DATETIME_PRECISION INTEGER,
    INTERVAL_TYPE VARCHAR,
    INTERVAL_PRECISION INTEGER,
    CHARACTER_SET_NAME VARCHAR,
    COLLATION_NAME VARCHAR,
    TYPE_NAME VARCHAR,
    NULLABLE INTEGER,
    IS_COMPUTED BOOLEAN,
    SELECTIVITY INTEGER,
    CHECK_CONSTRAINT VARCHAR,
    SEQUENCE_NAME VARCHAR,
    REMARKS VARCHAR,
    SOURCE_DATA_TYPE SMALLINT,
    COLUMN_TYPE VARCHAR,
    COLUMN_ON_UPDATE VARCHAR,
    IS_VISIBLE VARCHAR
);

create table INFORMATION_SCHEMA.COLUMN_PRIVILEGES
(
    GRANTOR VARCHAR,
    GRANTEE VARCHAR,
    TABLE_CATALOG VARCHAR,
    TABLE_SCHEMA VARCHAR,
    TABLE_NAME VARCHAR,
    COLUMN_NAME VARCHAR,
    PRIVILEGE_TYPE VARCHAR,
    IS_GRANTABLE VARCHAR
);

create table INFORMATION_SCHEMA.CONSTANTS
(
    CONSTANT_CATALOG VARCHAR,
    CONSTANT_SCHEMA VARCHAR,
    CONSTANT_NAME VARCHAR,
    DATA_TYPE INTEGER,
    REMARKS VARCHAR,
    SQL VARCHAR,
    ID INTEGER
);

create table INFORMATION_SCHEMA.CONSTRAINTS
(
    CONSTRAINT_CATALOG VARCHAR,
    CONSTRAINT_SCHEMA VARCHAR,
    CONSTRAINT_NAME VARCHAR,
    CONSTRAINT_TYPE VARCHAR,
    TABLE_CATALOG VARCHAR,
    TABLE_SCHEMA VARCHAR,
    TABLE_NAME VARCHAR,
    UNIQUE_INDEX_NAME VARCHAR,
    CHECK_EXPRESSION VARCHAR,
    COLUMN_LIST VARCHAR,
    REMARKS VARCHAR,
    SQL VARCHAR,
    ID INTEGER
);

create table INFORMATION_SCHEMA.CROSS_REFERENCES
(
    PKTABLE_CATALOG VARCHAR,
    PKTABLE_SCHEMA VARCHAR,
    PKTABLE_NAME VARCHAR,
    PKCOLUMN_NAME VARCHAR,
    FKTABLE_CATALOG VARCHAR,
    FKTABLE_SCHEMA VARCHAR,
    FKTABLE_NAME VARCHAR,
    FKCOLUMN_NAME VARCHAR,
    ORDINAL_POSITION SMALLINT,
    UPDATE_RULE SMALLINT,
    DELETE_RULE SMALLINT,
    FK_NAME VARCHAR,
    PK_NAME VARCHAR,
    DEFERRABILITY SMALLINT
);

create table INFORMATION_SCHEMA.DOMAINS
(
    DOMAIN_CATALOG VARCHAR,
    DOMAIN_SCHEMA VARCHAR,
    DOMAIN_NAME VARCHAR,
    COLUMN_DEFAULT VARCHAR,
    IS_NULLABLE VARCHAR,
    DATA_TYPE INTEGER,
    PRECISION INTEGER,
    SCALE INTEGER,
    TYPE_NAME VARCHAR,
    SELECTIVITY INTEGER,
    CHECK_CONSTRAINT VARCHAR,
    REMARKS VARCHAR,
    SQL VARCHAR,
    ID INTEGER
);

create table INFORMATION_SCHEMA.FUNCTION_ALIASES
(
    ALIAS_CATALOG VARCHAR,
    ALIAS_SCHEMA VARCHAR,
    ALIAS_NAME VARCHAR,
    JAVA_CLASS VARCHAR,
    JAVA_METHOD VARCHAR,
    DATA_TYPE INTEGER,
    TYPE_NAME VARCHAR,
    COLUMN_COUNT INTEGER,
    RETURNS_RESULT SMALLINT,
    REMARKS VARCHAR,
    ID INTEGER,
    SOURCE VARCHAR
);

create table INFORMATION_SCHEMA.FUNCTION_COLUMNS
(
    ALIAS_CATALOG VARCHAR,
    ALIAS_SCHEMA VARCHAR,
    ALIAS_NAME VARCHAR,
    JAVA_CLASS VARCHAR,
    JAVA_METHOD VARCHAR,
    COLUMN_COUNT INTEGER,
    POS INTEGER,
    COLUMN_NAME VARCHAR,
    DATA_TYPE INTEGER,
    TYPE_NAME VARCHAR,
    PRECISION INTEGER,
    SCALE SMALLINT,
    RADIX SMALLINT,
    NULLABLE SMALLINT,
    COLUMN_TYPE SMALLINT,
    REMARKS VARCHAR,
    COLUMN_DEFAULT VARCHAR
);

create table INFORMATION_SCHEMA.HELP
(
    ID INTEGER,
    SECTION VARCHAR,
    TOPIC VARCHAR,
    SYNTAX VARCHAR,
    TEXT VARCHAR
);

create table INFORMATION_SCHEMA.INDEXES
(
    TABLE_CATALOG VARCHAR,
    TABLE_SCHEMA VARCHAR,
    TABLE_NAME VARCHAR,
    NON_UNIQUE BOOLEAN,
    INDEX_NAME VARCHAR,
    ORDINAL_POSITION SMALLINT,
    COLUMN_NAME VARCHAR,
    CARDINALITY INTEGER,
    PRIMARY_KEY BOOLEAN,
    INDEX_TYPE_NAME VARCHAR,
    IS_GENERATED BOOLEAN,
    INDEX_TYPE SMALLINT,
    ASC_OR_DESC VARCHAR,
    PAGES INTEGER,
    FILTER_CONDITION VARCHAR,
    REMARKS VARCHAR,
    SQL VARCHAR,
    ID INTEGER,
    SORT_TYPE INTEGER,
    CONSTRAINT_NAME VARCHAR,
    INDEX_CLASS VARCHAR,
    AFFINITY BOOLEAN
);

create table INFORMATION_SCHEMA.IN_DOUBT
(
    TRANSACTION VARCHAR,
    STATE VARCHAR
);

create table INFORMATION_SCHEMA.KEY_COLUMN_USAGE
(
    CONSTRAINT_CATALOG VARCHAR,
    CONSTRAINT_SCHEMA VARCHAR,
    CONSTRAINT_NAME VARCHAR,
    TABLE_CATALOG VARCHAR,
    TABLE_SCHEMA VARCHAR,
    TABLE_NAME VARCHAR,
    COLUMN_NAME VARCHAR,
    ORDINAL_POSITION INTEGER,
    POSITION_IN_UNIQUE_CONSTRAINT INTEGER
);

create table INFORMATION_SCHEMA.LOCKS
(
    TABLE_SCHEMA VARCHAR,
    TABLE_NAME VARCHAR,
    SESSION_ID INTEGER,
    LOCK_TYPE VARCHAR
);

create table INFORMATION_SCHEMA.QUERY_STATISTICS
(
    SQL_STATEMENT VARCHAR,
    EXECUTION_COUNT INTEGER,
    MIN_EXECUTION_TIME DOUBLE,
    MAX_EXECUTION_TIME DOUBLE,
    CUMULATIVE_EXECUTION_TIME DOUBLE,
    AVERAGE_EXECUTION_TIME DOUBLE,
    STD_DEV_EXECUTION_TIME DOUBLE,
    MIN_ROW_COUNT INTEGER,
    MAX_ROW_COUNT INTEGER,
    CUMULATIVE_ROW_COUNT BIGINT,
    AVERAGE_ROW_COUNT DOUBLE,
    STD_DEV_ROW_COUNT DOUBLE
);

create table INFORMATION_SCHEMA.REFERENTIAL_CONSTRAINTS
(
    CONSTRAINT_CATALOG VARCHAR,
    CONSTRAINT_SCHEMA VARCHAR,
    CONSTRAINT_NAME VARCHAR,
    UNIQUE_CONSTRAINT_CATALOG VARCHAR,
    UNIQUE_CONSTRAINT_SCHEMA VARCHAR,
    UNIQUE_CONSTRAINT_NAME VARCHAR,
    MATCH_OPTION VARCHAR,
    UPDATE_RULE VARCHAR,
    DELETE_RULE VARCHAR
);

create table INFORMATION_SCHEMA.RIGHTS
(
    GRANTEE VARCHAR,
    GRANTEETYPE VARCHAR,
    GRANTEDROLE VARCHAR,
    RIGHTS VARCHAR,
    TABLE_SCHEMA VARCHAR,
    TABLE_NAME VARCHAR,
    ID INTEGER
);

create table INFORMATION_SCHEMA.ROLES
(
    NAME VARCHAR,
    REMARKS VARCHAR,
    ID INTEGER
);

create table INFORMATION_SCHEMA.SCHEMATA
(
    CATALOG_NAME VARCHAR,
    SCHEMA_NAME VARCHAR,
    SCHEMA_OWNER VARCHAR,
    DEFAULT_CHARACTER_SET_NAME VARCHAR,
    DEFAULT_COLLATION_NAME VARCHAR,
    IS_DEFAULT BOOLEAN,
    REMARKS VARCHAR,
    ID INTEGER
);

create table INFORMATION_SCHEMA.SEQUENCES
(
    SEQUENCE_CATALOG VARCHAR,
    SEQUENCE_SCHEMA VARCHAR,
    SEQUENCE_NAME VARCHAR,
    CURRENT_VALUE BIGINT,
    INCREMENT BIGINT,
    IS_GENERATED BOOLEAN,
    REMARKS VARCHAR,
    CACHE BIGINT,
    MIN_VALUE BIGINT,
    MAX_VALUE BIGINT,
    IS_CYCLE BOOLEAN,
    ID INTEGER
);

create table INFORMATION_SCHEMA.SESSIONS
(
    ID INTEGER,
    USER_NAME VARCHAR,
    SERVER VARCHAR,
    CLIENT_ADDR VARCHAR,
    CLIENT_INFO VARCHAR,
    SESSION_START TIMESTAMP(9, 0),
	ISOLATION_LEVEL VARCHAR,
	STATEMENT VARCHAR,
	STATEMENT_START TIMESTAMP(9, 0),
	CONTAINS_UNCOMMITTED BOOLEAN,
	STATE VARCHAR,
	BLOCKER_ID INTEGER
);

create table INFORMATION_SCHEMA.SESSION_STATE
(
    KEY VARCHAR,
    SQL VARCHAR
);

create table INFORMATION_SCHEMA.SETTINGS
(
    NAME VARCHAR,
    VALUE VARCHAR
);

create table INFORMATION_SCHEMA.SYNONYMS
(
    SYNONYM_CATALOG VARCHAR,
    SYNONYM_SCHEMA VARCHAR,
    SYNONYM_NAME VARCHAR,
    SYNONYM_FOR VARCHAR,
    SYNONYM_FOR_SCHEMA VARCHAR,
    TYPE_NAME VARCHAR,
    STATUS VARCHAR,
    REMARKS VARCHAR,
    ID INTEGER
);

create table INFORMATION_SCHEMA.TABLES
(
    TABLE_CATALOG VARCHAR,
    TABLE_SCHEMA VARCHAR,
    TABLE_NAME VARCHAR,
    TABLE_TYPE VARCHAR,
    STORAGE_TYPE VARCHAR,
    SQL VARCHAR,
    REMARKS VARCHAR,
    LAST_MODIFICATION BIGINT,
    ID INTEGER,
    TYPE_NAME VARCHAR,
    TABLE_CLASS VARCHAR,
    ROW_COUNT_ESTIMATE BIGINT
);

create table INFORMATION_SCHEMA.TABLE_CONSTRAINTS
(
    CONSTRAINT_CATALOG VARCHAR,
    CONSTRAINT_SCHEMA VARCHAR,
    CONSTRAINT_NAME VARCHAR,
    CONSTRAINT_TYPE VARCHAR,
    TABLE_CATALOG VARCHAR,
    TABLE_SCHEMA VARCHAR,
    TABLE_NAME VARCHAR,
    IS_DEFERRABLE VARCHAR,
    INITIALLY_DEFERRED VARCHAR
);

create table INFORMATION_SCHEMA.TABLE_PRIVILEGES
(
    GRANTOR VARCHAR,
    GRANTEE VARCHAR,
    TABLE_CATALOG VARCHAR,
    TABLE_SCHEMA VARCHAR,
    TABLE_NAME VARCHAR,
    PRIVILEGE_TYPE VARCHAR,
    IS_GRANTABLE VARCHAR
);

create table INFORMATION_SCHEMA.TABLE_TYPES
(
    TYPE VARCHAR
);

create table INFORMATION_SCHEMA.TRIGGERS
(
    TRIGGER_CATALOG VARCHAR,
    TRIGGER_SCHEMA VARCHAR,
    TRIGGER_NAME VARCHAR,
    TRIGGER_TYPE VARCHAR,
    TABLE_CATALOG VARCHAR,
    TABLE_SCHEMA VARCHAR,
    TABLE_NAME VARCHAR,
    BEFORE BOOLEAN,
    JAVA_CLASS VARCHAR,
    QUEUE_SIZE INTEGER,
    NO_WAIT BOOLEAN,
    REMARKS VARCHAR,
    SQL VARCHAR,
    ID INTEGER
);

create table INFORMATION_SCHEMA.TYPE_INFO
(
    TYPE_NAME VARCHAR,
    DATA_TYPE INTEGER,
    PRECISION INTEGER,
    PREFIX VARCHAR,
    SUFFIX VARCHAR,
    PARAMS VARCHAR,
    AUTO_INCREMENT BOOLEAN,
    MINIMUM_SCALE SMALLINT,
    MAXIMUM_SCALE SMALLINT,
    RADIX INTEGER,
    POS INTEGER,
    CASE_SENSITIVE BOOLEAN,
    NULLABLE SMALLINT,
    SEARCHABLE SMALLINT
);

create table INFORMATION_SCHEMA.USERS
(
    NAME VARCHAR,
    ADMIN VARCHAR,
    REMARKS VARCHAR,
    ID INTEGER
);

create table INFORMATION_SCHEMA.VIEWS
(
    TABLE_CATALOG VARCHAR,
    TABLE_SCHEMA VARCHAR,
    TABLE_NAME VARCHAR,
    VIEW_DEFINITION VARCHAR,
    CHECK_OPTION VARCHAR,
    IS_UPDATABLE VARCHAR,
    STATUS VARCHAR,
    REMARKS VARCHAR,
    ID INTEGER
);
