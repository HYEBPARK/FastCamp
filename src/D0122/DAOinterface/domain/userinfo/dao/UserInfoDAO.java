package D0122.DAOinterface.domain.userinfo.dao;

import D0122.DAOinterface.domain.userinfo.UserInfo;

public interface UserInfoDAO {
    void insertUserInfo(UserInfo userInfo);
    void updateUserInfo(UserInfo userInfo);
    void deleteUserInfo(UserInfo userInfo);
}
