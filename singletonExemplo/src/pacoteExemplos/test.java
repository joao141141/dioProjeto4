package pacoteExemplos;


import pacoteExemplos.StrategyPack.Comportamento;
import pacoteExemplos.StrategyPack.ComportamentoAgressivo;
import pacoteExemplos.StrategyPack.ComportamentoDefensivo;
import pacoteExemplos.StrategyPack.ComportamentoNormal;
import pacoteExemplos.StrategyPack.Robo;
import pacoteExemplos.singletonPack.SingletonLazy;
import pacoteExemplos.singletonPack.SingletonRunner;

public class test {


    public static void main(String[] args){

        //Testes Singleton
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonRunner runner = SingletonRunner.getInstancia();
        System.out.println(runner);
        runner = SingletonRunner.getInstancia();
        System.out.println(runner);


        //Stragety

        ComportamentoNormal normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();
        Comportamento defesa = new ComportamentoDefensivo();

        Robo robo = new Robo();
        robo.setStrategy(normal);


        robo.mover();
        robo.mover();

        robo.setStrategy(agressivo);
        robo.mover();
        robo.mover();

        robo.setStrategy(defesa);
        robo.mover();
        robo.mover();
    }
}
