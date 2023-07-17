package NPT.NptPageObjects;
import commons.BasePage;
import org.openqa.selenium.WebDriver;
import NPT.NptPageObjects.NptPageUIs.NptCategoryPageUI;

import static NPT.NptPageObjects.NptPageUIs.NptProductPageUI.PRODUCT_IMAGE;

public class NptCategoryPageObject extends BasePage{
    private WebDriver driver;
    public NptCategoryPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public void clickCreateBrandButton() {
        waitForElementVisible(driver, NptCategoryPageUI.CREATE_BRAND_BUTTON);
        clickToElement(driver, NptCategoryPageUI.CREATE_BRAND_BUTTON);
    }

    public void inputImg(String imagePath) {
        uploadImage(driver, PRODUCT_IMAGE, imagePath);
    }

    public void insertBrandName(String brandName) {
        waitForElementVisible(driver, NptCategoryPageUI.BRAND_NAME_FIELD);
        sendKeyToElement(driver, NptCategoryPageUI.BRAND_NAME_FIELD, brandName);
    }

    public NptBrandDetailPageObject clickSaveButton() {
        waitForElementVisible(driver, NptCategoryPageUI.SAVE_BRAND_BUTTON);
        clickToElement(driver, NptCategoryPageUI.SAVE_BRAND_BUTTON);
        return new NptBrandDetailPageObject(driver);
    }

    public String getWarningMessage() {
        waitForElementVisible(driver, NptCategoryPageUI.WARNING_MESSAGE);
        return getElementText(driver, NptCategoryPageUI.WARNING_MESSAGE);
    }

    public void clickCloseWarningPopup() {
        clickToElement(driver, NptCategoryPageUI.CLOSE_WARNING_POPUP_BUTTON);
    }
}
