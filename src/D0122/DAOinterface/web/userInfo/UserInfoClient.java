package D0122.DAOinterface.web.userInfo;

import D0122.DAOinterface.domain.userinfo.UserInfo;
import D0122.DAOinterface.domain.userinfo.dao.UserInfoDAO;
import D0122.DAOinterface.domain.userinfo.dao.mysql.UserInfoMySqlDAO;
import D0122.DAOinterface.domain.userinfo.dao.oracle.UserInfoOracleDAO;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UserInfoClient {
    public static void main(String[] args) throws IOException {
        FileInputStream ifs = new FileInputStream("C:/Work/untitled/src/D0122/db.properties");
        Properties prop = new Properties(); // pair로 읽을 수 있음
        prop.load(ifs);
        String dbType = prop.getProperty("DBTYPE");

        UserInfo userInfo = new UserInfo();
        userInfo.setUserId("12345");
        userInfo.setUserName("hyeb");
        userInfo.setPassword("7777");

        UserInfoDAO userInfoDAO = null;

        if(dbType.equals("MYSQL")){
            userInfoDAO = new UserInfoMySqlDAO();
        }
        else if(dbType.equals("ORACLE")){
            userInfoDAO = new UserInfoOracleDAO();
        }
        else {
            System.out.println("db error");
            return;
        }

        userInfoDAO.insertUserInfo(userInfo);
        userInfoDAO.updateUserInfo(userInfo);
        userInfoDAO.deleteUserInfo(userInfo);



    }
}
