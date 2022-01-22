package D0122.DAOinterface.domain.userinfo.dao.mysql;


import D0122.DAOinterface.domain.userinfo.UserInfo;
import D0122.DAOinterface.domain.userinfo.dao.UserInfoDAO;

public class UserInfoMySqlDAO implements UserInfoDAO {
    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("INSERT INTO MYSQL DB userId = " + userInfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("UPDATE INTO MYSQL DB userId = " + userInfo.getUserId());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("DELETE INTO MYSQL DB userId = " + userInfo.getUserId());

    }
}
