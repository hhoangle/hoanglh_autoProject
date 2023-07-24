package NPT.NptPageObjects.NptPageUIs;

public class NptSalesOrderUI {
    public static final String CREATE_SALES_ORDER_BUTTON = "//button[contains(text(),'Tạo mới đơn bán hàng')]";
    public static final String CONTINUE_BUTTON = "//button[contains(text(),'Tiếp tục')]";
    public static final String CONFIRM_BUTTON = "//button[contains(text(),'Xác nhận đơn')]";
    public static final String WARNING_MESSAGE = "//p[contains(text(),'Vui lòng chọn CHTH')]";
    public static final String STORE_DROPDOWN_BUTTON = "//div[@class='multiselect__select']";
    public static final String STORE_NAME = "//ul[@id='listbox-null']/li[1]";
    public static final String SALE_ORDER_STATUS = "//div[@class='flex justify-between items-center']/button";
    public static final String VIEW_INVOICE_BUTTON = "//button[contains(text(),'Xem hoá đơn')]";
    public static final String ORDER_CODE = "//div[@class='flex justify-between items-center']/div/p[1]";
    public static final String ORDER_CODE_IN_INVOICE = "//p[@class='font-medium']/following-sibling::p[1]";
}
