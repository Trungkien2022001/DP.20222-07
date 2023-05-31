package views.screen.invoice;

import common.exception.ProcessInvoiceException;
import entity.invoice.Invoice;
import entity.order.Order;
import entity.order.OrderItem;
import entity.shipping.DeliveryInfo;
import javafx.stage.Stage;
import views.screen.ViewsConfig;

import java.io.IOException;
import java.sql.SQLException;

public class ConcreteInvoiceScreenHandler extends InvoiceScreenHandler {

    public ConcreteInvoiceScreenHandler(Stage stage, String screenPath, Invoice invoice) throws IOException {
        super(stage, screenPath, invoice);
    }

    @Override
    protected void setupData(Object dto) throws Exception {
        Invoice invoice = (Invoice) dto;
        Order order = invoice.getOrder();
        DeliveryInfo deliveryInfo = order.getDeliveryInfo();

        name.setText(deliveryInfo.getName());
        phone.setText(deliveryInfo.getPhone());
        province.setText(deliveryInfo.getProvince());
        instructions.setText(deliveryInfo.getShippingInstructions());
        address.setText(deliveryInfo.getAddress());

        subtotal.setText(ViewsConfig.getCurrencyFormat(order.getSubtotal()));
        shippingFees.setText(ViewsConfig.getCurrencyFormat(order.getShippingFees()));
        total.setText(ViewsConfig.getCurrencyFormat(order.getTotal()));

        invoice.getOrder().getListOrderMedia().forEach(orderMedia -> {
            try {
                MediaInvoiceScreenHandler mis = new MediaInvoiceScreenHandler(ViewsConfig.INVOICE_MEDIA_SCREEN_PATH) {
                    @Override
                    protected void setMediaInfo() throws SQLException {

                    }
                };
                mis.setOrderItem((OrderItem) orderMedia);
                vboxItems.getChildren().add(mis.getContent());
            } catch (IOException | SQLException e) {
                System.err.println("errors: " + e.getMessage());
                throw new ProcessInvoiceException(e.getMessage());
            }
        });
    }

    @Override
    protected void setupFunctionality() throws Exception {
        // Implement specific functionality for the concrete invoice screen handler
    }
}