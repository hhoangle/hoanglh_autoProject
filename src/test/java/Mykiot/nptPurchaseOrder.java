package Mykiot;

import NPT.NptPageObjects.*;
import commons.BaseTest;
import org.openqa.selenium.WebDriver;

import static commons.GlobalConstants.*;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class nptPurchaseOrder extends BaseTest {
    WebDriver driver;
    private String browserName;
    private NptLoginPageObject loginPage;
    private NptHomePageObject nptHomePage;
    private NptPurchaseOrderPageObject nptPurchaseOrderPageObject;
    private NptCreatePurchaseOrderPageObject nptCreatePurchaseOrderPageObject;
    private String warningMessage,purchaseOrderStatus,confirmedOrderStatus,completeOrderStatus,
            selectDenyReasonWarning,denyReason,denyOrderStatus;

    @BeforeClass
    public void beforeClass() {
        browserName = "chrome";
        warningMessage = "Vui lòng chọn sản phẩm và số lượng";
        purchaseOrderStatus = "Chờ xác nhận";
        confirmedOrderStatus = "Đã Xác nhận";
        completeOrderStatus = "Hoàn thành";
        denyOrderStatus = "Từ chối nhận";
        driver = getBrowserDriver(browserName, NPT_LOGIN);
        loginPage = new NptLoginPageObject(driver);
        nptHomePage = loginPage.goToNptHomePage(driver);
    }

    public void goToHomePage() {
        nptHomePage.openPageUrl(driver, NPT_LOGIN);
    }

    @Test
    public void TC_01_Create_Purchase_Order_Without_Select_Product() {
        goToHomePage();
        nptPurchaseOrderPageObject = nptHomePage.clickToPurchaseOrder();
        nptCreatePurchaseOrderPageObject = nptPurchaseOrderPageObject.clickToCreatePurchaseOrderButton();
        nptCreatePurchaseOrderPageObject.clickToContinueButton();
        //IF NOT SELECT ANY PRODUCT THEN CLICK CONTINUE, WARNING POPUP SHOULD BE DISPLAYED
        assertEquals(nptCreatePurchaseOrderPageObject.getWarningMessage(), warningMessage);
    }

    @Test
    public void TC_02_Create_Purchase_Order() {
        goToHomePage();
        nptPurchaseOrderPageObject = nptHomePage.clickToPurchaseOrder();
        nptCreatePurchaseOrderPageObject = nptPurchaseOrderPageObject.clickToCreatePurchaseOrderButton();
        //SELECTED ITEMS MUST BE DISPLAYED IN THE CONFIRMATION SCREEN
        nptCreatePurchaseOrderPageObject.selectThreeFirstProduct();
        nptCreatePurchaseOrderPageObject.clickConfirmPurchaseOrder();
        //AFTER CREATED SUCCESSFULLY, PURCHASE ORDER STATUS MUST BE "WAIT TO CONFIRM"
        assertEquals(nptCreatePurchaseOrderPageObject.getPurchaseOrderStatus(),purchaseOrderStatus);
    }
    @Test
    public void TC_03_Confirm_Purchase_Order_From_Supplier(){
        goToHomePage();
        nptPurchaseOrderPageObject = nptHomePage.clickToPurchaseOrder();
        nptPurchaseOrderPageObject.clickToConfirmedSubTab();
        nptPurchaseOrderPageObject.clickToFirstPurchaseOrder();
        assertEquals(nptPurchaseOrderPageObject.getPurchaseOrderStatus(),confirmedOrderStatus);
        nptPurchaseOrderPageObject.clickToConfirmOfDelivery();
        assertEquals(nptPurchaseOrderPageObject.getPurchaseOrderStatus(),completeOrderStatus);
    }
    @Test
    public void TC_04_Deny_Purchase_Order_From_Supplier(){
        goToHomePage();
        nptPurchaseOrderPageObject = nptHomePage.clickToPurchaseOrder();
        nptPurchaseOrderPageObject.clickToConfirmedSubTab();
        nptPurchaseOrderPageObject.clickToFirstPurchaseOrder();
        assertEquals(nptPurchaseOrderPageObject.getPurchaseOrderStatus(),confirmedOrderStatus);
        nptPurchaseOrderPageObject.clickToDenyDelivery();
        nptPurchaseOrderPageObject.clickToConfirmDeny();
        selectDenyReasonWarning = nptPurchaseOrderPageObject.getDenyWarningMessage();
        assertEquals(selectDenyReasonWarning,"Vui lòng chọn lý do từ chối");
        nptPurchaseOrderPageObject.clickCloseWarningPopup();
        nptPurchaseOrderPageObject.clickToDenyDropdownButton();
        nptPurchaseOrderPageObject.selectDenyReason();
        denyReason = nptPurchaseOrderPageObject.getDenyReason();
        nptPurchaseOrderPageObject.clickToConfirmDeny();
        assertEquals(nptPurchaseOrderPageObject.getPurchaseOrderStatus(), denyOrderStatus);
        assertEquals(nptPurchaseOrderPageObject.getDenyReasonInDetailPage(), denyReason);
    }
}
