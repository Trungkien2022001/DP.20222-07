package views.screen.popup;

import views.screen.ViewsConfig;

public class SuccessPopup extends Popup{
    private final String path = ViewsConfig.IMAGE_PATH + "/" + "tickgreen.png";
    public  void showPupop(String message) throws IOException{
        super.popup(message, path, true).show(true);
    }
}
