import dto.Button;
import dto.CheckBox;

public interface UIFactory {
    Button createButton();
    CheckBox createCheckBox();
}
