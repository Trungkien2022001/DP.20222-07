package views.screen.popup;

public class PopupScreen {
    Popup popup = null;
    public Popup getPopup(String type){
        switch (type) {
            case 'ERROR' :
                popup = new ErrorPopup();
                break;
            case 'SUCCESS':
                popup = new SuccessPopup();
                break;
            case 'LOADING':
                popup = new LoadingPopup();
                break;
            // More popup type
            default:
                break;
        }
        return popup;
    }
}
