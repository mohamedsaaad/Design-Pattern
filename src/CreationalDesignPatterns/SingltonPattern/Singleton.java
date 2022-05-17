package CreationalDesignPatterns.SingltonPattern;

public class Singleton {
    public static Singleton unique;
    private Singleton(){
        //momkn el constructor da ykon by3ml 7aga kbera bta5od w2t by parse ktab
        //byklm server ygeb mno database msl f3shan keda msh s7 enna
        //n3ml eager initialization
        //unique=new Singleton(); la da 3'lt elmfrod a3ml da w2t m7tag a3ml instance mn el class
    }
    public static Singleton getInstance(){
        if(unique==null){
            unique=new Singleton();
        }
        return unique;
    }
}
