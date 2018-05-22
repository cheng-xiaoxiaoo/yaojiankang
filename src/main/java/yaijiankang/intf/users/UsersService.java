package yaijiankang.intf.users;

import yaijiankang.intf.users.dto.User;

public interface UsersService {

	public boolean queryTeleExist(String string);

	public void UserRegister(User user);
}
