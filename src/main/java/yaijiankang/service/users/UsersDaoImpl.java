package yaijiankang.service.users;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import yaijiankang.intf.users.UsersDao;
import yaijiankang.intf.users.dto.User;

public class UsersDaoImpl implements UsersDao{

	private static final String NAME_SPACE = "yaojiankang.users.";
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	public Integer queryTeleExist(String tele) {
		return sqlSessionTemplate.selectOne(NAME_SPACE + "queryTeleExist", tele);
	}
	
	public void UserRegister(User user) {
		sqlSessionTemplate.insert(NAME_SPACE + "UserRegister", user);
	}
}
