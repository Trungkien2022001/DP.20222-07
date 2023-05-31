package views.screen.intro;

import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class ConcreteIntroScreenHandler extends IntroScreenHandler {

    public ConcreteIntroScreenHandler(Stage stage, String screenPath) throws IOException {
        super(stage, screenPath);
    }

    @Override
    protected File getLogoFile() {
        return new File("src/main/resources/assets/images/Logo.png");
    }
}

