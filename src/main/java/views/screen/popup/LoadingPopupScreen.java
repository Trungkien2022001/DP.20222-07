package views.screen.popup;

import javafx.stage.Stage;
import views.screen.ViewsConfig;

import java.io.IOException;

public class LoadingPopupScreen extends PopupScreen {

    public LoadingPopupScreen(Stage stage) throws IOException {
        super(stage, ViewsConfig.POPUP_PATH);
    }

    @Override
    protected String getImagePath() {
        return ViewsConfig.IMAGE_PATH + "/" + "loading.gif";
    }

    public static LoadingPopupScreen loading(String message) throws IOException {
        LoadingPopupScreen popup = new LoadingPopupScreen(new Stage());
        popup.setMessage(message);
        return popup;
    }
}
