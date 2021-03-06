-- auto Generated on 2018-11-28 09:30:47 
-- DROP TABLE IF EXISTS `log`; 
CREATE TABLE log(
    `id` INTEGER(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'id',
    `log_id` VARCHAR(50) NOT NULL DEFAULT '' COMMENT '日志ID',
    `user_id` VARCHAR(50) NOT NULL DEFAULT '' COMMENT '日志主体用户ID',
    `user_ip` VARCHAR(50) NOT NULL DEFAULT '' COMMENT '登录IP地址',
    `user_address` VARCHAR(50) NOT NULL DEFAULT '' COMMENT '登录地点',
    `user_source` VARCHAR(50) NOT NULL DEFAULT '' COMMENT '登录设备',
    `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'createTime',
    `update_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'updateTime',
    `is_deleted` INTEGER(12) NOT NULL DEFAULT -1 COMMENT 'isDeleted',
    PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'log';
