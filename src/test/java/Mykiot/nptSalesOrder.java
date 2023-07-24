package Mykiot;

import NPT.NptPageObjects.*;
import commons.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static commons.GlobalConstants.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class nptSalesOrder extends BaseTest {
    WebDriver driver;
    private String browserName;
    private NptLoginPageObject loginPage;
    private NptHomePageObject nptHomePage;
    private NptSalesOrderPageObject nptSaleOrderPageObject;
    private NptCreateSaleOrderPageObject nptCreateSaleOrderPageObject;
    private NptDetailSaleOrderPageObject nptDetailSaleOrderPageObject;
    private String warningMessage, saleOrderStatus;

    @BeforeClass
    public void beforeClass() {
        browserName = "chrome";
        driver = getBrowserDriver(browserName, NPT_LOGIN);
        loginPage = new NptLoginPageObject(driver);
        nptHomePage = loginPage.goToNptHomePage(driver);
        warningMessage = "Vui lòng chọn CHTH";
        saleOrderStatus = "Đã Xác nhận";
    }

    public void goToHomePage() {
        nptHomePage.openPageUrl(driver, NPT_LOGIN);
    }

    @Test
    public void TC_01_Create_Sale_Order_Without_Select_Store() {
        goToHomePage();
        nptSaleOrderPageObject = nptHomePage.clickToSaleOrder();
        nptCreateSaleOrderPageObject = nptSaleOrderPageObject.clickToCreateSalesOrder();
        nptCreateSaleOrderPageObject.selectThreeFirstProduct();
        nptCreateSaleOrderPageObject.clickToContinueButton();
        nptCreateSaleOrderPageObject.clickToConfirmButton();
        assertEquals(nptCreateSaleOrderPageObject.getWarningMessage(),warningMessage);
    }
    @Test
    public void TC_02_Create_Sale_Order() {
        goToHomePage();
        nptSaleOrderPageObject = nptHomePage.clickToSaleOrder();
        nptCreateSaleOrderPageObject = nptSaleOrderPageObject.clickToCreateSalesOrder();
        nptCreateSaleOrderPageObject.selectThreeFirstProduct();
        nptCreateSaleOrderPageObject.clickToContinueButton();
        nptCreateSaleOrderPageObject.selectStore();
        nptDetailSaleOrderPageObject = nptCreateSaleOrderPageObject.clickToConfirmButton();
        assertEquals(nptDetailSaleOrderPageObject.getSaleOrderStatus(),saleOrderStatus);
        String orderCode = nptDetailSaleOrderPageObject.getOrderCode();
        nptDetailSaleOrderPageObject.clickToViewInvoice();
        String orderCodeInInvoice = nptDetailSaleOrderPageObject.getOrderCodeInInvoice();
        assertTrue(orderCodeInInvoice.contains(orderCode));
    }
}