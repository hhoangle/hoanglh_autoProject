package Mykiot;
import NPT.NptPageObjects.*;
import commons.BaseTest;
import org.openqa.selenium.WebDriver;

import static commons.GlobalConstants.*;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
public class nptCreateProductGroup extends BaseTest {
    WebDriver driver;
    private String browserName;
    private NptLoginPageObject loginPage;
    private NptHomePageObject nptHomePage;
    private NptProductPageObject nptProductPage;
    private NptCategoryPageObject nptCategoryPageObject;
    private NptProductGroupPageObject nptProductGroupPageObject;
    private NptProductGroupDetailPageObject nptProductGroupDetailPageObject;
    private String productGroupName, productGroupDescription, productCategory, warningMessage;

    @BeforeClass
    public void beforeClass() {
        browserName = "chrome";
        driver = getBrowserDriver(browserName, NPT_LOGIN);
        loginPage = new NptLoginPageObject(driver);
        nptHomePage = loginPage.goToNptHomePage(driver);
        productGroupName = "Modern Home";
        warningMessage = "Vui lòng nhập đầy đủ thông tin";
        productGroupDescription = "Phasellus feugiat erat a ex fringilla volutpat";
    }

    public void goToHomePage() {
        nptHomePage.openPageUrl(driver, NPT_LOGIN);
    }
    @Test
    public void TC_01_Create_Product_Group_Without_Insert_Name() {
        goToHomePage();
        nptProductPage = nptHomePage.clickToManageProduct();
        nptProductPage.waitForLoadingIconInvisible(driver);
        nptCategoryPageObject = nptProductPage.clickToManageCategory();
        nptProductGroupPageObject = nptCategoryPageObject.clickToProductGroup();
        nptProductGroupPageObject.clickToCreateProductGroup();
        nptProductGroupPageObject.clickSaveButton();
        assertEquals(nptProductGroupPageObject.getWarningMessage(), warningMessage);
        nptProductGroupPageObject.clickCloseWarningPopup();
    }
}
