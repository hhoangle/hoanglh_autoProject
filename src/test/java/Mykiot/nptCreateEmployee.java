package Mykiot;

import NPT.NptPageObjects.*;
import commons.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static commons.GlobalConstants.*;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
public class nptCreateEmployee extends BaseTest {
    WebDriver driver;
    private String browserName;
    private NptLoginPageObject loginPage;
    private NptHomePageObject nptHomePage;
    private NptCreateEmployeePageObject nptCreateEmployeePageObject;
    private String employeeName, employeeEmail, passWord,employeeNameField,employeePhoneNumberField,employeePhoneNumber,
            passWordField,employeeEmailField;
    @BeforeClass
    public void beforeClass() {
        browserName = "chrome";
        driver = getBrowserDriver(browserName, NPT_LOGIN);
        loginPage = new NptLoginPageObject(driver);
        nptHomePage = loginPage.goToNptHomePage(driver);
        employeeName = "Nguyễn Văn A";
        employeeNameField = "Nhập tên nhân viên";
        employeePhoneNumber = "0981199999";
        employeePhoneNumberField = "Nhập số điện thoại";
        employeeEmail = "nguyenvana@yopmail.com";
        employeeEmailField = "Nhập email";
        passWord = "123456789";
        passWordField = "Nhập mật khẩu";

    }
    public void goToHomePage() {
        nptHomePage.openPageUrl(driver, NPT_LOGIN);
    }
    @Test
    public void TC_01_Create_Employee_Without_Input(){
        goToHomePage();
        nptCreateEmployeePageObject = nptHomePage.clickToManageEmployee();
        nptCreateEmployeePageObject.clickToCreateEmployeeButton();
        nptCreateEmployeePageObject.insertEmployeeInfor(employeeName,employeeNameField);
        nptCreateEmployeePageObject.insertEmployeeInfor(employeePhoneNumber,employeePhoneNumberField);
        nptCreateEmployeePageObject.insertEmployeeInfor(employeeEmail,employeeEmailField);
        nptCreateEmployeePageObject.insertEmployeeInfor(passWord,passWordField);
        nptCreateEmployeePageObject.selectPosition();
    }
}
