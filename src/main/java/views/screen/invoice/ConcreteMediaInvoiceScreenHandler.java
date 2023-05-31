package views.screen.invoice;

import views.screen.ViewsConfig;

import java.io.IOException;
import java.sql.SQLException;

public class ConcreteMediaInvoiceScreenHandler extends MediaInvoiceScreenHandler {

    public ConcreteMediaInvoiceScreenHandler(String screenPath) throws IOException {
        super(screenPath);
    }

    @Override
    protected void setMediaInfo() throws SQLException {
        title.setText(orderItem.getMedia().getTitle());
        price.setText(ViewsConfig.getCurrencyFormat(orderItem.getPrice()));
        numOfProd.setText(String.valueOf(orderItem.getQuantity()));
        setImage(image, orderItem.getMedia().getImageURL());
        setImageProperties();
    }
}
