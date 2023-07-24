package NPT.NptPageObjects;

import NPT.NptPageObjects.NptPageUIs.NptSalesOrderUI;
import commons.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NptDetailSaleOrderPageObject extends BasePage{
    private WebDriver driver;
    public NptDetailSaleOrderPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public String getSaleOrderStatus() {
        return getElementText(driver, NptSalesOrderUI.SALE_ORDER_STATUS);
    }

    public void clickToViewInvoice() {
        clickToElement(driver, NptSalesOrderUI.VIEW_INVOICE_BUTTON);
    }

    public String getOrderCode() {
        return getElementText(driver, NptSalesOrderUI.ORDER_CODE);
    }

    public String getOrderCodeInInvoice() {
        sleepInSecond(1);
        return getElementText(driver, NptSalesOrderUI.ORDER_CODE_IN_INVOICE);
    }
}
