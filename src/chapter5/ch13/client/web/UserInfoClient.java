package chapter5.ch13.client.web;

import chapter5.ch13.UserInfo;
import chapter5.ch13.dao.UserInfoDao;
import chapter5.ch13.dao.mysql.UserInfoMySqlDao;
import chapter5.ch13.dao.oracle.UserInfoOracleDao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UserInfoClient {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("C:/Users/Playdata/javaself_study/untitled/src/db.properties");

        Properties prop = new Properties();
        prop.load(fis);

        String dbType = prop.getProperty("DBTYPE");
        System.out.println(dbType);

        UserInfo userInfo = new UserInfo();

        userInfo.setUserId("user01");
        userInfo.setPasswd("!@#$%12345");
        userInfo.setUserName("James");

        UserInfoDao userInfoDao = null;

        if (dbType.equals("ORACLE")) {
            userInfoDao = new UserInfoOracleDao();
        } else if (dbType.equals("MYSQL")) {
            userInfoDao = new UserInfoMySqlDao();
        } else {
            System.out.println("not support");
        }
        if (userInfoDao != null) {
            userInfoDao.insertUserInfo(userInfo);
            userInfoDao.updateUserInfo(userInfo);
            userInfoDao.deleteUserInfo(userInfo);
        }
    }
}
