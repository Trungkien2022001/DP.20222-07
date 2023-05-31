package views.screen.invoice;

import common.exception.ProcessInvoiceException;
import controller.PaymentController;
import entity.invoice.Invoice;
import entity.order.Order;
import entity.shipping.DeliveryInfo;
import entity.order.OrderItem;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import utils.Utils;
import views.screen.BaseScreenHandler;
import views.screen.ViewsConfig;
import views.screen.payment.ConcretePaymentScreenHandler;
import views.screen.payment.PaymentScreenHandler;
import views.screen.popup.ErrorPopupScreen;
import views.screen.popup.PopupScreen;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Logger;
//Single Responsibility Principle) class "InvoiceScreenHandler" có phương thức phụ trách quá nhiều công việc.
//setupData(Object dto)
//		Thiết lập dữ liệu cho các thành phần giao diện người dùng (label, vbox).
//		Xử lý danh sách invoice.getOrder().getListOrderMedia() để tạo ra các MediaInvoiceScreenHandler và thêm chúng vào vboxItems.


public abstract class InvoiceScreenHandler extends BaseScreenHandler {
	// Procedure cohesion
	private static Logger LOGGER = Utils.getLogger(InvoiceScreenHandler.class.getName());

	@FXML
	private Label pageTitle;

	@FXML
	protected Label name;

	@FXML
	protected Label phone;

	@FXML
	protected Label province;

	@FXML
	protected Label address;

	@FXML
	protected Label instructions;

	@FXML
	protected Label subtotal;

	@FXML
	protected Label shippingFees;

	@FXML
	protected Label total;

	@FXML
	protected VBox vboxItems;

	private Invoice invoice;

	public InvoiceScreenHandler(Stage stage, String screenPath, Invoice invoice) throws IOException {
		super(stage, screenPath);
		try {
			setupData(invoice);
			setupFunctionality();
		} catch (IOException ex) {
			LOGGER.info(ex.getMessage());
			ErrorPopupScreen.error("Error when loading resources.");
		} catch (Exception ex) {
			LOGGER.info(ex.getMessage());
			ErrorPopupScreen.error(ex.getMessage());
		}
	}

	protected abstract void setupData(Object dto) throws Exception;

	protected  abstract void setupFunctionality() throws Exception;

	@FXML
	void confirmInvoice(MouseEvent event) throws IOException {
		BaseScreenHandler paymentScreen = new ConcretePaymentScreenHandler(this.stage, ViewsConfig.PAYMENT_SCREEN_PATH, invoice);
		paymentScreen.setBController(new PaymentController());
		paymentScreen.setPreviousScreen(this);
		paymentScreen.setHomeScreenHandler(homeScreenHandler);
		paymentScreen.setScreenTitle("Payment Screen");
		paymentScreen.show();
		LOGGER.info("Confirmed invoice");
	}
}
