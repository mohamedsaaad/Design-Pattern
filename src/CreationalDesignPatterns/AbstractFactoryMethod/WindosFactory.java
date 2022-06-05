package CreationalDesignPatterns.AbstractFactoryMethod;

public class WindosFactory  implements IUserInterFace{
    @Override
    public WindowsAlert getAlert() {
        WindowsAlert alert=new WindowsAlert();
        return alert;
    }

    @Override
    public WindowsNButton getButton() {
        WindowsNButton button=new WindowsNButton();
        return button;
    }
}
