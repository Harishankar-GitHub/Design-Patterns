import dto.Button;
import dto.CheckBox;
import dto.windows.WindowsButton;
import dto.windows.WindowsCheckbox;

public class WindowsUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckbox();
    }
}
