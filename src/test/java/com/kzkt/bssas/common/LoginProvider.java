package com.kzkt.bssas.common;

import com.kzkt.bssas.model.OrgLoginUser;
import com.kzkt.bssas.model.Student;
import org.testng.annotations.DataProvider;

public class LoginProvider {

    //机构登录信息-机构管理员
    @DataProvider(name = "loginUserInfo")
    public static Object[][] forLoginUser() {
        return new Object[][]{
                {new OrgLoginUser("27628","854fbfdff02f7d347ef9936c172a5eca",String.valueOf(PlatformType.BSAAS.getPlatformType()))}
        };
    }

    @DataProvider(name = "student")
    public static Object[][] forStudent() {
        return new Object[][]{
                {new Student("testNg","16644444440")},
                {new Student("testNG1","16644444441")},
                {new Student("testNG2","16644444442")},
                {new Student("testNG3","16644444443")},
                {new Student("testNG4","16644444444")},
                {new Student("testNG5","16644444445")},
                {new Student("testNG6","16644444446")},
                {new Student("testNG7","16644444447")},
                {new Student("testNG8","16644444448")},
                {new Student("testNG9","16644444449")}
        };
    }


}
