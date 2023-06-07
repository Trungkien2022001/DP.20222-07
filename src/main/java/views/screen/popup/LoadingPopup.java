package views.screen.popup;

import views.screen.ViewsConfig;

public class LoadingPopup extends Popup{
    private final String path = ViewsConfig.IMAGE_PATH + "/" + "loading.gif";
    public  void showPupop(String message) throws IOException{
        super.popup(message, path, true).show(true);
    }
}
