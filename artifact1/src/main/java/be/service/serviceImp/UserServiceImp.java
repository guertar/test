package be.service.serviceImp;

import org.apache.log4j.Logger;
import org.springframework.util.Assert;

import be.manager.UserManager;
import be.service.UserService;

public class UserServiceImp implements UserService {
	UserManager userManager;
	
	  static final Logger logger = Logger.getLogger(UserServiceImp.class);
	  
	  
	  void init(){
		  Assert.notNull(userManager);
	  }
	  
	public void loginUser(String userName) throws Exception {
	 
		logger.info("MethodeLogin avec le param"+userName);
		userManager.login(userName);

		
	}

	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}
	

}
