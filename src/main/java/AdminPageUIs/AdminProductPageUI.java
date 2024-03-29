package AdminPageUIs;

public class AdminProductPageUI {
    public static final String CREATE_PRODUCT_BUTTON = "//p[text()='Tạo sản phẩm mới']";
    public static final String MANAGE_PRODUCT = "//a[text()='Sản phẩm']";
    public static final String SAVE_PRODUCT = "//button[contains(text(),'Lưu lại')]";
    public static final String WARNING_MESSAGE = "//p[contains(text(),'Tạo sản phẩm không thành công')]";
    public static final String CLOSE_POPUP_BUTTON = "//p[contains(text(),'Đóng')]";
    public static final String PRODUCT_NAME_FIELD = "//input[@placeholder='Nhập tên sản phẩm']";
    public static final String BARCODE_FIELD = "//input[@placeholder='Nhập mã vạch']";
    public static final String PRODUCT_IMAGE = "//div[@class='bg-white rounded-lg p-5 mb-4']//input[@type='file']";
    public static final String SELLING_PRICE_FIELD = "//input[@placeholder='Nhập giá bán']";
    public static final String IMPORT_PRICE_FIELD = "//input[@placeholder='Nhập giá nhập']";
    public static final String QUANTITY_FIELD = "//p[text()='Mẫu mã mặc định']//ancestor::div[@class='bg-white p-5 border border-gray-light rounded-lg']//div[@class='input__container'][2]/label/following-sibling::div/input";
    public static final String PRODUCT_DESCRIPTION_FIELD = "//textarea[@placeholder='Nhập mô tả']";
    public static final String SELLING_PRICE_TEXT = "//p[contains(text(),'Giá bán')]//following-sibling::p";
    public static final String IMPORT_PRICE_TEXT = "//p[contains(text(),'Giá nhập')]//following-sibling::p";
    public static final String BRAND_NAME_TEXT_IN_DETAIL_PAGE = "//p[contains(text(),'Thương hiệu')]//following-sibling::p";
    public static final String PRODUCT_NAME_TEXT = "//p[contains(text(),'Tên sản phẩm')]/following-sibling::p";
    public static final String BRAND_NAME_DROPDOWN = "//p[text()='Thương hiệu']/following-sibling::div";
    public static final String BRAND_NAME = "//p[text()='Thương hiệu']/following-sibling::div[1]//li[@id='null-0']";
    public static final String ADD_INFO_TEXT = "//div[contains(text(),'Thông tin thêm')]";
    public static final String BRAND_NAME_TEXT = "//p[text()='Thương hiệu']/following-sibling::div/div[2]//span";

    public static final String PRODUCT_CATEGORY_DROPDOWN = "//p[text()='Ngành hàng']/following-sibling::div";
    public static final String PRODUCT_CATEGORY_NAME = "//p[text()='Ngành hàng']/following-sibling::div[1]//li[@id='null-0']";
    public static final String PRODUCT_CATEGORY_NAME_TEXT = "//p[text()='Ngành hàng']/following-sibling::div/div[2]//span";
    public static final String PRODUCT_GROUP_DROPDOWN = "//p[text()='Nhóm sản phẩm']/following-sibling::div";
    public static final String PRODUCT_GROUP_NAME = "//p[text()='Nhóm sản phẩm']/following-sibling::div[1]//li[@id='null-0']";
    public static final String PRODUCT_GROUP_NAME_TEXT = "//p[text()='Nhóm sản phẩm']/following-sibling::div/div[2]//span";
    public static final String PRODUCT_CATEGORY_NAME_TEXT_IN_DETAIL_PAGE = "//p[contains(text(),'Ngành hàng')]//following-sibling::p";

    public static final String PRODUCT_GROUP_NAME_TEXT_IN_DETAIL_PAGE = "//p[contains(text(),'Nhóm sản phẩm')]//following-sibling::p";
    public static final String VARIANT_NAME = "//input[@placeholder='Nhập tên mẫu mã']/parent::div";
    public static final String ADD_VARIANT_BUTTON = "//*[contains(text(),'Thêm thuộc tính')]";
    public static final String VARIANT_NAME_FIELD = "//input[@placeholder='Nhập tên thuộc tính']";
    public static final String VARIANT_VALUE_FIELD ="//input[@placeholder='Nhập giá trị thuộc tính...']";
    public static final String VARIANT_BARCODE_FIELD = "(//input[@placeholder='Nhập mã vạch'])[2]";
    public static final String VARIANT_QUANTITY_FIELD = "(//input[@placeholder='Nhập tồn'])[1]";
    public static final String PRODUCT_BAR_CODE_TEXT_IN_DETAIL_PAGE = "//p[contains(text(),'Mã vạch')]//following-sibling::p";
    public static final String PRODUCT_DESCRIPTION_TEXT_IN_DETAIL_PAGE = "//p[contains(text(),'Mô tả sản phẩm')]//following-sibling::p";
    public static final String VARIANT_NAME_TEXT_IN_DETAIL_PAGE = "//div[@class='mb-4']/p";
    public static final String VARIANT_VALUE_TEXT_IN_DETAIL_PAGE = "//div[@class='flex flex-wrap gap-2']/p";
    public static final String PRODUCT_STATUS_TOGGLE_BUTTON = "//p[text()='Trạng thái']/parent::div/div[1]/div[1]/label";
    public static final String PRODUCT_STATUS = "//div[@class='flex items-center gap-2']/p";
    public static final String SELL_ONLINE_STATUS = "//div[@class='flex items-center justify-between pt-4']/div/p";
    public static final String SELL_ONLINE_STATUS_AFTER_SWITCH_OFF = "//div[@class='flex items-center justify-between pt-4']/div/p";
    public static final String PRODUCT_STATUS_AFTER_SWITCH_OFF = "//div[@class='flex items-center gap-2']/p";
    public static final String SELL_ONLINE_STATUS_TOGGLE_BUTTON = "//p[text()='Bán online']/parent::div/div[1]/div[1]/label";
}
