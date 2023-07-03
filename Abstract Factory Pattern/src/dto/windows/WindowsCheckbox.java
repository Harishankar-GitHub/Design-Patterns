package dto.windows;

import dto.CheckBox;

public class WindowsCheckbox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("Windows CheckBox");
    }
}
