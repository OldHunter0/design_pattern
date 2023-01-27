package singleton;

//饿汉，线程安全
public class SingleObjectV2 {
    private static final SingleObjectV2 instance=new SingleObjectV2();
    private SingleObjectV2(){

    }

    
}
