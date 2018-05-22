package yaijiankang.intf.http;

public interface HttpResponseConstant {
	
	static Integer SUCCESS = 0x01;
	static Integer NOT_LOGEDIN = 0x02;
	static Integer ADMIN_NOT_EXIST = 0x03;
	static Integer FAILED = 0x04;
	static Integer MAKESURE = 0x05;
	
	static String USER_NOT_EXIST = "用户不存在！";
	static String LOGIN_FAILED = "登陆失败！";
	static String PASSWORD_ERROE_MSG = "密码错误！";
	static String TELE_EXIST = "该手机已注册用户";
	static String MSG_REGISTER_SUCCESS = "注册成功";
	static String LOGIN_FIRST_MSG = "请先登录！";

}
