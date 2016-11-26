INSERT INTO `oasys`.`employee_sector` (`employee_sector_id`, `employee_sector_name`) VALUES ('1', '客户部');
INSERT INTO `oasys`.`employee_sector` (`employee_sector_id`, `employee_sector_name`) VALUES ('2', '渠道部');
INSERT INTO `oasys`.`employee_sector` (`employee_sector_id`, `employee_sector_name`) VALUES ('3', '财务部');
INSERT INTO `oasys`.`employee_sector` (`employee_sector_id`, `employee_sector_name`) VALUES ('4', '商务部');

INSERT INTO `oasys`.`employee_type` (`employee_type_id`, `employee_type_name`) VALUES ('1', '老板');
INSERT INTO `oasys`.`employee_type` (`employee_type_id`, `employee_type_name`) VALUES ('2', '经理');
INSERT INTO `oasys`.`employee_type` (`employee_type_id`, `employee_type_name`) VALUES ('3', '普通员工');
INSERT INTO `oasys`.`employee_type` (`employee_type_id`, `employee_type_name`) VALUES ('4', '会计');

INSERT INTO `oasys`.`employee_punchcard_message_state` (`employee_punchcard_message_state_id`, `employee_punchcard_message_state_name`) VALUES ('1', '实到');
INSERT INTO `oasys`.`employee_punchcard_message_state` (`employee_punchcard_message_state_id`, `employee_punchcard_message_state_name`) VALUES ('2', '迟到');
INSERT INTO `oasys`.`employee_punchcard_message_state` (`employee_punchcard_message_state_id`, `employee_punchcard_message_state_name`) VALUES ('3', '早退');
INSERT INTO `oasys`.`employee_punchcard_message_state` (`employee_punchcard_message_state_id`, `employee_punchcard_message_state_name`) VALUES ('4', '迟到\早退');

INSERT INTO `oasys`.`employee_message` (`employee_id`, `employee_name`, `employee_age`, `employee_phone`, `employee_sex`, `employee_address`, `employee_Sector_Id`, `employee_Type_Id`) VALUES ('1001', '小明', '18', '11111111111', '男', '这儿', '1', '2');
INSERT INTO `oasys`.`employee_message` (`employee_id`, `employee_name`, `employee_age`, `employee_phone`, `employee_sex`, `employee_address`, `employee_Sector_Id`, `employee_Type_Id`) VALUES ('1002', '小刚', '20', '22222222222', '男', '那儿', '2', '2');
INSERT INTO `oasys`.`employee_message` (`employee_id`, `employee_name`, `employee_age`, `employee_phone`, `employee_sex`, `employee_address`, `employee_Sector_Id`, `employee_Type_Id`) VALUES ('1003', '呵呵', '36', '33333333333', '男', '也是这儿', '1', '3');
INSERT INTO `oasys`.`employee_message` (`employee_id`, `employee_name`, `employee_age`, `employee_phone`, `employee_sex`, `employee_address`, `employee_Sector_Id`, `employee_Type_Id`) VALUES ('1004', '哈哈', '36', '44444444444', '女', '哪儿', '1', '3');

INSERT INTO `oasys`.`workreport_state` (`workreport_state_id`, `workreport_state_name`) VALUES ('1', '已审核');
INSERT INTO `oasys`.`workreport_state` (`workreport_state_id`, `workreport_state_name`) VALUES ('2', '未审核');
INSERT INTO `oasys`.`workreport_state` (`workreport_state_id`, `workreport_state_name`) VALUES ('3', '审核未通过');

INSERT INTO `oasys`.`financial_workreport_event` (`financial_workreport_event_id`, `financial_workreport_event_name`) VALUES ('1', '财务支出');
INSERT INTO `oasys`.`financial_workreport_event` (`financial_workreport_event_id`, `financial_workreport_event_name`) VALUES ('2', '工资支出');
INSERT INTO `oasys`.`financial_workreport_event` (`financial_workreport_event_id`, `financial_workreport_event_name`) VALUES ('3', '收入');

INSERT INTO `oasys`.`employee_login_message` (`employee_login_id`, `employee_Id`, `employee_login_password`) VALUES ('1', '1001', '123456');
INSERT INTO `oasys`.`employee_login_message` (`employee_login_id`, `employee_Id`, `employee_login_password`) VALUES ('2', '1002', '123456');
INSERT INTO `oasys`.`employee_login_message` (`employee_login_id`, `employee_Id`, `employee_login_password`) VALUES ('3', '1003', '123456');
INSERT INTO `oasys`.`employee_login_message` (`employee_login_id`, `employee_Id`, `employee_login_password`) VALUES ('4', '1004', '123456');
