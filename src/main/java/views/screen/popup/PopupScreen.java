package views.screen.popup;

import javafx.animation.PauseTransition;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;
import views.screen.BaseScreenHandler;
import views.screen.ViewsConfig;

import java.io.IOException;

//Single Responsibility Principle) class "PopupScreen" có phương thức phụ trách quá nhiều công việc.
//Lớp PopupScreen bao gồm hiển thị các loại popup khác nhau (success, error, loading), đặt nội dung và hình ảnh cho popup,
// điều khiển thời gian hiển thị và đóng popup.
// Điều này làm cho lớp này không tuân thủ nguyên tắc SRP, vì nó thực hiện nhiều chức năng không liên quan.

//Phương thức show, close và setImage cũng không tuân thủ nguyên tắc SRP.





public abstract class PopupScreen extends BaseScreenHandler {

    @FXML
    ImageView icon;

    @FXML
    Label message;

    public PopupScreen(Stage stage, String screenPath) throws IOException {
        super(stage, screenPath);
    }

    protected abstract String getImagePath();

    protected void setMessage(String messageText) {
        message.setText(messageText);
    }

    protected void setImage() {
        super.setImage(icon, getImagePath());
    }

    public void show(boolean autoClose) {
        super.show();
        if (autoClose) {
            close(0.8);
        }
    }

    public void show(double time) {
        super.show();
        close(time);
    }

    public void close(double time) {
        PauseTransition delay = new PauseTransition(Duration.seconds(time));
        delay.setOnFinished(event -> stage.close());
        delay.play();
    }

    protected void setupData(Object dto) throws Exception {
    }

    protected void setupFunctionality() throws Exception {
    }

}
