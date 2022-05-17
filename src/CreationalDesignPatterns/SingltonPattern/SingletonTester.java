package CreationalDesignPatterns.SingltonPattern;

public class SingletonTester extends Thread {
    //da singleton ysht3'l 3ade gedn fel sigle thread implementation
    //lakn fel multi-thread momkn elatnen thread ywslo le condition fe object abl keda
    //wala la fe nafs ela7za wda hy3ml create l aktr mn instance
    public void run(){
        SingletonThreadSafty s=SingletonThreadSafty.getInstance();
        System.out.println(s);
    }
    public static void main(String[] args) {
        for (int i = 0; i <100 ; i++) {
            SingletonTester tester=new SingletonTester();
            tester.start();
        }
    }
}
