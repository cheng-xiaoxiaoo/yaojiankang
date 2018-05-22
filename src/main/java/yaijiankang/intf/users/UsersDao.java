package yaijiankang.intf.users;

import yaijiankang.intf.users.dto.User;

public interface UsersDao {
	
	public Integer queryTeleExist(String tele);
	
	public void UserRegister(User user);

}
