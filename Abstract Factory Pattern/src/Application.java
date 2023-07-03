import dto.Button;
import dto.CheckBox;

public class Application {
    private final Button button;
    private final CheckBox checkBox;

    public Application(UIFactory uiFactory) {
        this.button = uiFactory.createButton();
        this.checkBox = uiFactory.createCheckBox();
    }

    public void paint() {
        button.paint();
        checkBox.paint();
    }
}
