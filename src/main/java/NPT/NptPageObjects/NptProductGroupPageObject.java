package NPT.NptPageObjects;
import NPT.NptPageObjects.NptPageUIs.NptProductGroupUI;
import NPT.NptPageObjects.NptPageUIs.NptProductCategoryDetailPageUI;
import commons.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class NptProductGroupPageObject extends BasePage{
    private WebDriver driver;
    public NptProductGroupPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public void clickToCreateProductGroup() {
        clickToElement(driver, NptProductGroupUI.CREATE_PRODUCT_GROUP_BUTTON);
    }

    public void clickSaveButton() {
        clickToElement(driver, NptProductGroupUI.SAVE_BUTTON);
    }

    public String getWarningMessage() {
        return getElementText(driver, NptProductGroupUI.WARNING_MESSAGE);
    }

    public void clickCloseWarningPopup() {
        clickToElement(driver, NptProductGroupUI.CLOSE_WARNING_POPUP_BUTTON);
    }
}
