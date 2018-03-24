INSERT INTO sys_user VALUES (1,'admin','88888888','admin@mybatis.cn','管理员',null,now());
INSERT INTO sys_user VALUES (2,'test','88888888','test@mybatis.cn','测试用户',null,now());

INSERT INTO sys_role VALUES (1,'管理员',1,1,now());
INSERT INTO sys_role VALUES (2,'普通用户',1,1,now());

INSERT INTO sys_user_role VALUES (1,1);
INSERT INTO sys_user_role VALUES (1,2);
INSERT INTO sys_user_role VALUES (2,2);

INSERT INTO sys_privilege VALUES (1,'用户管理','/users');
INSERT INTO sys_privilege VALUES (2,'角色管理','/roles');
INSERT INTO sys_privilege VALUES (3,'系统日志','/logs');
INSERT INTO sys_privilege VALUES (4,'人员维护','/persons');
INSERT INTO sys_privilege VALUES (5,'单位维护','/companies');

INSERT INTO sys_role_privilege VALUES (1,1);
INSERT INTO sys_role_privilege VALUES (1,3);
INSERT INTO sys_role_privilege VALUES (1,2);
INSERT INTO sys_role_privilege VALUES (2,4);
INSERT INTO sys_role_privilege VALUES (2,5);
