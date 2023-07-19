package NPT.NptPageObjects.NptPageUIs;

public class NptProductCategoryDetailPageUI {
    public static final String PRODUCT_CATEGORY_NAME_IN_DETAIL_PAGE = "//p[contains(text(),'Ngành hàng')]/following-sibling::p";

    public static final String CLASSIFICATION_IN_DETAIL_PAGE = "//p[contains(text(),'Phân loại')]/following-sibling::p";
    public static final String PRODUCT_CATEGORY_DESCRIPTION_IN_DETAIL_PAGE = "//p[contains(text(),'Mô tả')]/following-sibling::p";
    public static final String ADD_PRODUCT_GROUP_BUTTON = "//button[contains(text(),'Tạo nhóm sản phẩm')]";
    public static final String PRODUCT_GROUP_NAME_FIELD_IN_DETAIL_PAGE = "//input[@placeholder='Tên nhóm sản phẩm']";
    public static final String CONFRIM_CREATE_PRODUCT_GROUP_IN_DETAIL_PAGE = "//button[contains(text(),'Xác nhận')]";
    public static final String PRODUCT_GROUP_NAME_TEXT_IN_DETAIL_PAGE = "//div[@class='flex items-center mb-4 p-4 bg-white rounded-lg relative']//p[1]";
}
