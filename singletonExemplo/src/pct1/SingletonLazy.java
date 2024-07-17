package pct1;



public class SingletonLazy {


    private static SingletonLazy instance;

    private SingletonLazy() {
        super();
    }   

    public static SingletonLazy getInstancia(){

        if(instance == null){
            instance = new SingletonLazy();
        }
        return instance;
    }
}
