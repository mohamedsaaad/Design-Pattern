package CreationalDesignPatterns.SingltonPattern;

public class SingletonThreadSafty {
    //volatile de 3shan lo instance d5l el condition w3ml create l obj 7ata lw 3amel double check
    //momkn ykon el kym fel cache wkol obj sh3'al fe thread sh3'al fe cache monfsl
    //fmysm3sh 3ndo en feh object et create fl 7l hwa volatile wda bygbr ae thread byst5dm el object
    //el volatile da swa2 htkb feh aw ht reado tro7 tgegbo mel main memory 3ala tol.
    public static volatile SingletonThreadSafty unique;
    private SingletonThreadSafty(){
        //momkn el constructor da ykon by3ml 7aga kbera bta5od w2t by parse ktab
        //byklm server ygeb mno database msl f3shan keda msh s7 enna
        //n3ml eager initialization
        //unique=new Singleton(); la da 3'lt elmfrod a3ml da w2t m7tag a3ml instance mn el class
    }
    public static SingletonThreadSafty getInstance(){
        if(unique==null){
            //synchronization class level: wda m3nah en mfesh aktr mn object mn nfs el class da (SingletonThreadSafty)
            // fe nfs elw2t
           synchronized (SingletonThreadSafty.class){
               if(unique == null) //double check
                    unique=new SingletonThreadSafty();
           }
        }
        return unique;
    }
}
