package views.screen.home;

import common.interfaces.Observable;
import common.interfaces.Observer;
import views.screen.FXMLScreenHandler;

import java.io.IOException;

public abstract class MediaHandlerTemplate extends FXMLScreenHandler implements Observer {
    public MediaHandlerTemplate(String screenPath) throws IOException {
        super(screenPath);
    }

    @Override
    public void update(Observable observable) {
        if (observable instanceof MediaHandler) {
            update((MediaHandler) observable);
        }
    }

    protected abstract void update(MediaHandler mediaHandler);
}
