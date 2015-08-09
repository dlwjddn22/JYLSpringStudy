/* 프로그램 메뉴 */
CREATE TABLE menu (
	Menu_Cd VARCHAR2(15) NOT NULL, /* 메뉴id */
	Menu_Nm CHAR(1), /* 메뉴이름 */
	Upper_Menu_Cd VARCHAR2(30), /* 상위메뉴ID */
	Program_Id CHAR(7), /* 프로그램ID */
	Image_Nm VARCHAR2(60), /* 이미지name */
	Use_Sec CHAR(1), /* 사용유무 */
	Display_No CHAR(2), /* 메뉴순서 */
	insrt_user_id VARCHAR2(13), /* 등록자 */
	insrt_dt VARCHAR2(20), /* 등록일 */
	updt_user_id VARCHAR2(13), /* 변경자 */
	updt_dt VARCHAR2(20) /* 변경일 */
);

COMMENT ON TABLE menu IS '프로그램 메뉴';

COMMENT ON COLUMN menu.Menu_Cd IS '메뉴id';

COMMENT ON COLUMN menu.Menu_Nm IS '메뉴이름';

COMMENT ON COLUMN menu.Upper_Menu_Cd IS '상위메뉴ID';

COMMENT ON COLUMN menu.Program_Id IS '프로그램ID';

COMMENT ON COLUMN menu.Image_Nm IS '이미지name';

COMMENT ON COLUMN menu.Use_Sec IS '사용유무';

COMMENT ON COLUMN menu.Display_No IS '메뉴순서';

COMMENT ON COLUMN menu.insrt_user_id IS '등록자';

COMMENT ON COLUMN menu.insrt_dt IS '등록일';

COMMENT ON COLUMN menu.updt_user_id IS '변경자';

COMMENT ON COLUMN menu.updt_dt IS '변경일';

CREATE UNIQUE INDEX PK_menu
	ON menu (
		Menu_Cd ASC
	);

ALTER TABLE menu
	ADD
		CONSTRAINT PK_menu
		PRIMARY KEY (
			Menu_Cd
		);

/* 사용자관리 */
CREATE TABLE member (
	usr_id VARCHAR2(13) NOT NULL, /* 사용자ID */
	usr_nm VARCHAR2(30), /* 사용자명 */
	usr_eng_nm VARCHAR2(50), /* 영어명 */
	usr_valid_dt VARCHAR2(8), /* 사용자유효일 */
	pwd VARCHAR2(20), /* 비밀번호 */
	pwd_valid_dt VARCHAR2(8), /* 비밀번호유효일 */
	logon_gp CHAR(30), /* 로그온 그룹 */
	co_cd VARCHAR2(10), /* 회사 */
	use_yn CHAR(1), /* 현재사용여부 */
	usr_gp CHAR(5), /* 사용자그룹 */
	col1 VARCHAR2(30), /* 임시 칼럼1 */
	col2 VARCHAR2(30), /* 임시 칼럼2 */
	col3 VARCHAR2(30), /* 임시 칼럼3 */
	col4 VARCHAR2(30), /* 임시 칼럼4 */
	insrt_user_id VARCHAR2(13), /* 등록자 */
	insrt_dt VARCHAR2(20), /* 등록일 */
	updt_user_id VARCHAR2(13), /* 변경자 */
	updt_dt VARCHAR2(20) /* 변경일 */
);

COMMENT ON TABLE member IS '사용자관리';

COMMENT ON COLUMN member.usr_id IS '사용자ID';

COMMENT ON COLUMN member.usr_nm IS '사용자명';

COMMENT ON COLUMN member.usr_eng_nm IS '영어명';

COMMENT ON COLUMN member.usr_valid_dt IS '사용자유효일';

COMMENT ON COLUMN member.pwd IS '비밀번호';

COMMENT ON COLUMN member.pwd_valid_dt IS '비밀번호유효일';

COMMENT ON COLUMN member.logon_gp IS '로그온 그룹';

COMMENT ON COLUMN member.co_cd IS '회사';

COMMENT ON COLUMN member.use_yn IS '현재사용여부';

COMMENT ON COLUMN member.usr_gp IS '사용자그룹';

COMMENT ON COLUMN member.col1 IS '임시 칼럼1';

COMMENT ON COLUMN member.col2 IS '임시 칼럼2';

COMMENT ON COLUMN member.col3 IS '임시 칼럼3';

COMMENT ON COLUMN member.col4 IS '임시 칼럼4';

COMMENT ON COLUMN member.insrt_user_id IS '등록자';

COMMENT ON COLUMN member.insrt_dt IS '등록일';

COMMENT ON COLUMN member.updt_user_id IS '변경자';

COMMENT ON COLUMN member.updt_dt IS '변경일';

CREATE UNIQUE INDEX PK_member
	ON member (
		usr_id ASC
	);

ALTER TABLE member
	ADD
		CONSTRAINT PK_member
		PRIMARY KEY (
			usr_id
		);
		
		
		
insert into member ( usr_id, usr_nm, pwd ) values ( 'dlwjddn22', '이정우', '1234');
insert into member ( usr_id, usr_nm, pwd ) values ( 'abcd', '이정우1', '1234');
insert into member ( usr_id, usr_nm, pwd ) values ( 'efgh', '이정우2', '1234');
