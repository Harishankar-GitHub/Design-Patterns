import dto.Button;
import dto.CheckBox;
import dto.mac.MacButton;
import dto.mac.MacCheckbox;

public class MacUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckbox();
    }
}
