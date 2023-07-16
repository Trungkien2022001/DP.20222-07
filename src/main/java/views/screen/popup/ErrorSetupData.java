package views.screen.popup;

public class ErrorLoadingResource extends PopupScreen implements ErrorPopupStrategy {
    public ErrorLoadingResource(string resource){
        this.resource = resource
    }

    private string resource,

    private final msg = 'ErrorLoadingSource'
    public void showEror(){
            popup(message, ViewsConfig.IMAGE_PATH + "/" + "tickerror.png", false)
                    .show(false);
    }
}
