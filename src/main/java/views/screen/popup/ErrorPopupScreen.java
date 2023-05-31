package views.screen.popup;

import javafx.stage.Stage;
import views.screen.ViewsConfig;

import java.io.IOException;

public class ErrorPopupScreen extends PopupScreen {

    public ErrorPopupScreen(Stage stage) throws IOException {
        super(stage, ViewsConfig.POPUP_PATH);
    }

    @Override
    protected String getImagePath() {
        return ViewsConfig.IMAGE_PATH + "/" + "tickerror.png";
    }

    public static void error(String message) throws IOException {
        ErrorPopupScreen popup = new ErrorPopupScreen(new Stage());
        popup.setMessage(message);
        popup.show(false);
    }
}

