package D0122.DAOinterface.domain.userinfo.dao.oracle;

import D0122.DAOinterface.domain.userinfo.UserInfo;
import D0122.DAOinterface.domain.userinfo.dao.UserInfoDAO;

public class UserInfoOracleDAO implements UserInfoDAO {
    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("INSERT INTO ORACLE DB userId = " + userInfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("INSERT INTO ORACLE DB userId = " + userInfo.getUserId());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("INSERT INTO ORACLE DB userId = " + userInfo.getUserId());
    }
}
