package be.manager.managerImp;

import org.apache.log4j.Logger;

import be.manager.UserManager;

public class UserManagerImp implements UserManager {
	
	  static final Logger logger = Logger.getLogger(UserManagerImp.class);
	  
	public void login(String userName) {
	 
		logger.info("Methode Login manager avec le param"+userName);

	}

	



}
