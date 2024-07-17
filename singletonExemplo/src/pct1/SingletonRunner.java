package pct1;



public class SingletonRunner {
    
    private static SingletonRunner instance = new SingletonRunner();

    private SingletonRunner() {
        super();
    }

    public static SingletonRunner getInstancia(){
        return instance;
    }
}
