package NPT.NptPageObjects;
import NPT.NptPageObjects.NptPageUIs.NptPurchaseOrderUI;
import NPT.NptPageObjects.NptPageUIs.NptSalesOrderUI;
import commons.BasePage;
import org.openqa.selenium.WebDriver;
public class NptSalesOrderPageObject extends BasePage {
        private WebDriver driver;
    public NptSalesOrderPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public NptCreateSaleOrderPageObject clickToCreateSalesOrder() {
        waitForLoadingIconInvisible(driver);
        clickToElement(driver, NptSalesOrderUI.CREATE_SALES_ORDER_BUTTON);
        return new NptCreateSaleOrderPageObject(driver);
    }

    public void clickToWaitToConfirmTab() {
        waitForLoadingIconInvisible(driver);
        clickToElement(driver, NptSalesOrderUI.WAIT_TO_CONFIRM_TAB);
    }
    public NptDetailSaleOrderPageObject clickToFirstOrder() {
        waitForLoadingIconInvisible(driver);
        clickToElement(driver, NptSalesOrderUI.FIRST_ORDER);
        return new NptDetailSaleOrderPageObject(driver);
    }

    public void clickToSubTab(String orderStatus) {
        waitForLoadingIconInvisible(driver);
        waitForAllElementVisible(driver, NptPurchaseOrderUI.DYNAMIC_SUBTAB, orderStatus);
        clickToElement(driver, NptPurchaseOrderUI.DYNAMIC_SUBTAB, orderStatus);
    }

    public boolean isPurchaseOderHaveCorrectStatus(String statusToCheck) {
        waitForLoadingIconInvisible(driver);
        return verifyAllItemsHaveStatus(driver, NptPurchaseOrderUI.STATUS_TAG, statusToCheck);
    }
}
