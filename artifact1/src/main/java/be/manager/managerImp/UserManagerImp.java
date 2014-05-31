package be.manager.managerImp;

import org.apache.log4j.Logger;

import be.service.UserManager;

public class UserManagerImp implements UserManager {
	
	  static final Logger logger = Logger.getLogger(UserManagerImp.class);
	  
	public void loginUser(String userName) throws Exception {
	 
		logger.info("Methode Login manager avec le param"+userName);

	}

}
