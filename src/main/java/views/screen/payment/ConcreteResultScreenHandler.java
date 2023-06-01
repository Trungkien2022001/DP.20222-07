package views.screen.payment;

import javafx.stage.Stage;

import java.io.IOException;
import java.util.Map;

public class ConcreteResultScreenHandler extends ResultScreenHandler {

    public ConcreteResultScreenHandler(Stage stage, String screenPath, Map<String, String> response) throws IOException {
        super(stage, screenPath, response);
    }

    @Override
    protected void setupFunctionality() throws Exception {
        // Implement specific functionality for the concrete result screen handler
    }
}
