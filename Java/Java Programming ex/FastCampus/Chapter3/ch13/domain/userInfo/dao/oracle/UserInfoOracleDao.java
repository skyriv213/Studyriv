package ch13.domain.userInfo.dao.oracle;

import ch13.domain.userInfo.UserInfo;
import ch13.domain.userInfo.dao.userInfoDao;

public class UserInfoOracleDao implements userInfoDao{
	@Override
	public void insertUserInfo(UserInfo userInfo) {
		
		// TODO Auto-generated method stub
		System.out.println("Insert Into ORACLE db userID" + userInfo.getUserId());
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		// TODO Auto-generated method stub
		System.out.println("Update Into ORACLE db userID" + userInfo.getUserId());
		
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		// TODO Auto-generated method stub
		System.out.println("Delete Into ORACLE db userID" + userInfo.getUserId());
		


}
}
