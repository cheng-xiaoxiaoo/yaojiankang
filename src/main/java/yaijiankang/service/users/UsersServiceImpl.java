package yaijiankang.service.users;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;

import yaijiankang.intf.users.UsersDao;
import yaijiankang.intf.users.UsersService;
import yaijiankang.intf.users.dto.User;

public class UsersServiceImpl implements UsersService{
	
	@Autowired
	UsersDao usersDao;
	
	@Override
	public boolean queryTeleExist(String tele) {
		if(usersDao.queryTeleExist(tele)>0)
			return true;
		else 
			return false;
	}
	
	@Override
	public void UserRegister(User user) {
		String hashed_password = DigestUtils.sha1Hex(user.getPassword().toUpperCase());
		user.setPassword(hashed_password);
		usersDao.UserRegister(user);
	}

}
