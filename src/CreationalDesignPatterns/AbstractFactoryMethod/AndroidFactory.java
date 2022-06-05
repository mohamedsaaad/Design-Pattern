package CreationalDesignPatterns.AbstractFactoryMethod;

public class AndroidFactory implements IUserInterFace {
    @Override
    public AndroidAlert getAlert() {
        AndroidAlert alert=new AndroidAlert();
        return alert;
    }

    @Override
    public AndroidNButton getButton() {
        AndroidNButton button=new AndroidNButton();
        return button;
    }
}
