package views.screen.shipping;

import entity.invoice.Invoice;
import entity.order.Order;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import views.screen.BaseScreenHandler;
import views.screen.ViewsConfig;
import views.screen.invoice.InvoiceScreenHandler;

import java.io.IOException;
import java.sql.SQLException;

public class ConcreteShippingScreenHandler extends ShippingScreenHandler {
    public ConcreteShippingScreenHandler(Stage stage, String screenPath, Order order) throws IOException {
        super(stage, screenPath, order);
    }

    @Override
    protected void submitDeliveryInfo(MouseEvent event) throws IOException, InterruptedException, SQLException {
        // Implement the submission logic here
        preprocessDeliveryInfo();

        Invoice invoice = getBController().createInvoice(order);
        BaseScreenHandler invoiceScreenHandler = new InvoiceScreenHandler(this.stage, ViewsConfig.INVOICE_SCREEN_PATH, invoice);
        invoiceScreenHandler.setPreviousScreen(this);
        invoiceScreenHandler.setHomeScreenHandler(homeScreenHandler);
        invoiceScreenHandler.setScreenTitle("Invoice Screen");
        invoiceScreenHandler.setBController(getBController());
        invoiceScreenHandler.show();
    }
}
