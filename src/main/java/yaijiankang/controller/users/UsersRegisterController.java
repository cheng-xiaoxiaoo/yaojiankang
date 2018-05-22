package yaijiankang.controller.users;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import yaijiankang.intf.http.BaseResponse;
import yaijiankang.intf.http.HttpResponseConstant;
import yaijiankang.intf.users.UsersService;
import yaijiankang.intf.users.dto.User;

public class UsersRegisterController {

	@Autowired
	UsersService usersService;
	
	@RequestMapping(value = "/UserRegister", method = RequestMethod.GET)
	public ModelAndView showRegisterPage() {
		ModelAndView mView = new ModelAndView("/user/UserRegister");
		return mView;
	}

	@RequestMapping(value = "/UserRegister", method = RequestMethod.POST)
	public ResponseEntity<BaseResponse> register(HttpEntity<User> httpUser,  HttpSession session)  {
		BaseResponse response = new BaseResponse();
		User user=httpUser.getBody() ;
		if(user.getStep()==101){
			if (usersService.queryTeleExist(user.getPhone_number())){
				response.setCode(HttpResponseConstant.FAILED);
				response.setMsg(HttpResponseConstant.TELE_EXIST);
			} else {
				response.setCode(HttpResponseConstant.SUCCESS);
			}
			user.setStep(101);
		}				
		
		if(user.getStep()==1){
			usersService.UserRegister(user);
			session.setAttribute("userName", user.getUserName());
			session.setAttribute("user_Id", user.getUserId());
			response.setCode(HttpResponseConstant.SUCCESS);
			response.setMsg(HttpResponseConstant.MSG_REGISTER_SUCCESS);
			response.setObj(user);			
			user.setStep(2);
		}
		MultiValueMap<String, String> header = new HttpHeaders();
		header.set("Access-Control-Allow-Origin", "*");
		header.set("Access-Control-Request-Method", "post");
		return new ResponseEntity<BaseResponse>(response, header, HttpStatus.OK);
	}
}
