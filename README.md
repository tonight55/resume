# resume
简历生成网站 resumeWeb
====
基本功能：
--------------
1、注册、登录。为了保存用户信息、及过往简历信息。<br>
2、编辑页面，当前编辑的简历信息。<br>
3、匹配简历库生成doc格式简历文件。<br>
4、简历分享功能、是否分享自己简历。<br>

实现思路：
---------
1、springboot-mybatis脚手架制作web单体项目<br>
2、Redis完成验证码和编辑页面的数据保存和分享的简历点赞和排名信息<br>
3、Jwt+springSecurity完成用户的登录和权限管理<br>
4、Mysql保存用户信息、简历信息和简历库<br>

预期难点：
-------------
 1、信息排版<br>
 2、简历库的匹配<br>
 
 初步建表：
 -----------------
 ```sql
CREATE TABLE userMap (
	`id` BIGINT ( 20 ) NOT NULL AUTO_INCREMENT,
	`username` VARCHAR ( 64 ) DEFAULT NULL,
	`password` VARCHAR ( 64 ) DEFAULT NULL,
	`phone` VARCHAR ( 100 ) DEFAULT NULL COMMENT '电话',
	`email` VARCHAR ( 100 ) DEFAULT NULL COMMENT '邮箱',
	`nick_name` VARCHAR ( 200 ) DEFAULT NULL COMMENT '昵称',
	`create_time` datetime DEFAULT NULL COMMENT '创建时间',
	PRIMARY KEY ( `id` ) 
) ENGINE = INNODB AUTO_INCREMENT = 16 DEFAULT CHARSET = utf8 COMMENT = '用户表';

CREATE TABLE resumeMap (
	`id` BIGINT ( 20 ) NOT NULL AUTO_INCREMENT,
	`User_Id` BIGINT ( 20 ) NOT NULL,
	`Name_File` VARCHAR ( 200 ) DEFAULT NULL COMMENT '文件保存路径',
	`DisplayName` VARCHAR ( 200 ) DEFAULT NULL COMMENT '文件显示的名称',
	`UploadDate` VARCHAR ( 200 ) DEFAULT NULL COMMENT '文件导入时间',

	PRIMARY KEY ( `id` ),
  FOREIGN KEY ( User_Id ) REFERENCES userMap ( id ) 
	) ENGINE = INNODB AUTO_INCREMENT = 16 DEFAULT CHARSET = utf8 COMMENT = '简历表';
	
	CREATE TABLE resumeModel (
	`id` BIGINT ( 20 ) NOT NULL AUTO_INCREMENT,
	`Name_File` VARCHAR ( 200 ) DEFAULT NULL COMMENT '文件保存路径',
	`DisplayName` VARCHAR ( 200 ) DEFAULT NULL COMMENT '文件显示的名称',
	`UploadDate` VARCHAR ( 200 ) DEFAULT NULL COMMENT '文件导入时间',

	PRIMARY KEY ( `id` )
	) ENGINE = INNODB AUTO_INCREMENT = 16 DEFAULT CHARSET = utf8 COMMENT = '简历模板表';
	
	CREATE TABLE resumeShare (
	`id` BIGINT ( 20 ) NOT NULL AUTO_INCREMENT,
	`User_Id` BIGINT ( 20 ) NOT NULL ,
	`Resume_Id` BIGINT ( 20 ) NOT NULL ,

	PRIMARY KEY ( `id` ),
  FOREIGN KEY ( User_Id ) REFERENCES userMap ( id ) ,
  FOREIGN KEY ( Resume_Id ) REFERENCES resumeMap ( id ) ,
	
	) ENGINE = INNODB AUTO_INCREMENT = 16 DEFAULT CHARSET = utf8 COMMENT = '简历分享表';
	

    
    
	
	

	
	
 
 
