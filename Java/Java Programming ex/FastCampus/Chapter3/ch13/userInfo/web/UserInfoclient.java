package ch13.userInfo.web;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import ch13.domain.userInfo.UserInfo;
import ch13.domain.userInfo.dao.userInfoDao;
import ch13.domain.userInfo.dao.mysql.UserInfomysqlDao;
import ch13.domain.userInfo.dao.oracle.UserInfoOracleDao;

public class UserInfoclient {
	
	public static void main(String [] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("db.properties");
		
		Properties prop = new Properties();
		prop.load(fis);
		
		String dbType = prop.getProperty("DBTYPE");
		
		UserInfo userInfo =  new UserInfo();
		
		userInfoDao userInfoDao =  null;
		userInfo.setUserId("12345");
		userInfo.setPassword("!@#$%");
		userInfo.setUserName("Lee");
		
		if( dbType.equals("ORACLE")) {
			userInfoDao = new UserInfoOracleDao();
		}
		else if(dbType.equals("MYSQL")) {
			userInfoDao = new UserInfomysqlDao();
		}
		
		else {
			System.out.println("db error");
			return;
		}
		userInfoDao.insertUserInfo(userInfo);
		userInfoDao.updateUserInfo(userInfo);
		userInfoDao.deleteUserInfo(userInfo);


	}
	

}

/*
 * return
 * 
 */
