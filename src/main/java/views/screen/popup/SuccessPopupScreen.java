package views.screen.popup;

import javafx.stage.Stage;
import views.screen.ViewsConfig;

import java.io.IOException;

public class SuccessPopupScreen extends PopupScreen {

    public SuccessPopupScreen(Stage stage) throws IOException {
        super(stage, ViewsConfig.POPUP_PATH);
    }

    @Override
    protected String getImagePath() {
        return ViewsConfig.IMAGE_PATH + "/" + "tickgreen.png";
    }

    public static void success(String message) throws IOException {
        SuccessPopupScreen popup = new SuccessPopupScreen(new Stage());
        popup.setMessage(message);
        popup.show(true);
    }
}