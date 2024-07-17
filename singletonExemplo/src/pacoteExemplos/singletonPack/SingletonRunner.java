package pacoteExemplos.singletonPack;



public class SingletonRunner {


    private static class Holder{
    private static SingletonRunner instance = new SingletonRunner();
    }
    private SingletonRunner() {
        super();
    }

    public static SingletonRunner getInstancia(){
     return Holder.instance;
    }
}
