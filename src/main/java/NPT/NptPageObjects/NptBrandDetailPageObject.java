package NPT.NptPageObjects;

import NPT.NptPageObjects.NptPageUIs.NptBrandDetailPageUI;
import commons.BasePage;
import org.openqa.selenium.WebDriver;

public class NptBrandDetailPageObject extends BasePage {
    private WebDriver driver;
    public NptBrandDetailPageObject(WebDriver driver) {
        this.driver = driver;
    }
    public String getBrandNameInDetailPage(){
        waitForLoadingIconInvisible(driver);
        waitForElementVisible(driver, NptBrandDetailPageUI.BRAND_NAME_IN_DETAIL_PAGE);
        return getElementText(driver, NptBrandDetailPageUI.BRAND_NAME_IN_DETAIL_PAGE);
    }

    public String getClassification() {
        waitForElementVisible(driver, NptBrandDetailPageUI.CLASSIFICATION_IN_DETAIL_PAGE);
        return getElementText(driver, NptBrandDetailPageUI.CLASSIFICATION_IN_DETAIL_PAGE);
    }
}
