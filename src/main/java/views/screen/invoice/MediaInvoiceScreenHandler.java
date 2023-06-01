package views.screen.invoice;

import java.io.IOException;
import java.sql.SQLException;

import entity.order.OrderItem;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import views.screen.FXMLScreenHandler;
import views.screen.ViewsConfig;

public abstract  class MediaInvoiceScreenHandler extends FXMLScreenHandler{

    @FXML
    private HBox hboxMedia;

    @FXML
    private VBox imageLogoVbox;

    @FXML
    protected ImageView image;

    @FXML
    private VBox description;

    @FXML
    protected Label title;

    @FXML
    protected Label numOfProd;

    @FXML
    private Label labelOutOfStock;

    @FXML
    protected Label price;

    protected OrderItem orderItem;

    public MediaInvoiceScreenHandler(String screenPath) throws IOException{
        super(screenPath);
    }

    public void setOrderItem(OrderItem orderItem) throws SQLException{
        this.orderItem = orderItem;
        setMediaInfo();
    }

    protected abstract void setMediaInfo() throws SQLException;

    protected void setImageProperties() {
        image.setPreserveRatio(false);
        image.setFitHeight(90);
        image.setFitWidth(83);
    }
}
