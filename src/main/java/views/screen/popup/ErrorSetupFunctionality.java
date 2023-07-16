package views.screen.popup;

import views.screen.ViewsConfig;

public class ErrorSetupFunctionality extends PopupScreen implements ErrorPopupStrategy {
    private String resource;
    private final String msg = 'ErrorSetupFunctionality';

    public ErrorSetupFunctionality(String resource) {
        this.resource = resource;
    }

    public void showEror(){
            super.popup(msg + resource, ViewsConfig.IMAGE_PATH + "/" + "tickerror.png", false)
                    super.show(false);
    }
}
