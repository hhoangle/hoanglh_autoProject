package Mykiot;
import NPT.NptPageObjects.*;
import commons.BaseTest;
import org.openqa.selenium.WebDriver;
import static commons.GlobalConstants.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;


public class nptCreateBrand extends BaseTest {
    WebDriver driver;
    private String browserName;
    private NptLoginPageObject loginPage;
    private NptHomePageObject nptHomePage;
    private NptProductPageObject nptProductPage;
    private NptCategoryPageObject nptCategoryPageObject;
    private NptBrandDetailPageObject nptBrandDetailPageObject;
    private String imagePath, brandName,warningMessage,classification;

    @BeforeClass
    public void beforeClass() {
        browserName = "chrome";
        driver = getBrowserDriver(browserName, NPT_LOGIN);
        loginPage = new NptLoginPageObject(driver);
        nptHomePage = loginPage.goToNptHomePage(driver);
        brandName = "Famous Brand";
        imagePath = PROJECT_PATH + "\\uploadFiles\\NewProductImage.png";
        warningMessage = "Vui lòng nhập đầy đủ thông tin";
        classification = "Nhà phát triển";
    }
    public void goToHomePage() {
        nptHomePage.openPageUrl(driver, NPT_LOGIN);
    }
    @Test
    public void TC_01_Create_Brand_Without_Input() {
        goToHomePage();
        nptProductPage = nptHomePage.clickToManageProduct();
        nptProductPage.waitForLoadingIconInvisible(driver);
        nptCategoryPageObject = nptProductPage.clickToManageCategory();
        nptCategoryPageObject.clickCreateBrandButton();
        nptCategoryPageObject.clickSaveButton();
        assertEquals(nptCategoryPageObject.getWarningMessage(),warningMessage);
        nptCategoryPageObject.clickCloseWarningPopup();
    }
    @Test
    public void TC_02_Create_Brand_Without_Product(){
        goToHomePage();
        nptProductPage = nptHomePage.clickToManageProduct();
        nptProductPage.waitForLoadingIconInvisible(driver);
        nptCategoryPageObject = nptProductPage.clickToManageCategory();
        nptCategoryPageObject.clickCreateBrandButton();
        nptCategoryPageObject.inputImg(imagePath);
        nptCategoryPageObject.insertBrandName(brandName);
        nptBrandDetailPageObject = nptCategoryPageObject.clickSaveButton();
        assertEquals(nptBrandDetailPageObject.getBrandNameInDetailPage(),brandName);
        assertEquals(nptBrandDetailPageObject.getClassification(),classification);
    }
}
