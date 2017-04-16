
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE IF NOT EXISTS `t_user` (
  `f_id` varchar(32) NOT NULL COMMENT 'userId',
  `f_user_name` varchar(100) NOT NULL COMMENT '用户名',
  `f_real_name` varchar(100) DEFAULT NULL COMMENT '真实姓名',
  `f_id_card` varchar(20) DEFAULT NULL COMMENT '身份证号',
  `f_pay_pwd` varchar(100) DEFAULT NULL COMMENT '支付密码',
  `f_mobile` varchar(16) DEFAULT NULL COMMENT '手机号',
  `f_state` tinyint(4) NOT NULL DEFAULT '1' COMMENT '当前状态，1正常，2禁止登录',
  `f_last_pwdmod_time` datetime DEFAULT NULL COMMENT '最近修改密码时间',
  `f_device_id` varchar(255) DEFAULT NULL COMMENT '设备Id',
  `f_wechat_open_id` varchar(100) DEFAULT NULL COMMENT '微信openId',
  `f_sys_add_time` datetime DEFAULT NULL COMMENT '新增时间',
  `f_sys_upd_time` datetime DEFAULT NULL COMMENT '修改时间',
  `f_sys_del_time` datetime DEFAULT NULL COMMENT '删除时间',
  `f_sys_add_user` varchar(32) DEFAULT NULL COMMENT '新增人',
  `f_sys_upd_user` varchar(32) DEFAULT NULL COMMENT '修改人',
  `f_sys_del_user` varchar(32) DEFAULT NULL COMMENT '删除人',
  `f_sys_del_state` tinyint(1) NOT NULL DEFAULT '0' COMMENT '删除状态',
  PRIMARY KEY (`f_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';


DROP TABLE IF EXISTS `t_role`;
CREATE TABLE IF NOT EXISTS `t_role` (
  `f_id` varchar(32) NOT NULL COMMENT 'roleId',
  `f_role_name` varchar(100) NOT NULL COMMENT '角色名称',
  `f_role_code` varchar(100) NOT NULL COMMENT '角色代码',
  `f_role_desc` varchar(100) NOT NULL COMMENT '角色描述',
  `f_system_code` varchar(32) NOT NULL COMMENT '系统code',
  `f_role_state` tinyint(4) NOT NULL COMMENT '状态，1启用，2禁用',
  `f_sys_add_time` datetime DEFAULT NULL COMMENT '新增时间',
  `f_sys_upd_time` datetime DEFAULT NULL COMMENT '修改时间',
  `f_sys_del_time` datetime DEFAULT NULL COMMENT '删除时间',
  `f_sys_add_user` varchar(32) DEFAULT NULL COMMENT '新增人',
  `f_sys_upd_user` varchar(32) DEFAULT NULL COMMENT '修改人',
  `f_sys_del_user` varchar(32) DEFAULT NULL COMMENT '删除人',
  `f_sys_del_state` tinyint(1) NOT NULL DEFAULT '0' COMMENT '删除状态',
  PRIMARY KEY (`f_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色表';


DROP TABLE IF EXISTS `t_resource_url`;
CREATE TABLE IF NOT EXISTS `t_resource_url` (
  `f_id` varchar(32) NOT NULL COMMENT 'resourceUrlId',
  `f_url` varchar(100) NOT NULL COMMENT '不可匿名访问的地址',
  `f_url_desc` varchar(100) NOT NULL COMMENT '描述',
  `f_parent_id` varchar(32) DEFAULT NULL COMMENT '父级ID',
  `f_is_menu` tinyint(1) NOT NULL COMMENT '是否菜单',
  `f_level` TINYINT(4) NOT NULL COMMENT '层级',
  `f_system_code` varchar(32) NOT NULL COMMENT '系统code',
  `f_need_csrf` TINYINT(1) NOT NULL DEFAULT '0' COMMENT '是否校验csrf',
  `f_sys_add_time` datetime DEFAULT NULL COMMENT '新增时间',
  `f_sys_upd_time` datetime DEFAULT NULL COMMENT '修改时间',
  `f_sys_del_time` datetime DEFAULT NULL COMMENT '删除时间',
  `f_sys_add_user` varchar(32) DEFAULT NULL COMMENT '新增人',
  `f_sys_upd_user` varchar(32) DEFAULT NULL COMMENT '修改人',
  `f_sys_del_user` varchar(32) DEFAULT NULL COMMENT '删除人',
  `f_sys_del_state` tinyint(1) NOT NULL DEFAULT '0' COMMENT '删除状态',
  PRIMARY KEY (`f_id`),
  KEY `idx_resourceUrl_parentId` (`f_parent_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='访问链接表';



DROP TABLE IF EXISTS `t_login_log`;
CREATE TABLE IF NOT EXISTS `t_login_log` (
  `f_id` varchar(32) NOT NULL COMMENT 'id',
  `f_user_id` varchar(32) NOT NULL COMMENT 'userId',
  `f_user_account` varchar(100) NOT NULL COMMENT '登录账号',
  `f_system_code` VARCHAR(100) NOT NULL COMMENT '系统code',
  `f_sys_add_time` datetime DEFAULT NULL COMMENT '新增时间',
  `f_sys_upd_time` datetime DEFAULT NULL COMMENT '修改时间',
  `f_sys_del_time` datetime DEFAULT NULL COMMENT '删除时间',
  `f_sys_add_user` varchar(32) DEFAULT NULL COMMENT '新增人',
  `f_sys_upd_user` varchar(32) DEFAULT NULL COMMENT '修改人',
  `f_sys_del_user` varchar(32) DEFAULT NULL COMMENT '删除人',
  `f_sys_del_state` tinyint(1) NOT NULL DEFAULT '0' COMMENT '删除状态',
  PRIMARY KEY (`f_id`),
  KEY `fk_loginLog_userId` (`f_user_id`),
  CONSTRAINT `fk_loginLog_userId` FOREIGN KEY (`f_user_id`) REFERENCES `t_user` (`f_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='登录日志表';


DROP TABLE IF EXISTS `t_login_no`;
CREATE TABLE IF NOT EXISTS `t_login_no` (
  `f_id` varchar(32) NOT NULL COMMENT 'id',
  `f_user_id` varchar(32) NOT NULL COMMENT 'userId',
  `f_user_account` varchar(100) NOT NULL COMMENT '登录账号',
  `f_user_pwd` varchar(100) DEFAULT NULL COMMENT '登录密码',
  `f_type` tinyint(4) NOT NULL COMMENT '登录类型，1手机号，2微信，3微博',
  `f_sys_add_time` datetime DEFAULT NULL COMMENT '新增时间',
  `f_sys_upd_time` datetime DEFAULT NULL COMMENT '修改时间',
  `f_sys_del_time` datetime DEFAULT NULL COMMENT '删除时间',
  `f_sys_add_user` varchar(32) DEFAULT NULL COMMENT '新增人',
  `f_sys_upd_user` varchar(32) DEFAULT NULL COMMENT '修改人',
  `f_sys_del_user` varchar(32) DEFAULT NULL COMMENT '删除人',
  `f_sys_del_state` tinyint(1) NOT NULL DEFAULT '0' COMMENT '删除状态',
  PRIMARY KEY (`f_id`),
  KEY `fk_loginNo_userId` (`f_user_id`),
  CONSTRAINT `fk_loginNo_userId` FOREIGN KEY (`f_user_id`) REFERENCES `t_user` (`f_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='登录账号表';



DROP TABLE IF EXISTS `t_role_resource`;
CREATE TABLE IF NOT EXISTS `t_role_resource` (
  `f_id` varchar(32) NOT NULL COMMENT '角色资源ID',
  `f_role_id` varchar(32) NOT NULL COMMENT 'roleId',
  `f_resource_url_id` varchar(100) NOT NULL COMMENT '资源ID',
  `f_sys_add_time` datetime DEFAULT NULL COMMENT '新增时间',
  `f_sys_upd_time` datetime DEFAULT NULL COMMENT '修改时间',
  `f_sys_del_time` datetime DEFAULT NULL COMMENT '删除时间',
  `f_sys_add_user` varchar(32) DEFAULT NULL COMMENT '新增人',
  `f_sys_upd_user` varchar(32) DEFAULT NULL COMMENT '修改人',
  `f_sys_del_user` varchar(32) DEFAULT NULL COMMENT '删除人',
  `f_sys_del_state` tinyint(1) NOT NULL DEFAULT '0' COMMENT '删除状态',
  PRIMARY KEY (`f_id`),
  KEY `fk_roleResource_roleId` (`f_role_id`),
  KEY `fk_roleResource_resourceId` (`f_resource_url_id`),
  CONSTRAINT `fk_roleResource_resourceId` FOREIGN KEY (`f_resource_url_id`) REFERENCES `t_resource_url` (`f_id`),
  CONSTRAINT `fk_roleResource_roleId` FOREIGN KEY (`f_role_id`) REFERENCES `t_role` (`f_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色资源表';


DROP TABLE IF EXISTS `t_user_role`;
CREATE TABLE IF NOT EXISTS `t_user_role` (
  `f_id` varchar(32) NOT NULL COMMENT 'ID',
  `f_user_id` varchar(100) NOT NULL COMMENT 'userId',
  `f_role_id` varchar(32) NOT NULL COMMENT 'roleId',
  `f_sys_add_time` datetime DEFAULT NULL COMMENT '新增时间',
  `f_sys_upd_time` datetime DEFAULT NULL COMMENT '修改时间',
  `f_sys_del_time` datetime DEFAULT NULL COMMENT '删除时间',
  `f_sys_add_user` varchar(32) DEFAULT NULL COMMENT '新增人',
  `f_sys_upd_user` varchar(32) DEFAULT NULL COMMENT '修改人',
  `f_sys_del_user` varchar(32) DEFAULT NULL COMMENT '删除人',
  `f_sys_del_state` tinyint(1) NOT NULL COMMENT '删除状态',
  PRIMARY KEY (`f_id`),
  KEY `fk_userRole_userId` (`f_user_id`),
  KEY `fk_userRole_roleId` (`f_role_id`),
  CONSTRAINT `fk_userRole_roleId` FOREIGN KEY (`f_role_id`) REFERENCES `t_role` (`f_id`),
  CONSTRAINT `fk_userRole_userId` FOREIGN KEY (`f_user_id`) REFERENCES `t_user` (`f_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户角色表';


CREATE TABLE `t_comm_logger` (
	`f_id` BIGINT(20) NOT NULL AUTO_INCREMENT,
	`f_user_id` BIGINT(20) NULL DEFAULT NULL COMMENT '用户Id',
	`f_user_acc_no` VARCHAR(45) NULL DEFAULT NULL COMMENT '登录账号',
	`f_user_acc_type` INT(11) NULL DEFAULT NULL COMMENT '登录账号类型',
	`f_action_url_tail` VARCHAR(100) NULL DEFAULT NULL COMMENT '请求的action',
	`f_action_url_all` VARCHAR(500) NULL COMMENT '请求的action全路径',
	`f_request_params` MEDIUMTEXT NULL COMMENT '请求的参数信息',
	`f_action_res_code` VARCHAR(100) NULL DEFAULT NULL COMMENT '返回结果码',
	`f_is_undefined_exception` TINYINT(1) NULL DEFAULT NULL COMMENT '是否为未处理的异常=={"1":"是","0":"否"}',
	`f_excep_stack_info` MEDIUMTEXT NULL COMMENT '异常堆栈信息',
	`f_ip` VARCHAR(64) NULL DEFAULT NULL COMMENT '客户IP地址',
	`f_device_id` VARCHAR(500) NULL DEFAULT NULL COMMENT '设备Id',
	`f_os` VARCHAR(1000) NULL COMMENT '操作系统相关信息',
	`f_os_version` VARCHAR(45) NULL DEFAULT NULL COMMENT '操作系统版本',
	`f_req_start_time` DATETIME NOT NULL COMMENT '请求发起时间',
	`f_req_deal_time` INT(11) NULL DEFAULT NULL COMMENT '请求处理时间,毫秒',
	`f_req_end_time` DATETIME NULL DEFAULT NULL COMMENT '请求结束时间',
	`f_response_data` MEDIUMTEXT NULL COMMENT '返回结果数据',
	`f_sys0_add_time` DATETIME NULL DEFAULT NULL COMMENT '新增时间',
	`f_sys0_upd_time` DATETIME NULL DEFAULT NULL COMMENT '更新时间',
	`f_sys0_del_time` DATETIME NULL DEFAULT NULL COMMENT '删除时间',
	`f_sys0_add_user` BIGINT(20) NULL DEFAULT NULL COMMENT '新增者',
	`f_sys0_upd_user` BIGINT(20) NULL DEFAULT NULL COMMENT '修改者',
	`f_sys0_del_user` BIGINT(20) NULL DEFAULT NULL COMMENT '删除者',
	`f_sys0_del_state` TINYINT(4) NULL DEFAULT NULL COMMENT '记录状态=={"0":"正常","1":"已删除"}',
	PRIMARY KEY (`f_id`, `f_req_start_time`)
)
COMMENT='公共日志记录表'
COLLATE='utf8mb4_general_ci'
ENGINE=InnoDB
AUTO_INCREMENT=1514
;