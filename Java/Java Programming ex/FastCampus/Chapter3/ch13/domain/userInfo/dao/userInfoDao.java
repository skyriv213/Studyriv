package ch13.domain.userInfo.dao;

import ch13.domain.userInfo.UserInfo;

public interface userInfoDao {
	
	void updateUserInfo(UserInfo userInfo);
	
	void deleteUserInfo(UserInfo userInfo);

	void insertUserInfo(UserInfo userInfo);


}
	


