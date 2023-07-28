package NPT.NptPageObjects;
import NPT.NptPageObjects.NptPageUIs.NptCreateEmployeeUI;
import commons.BasePage;
import org.openqa.selenium.WebDriver;

public class NptCreateEmployeePageObject extends BasePage {
    private WebDriver driver;
    public NptCreateEmployeePageObject(WebDriver driver) {
        this.driver = driver;
    }

    public void clickToCreateEmployeeButton() {
        waitForLoadingIconInvisible(driver);
        clickToElement(driver, NptCreateEmployeeUI.CREATE_EMPLOYEE_BUTTON);
    }

    public void insertEmployeeInfor(String inputValue, String inputNameField) {
        sendKeyToElement(driver, NptCreateEmployeeUI.INPUT_FIELD, inputValue,inputNameField);
    }

    public void selectPosition() {
        clickToElement(driver, NptCreateEmployeeUI.POSITION_DROPDOWN);
        sleepInSecond(1);
        clickToElement(driver, NptCreateEmployeeUI.POSITION_OPTION);
    }
}
