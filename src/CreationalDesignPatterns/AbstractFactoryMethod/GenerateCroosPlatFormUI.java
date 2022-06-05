package CreationalDesignPatterns.AbstractFactoryMethod;

public class GenerateCroosPlatFormUI {


    public static void main(String[] args) {
        IUserInterFace iUserInterFace;
        Alert alert=null;
        NButton button=null;
        String type="Windos";
        if(type.equals("IOS")){
            iUserInterFace= new IOSFactory();
            alert=iUserInterFace.getAlert();
            button=iUserInterFace.getButton();
        }else if(type.equals("Android")){
            iUserInterFace= new AndroidFactory();
            alert=iUserInterFace.getAlert();
            button=iUserInterFace.getButton();
        }else if(type.equals("Windos")) {
            iUserInterFace= new WindosFactory();
            alert =iUserInterFace.getAlert();
            button=iUserInterFace.getButton();
        }
        alert.print();
        button.print();
    }


}
