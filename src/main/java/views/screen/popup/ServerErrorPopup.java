package views.screen.popup;

import views.screen.ViewsConfig;

public class ErrorPopup extends Popup{
    private final String path = ViewsConfig.IMAGE_PATH + "/" + "tickerror.png";
    public  void showPopup(String message) throws IOException{
        super.popup(message, path, true).show(true);
    }
}
