package ch13.domain.userInfo.dao.mysql;

import ch13.domain.userInfo.UserInfo;
import ch13.domain.userInfo.dao.userInfoDao;

public class UserInfomysqlDao implements userInfoDao{

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		
		// TODO Auto-generated method stub
		System.out.println("Insert Into Mysql db userID" + userInfo.getUserId());
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		// TODO Auto-generated method stub
		System.out.println("Update Into Mysql db userID" + userInfo.getUserId());
		
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		// TODO Auto-generated method stub
		System.out.println("Delete Into Mysql db userID" + userInfo.getUserId());
		
	}

}
