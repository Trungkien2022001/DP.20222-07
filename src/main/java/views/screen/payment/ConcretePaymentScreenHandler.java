package views.screen.payment;

import controller.PaymentController;
import entity.invoice.Invoice;
import javafx.stage.Stage;
import views.screen.BaseScreenHandler;
import views.screen.ViewsConfig;

import java.io.IOException;
import java.util.Map;

public class ConcretePaymentScreenHandler extends PaymentScreenHandler {


    public ConcretePaymentScreenHandler(Stage stage, String screenPath, Invoice invoice) throws IOException {
        super(stage, screenPath, invoice);
    }

    @Override
    protected void confirmToPayOrder() throws IOException {
        String contents = "pay order";
        PaymentController ctrl = (PaymentController) getBController();
        Map<String, String> response = ctrl.payOrder(invoice.getAmount(), contents, cardNumber.getText(), holderName.getText(),
                expirationDate.getText(), securityCode.getText());

        BaseScreenHandler resultScreen = new ConcretePaymentScreenHandler(this.stage, ViewsConfig.RESULT_SCREEN_PATH, invoice);
        resultScreen.setPreviousScreen(this);
        resultScreen.setHomeScreenHandler(homeScreenHandler);
        resultScreen.setScreenTitle("Result Screen");
        resultScreen.show();
    }
}
