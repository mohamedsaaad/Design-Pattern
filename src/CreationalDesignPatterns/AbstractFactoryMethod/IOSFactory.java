package CreationalDesignPatterns.AbstractFactoryMethod;

public class IOSFactory  implements IUserInterFace{
    @Override
    public IOSAlert getAlert() {
        IOSAlert alert=new IOSAlert();
        return alert;
    }

    @Override
    public IOSNButton getButton() {
        IOSNButton button=new IOSNButton();
        return button;
    }
}
