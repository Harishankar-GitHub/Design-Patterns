package dto.windows;

import dto.Button;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Windows Button");
    }
}
