package pacoteExemplos.StrategyPack;

public class Robo {
    private Comportamento comportamento;

    public void setStrategy(Comportamento agressivo){
        this.comportamento = agressivo;
    }

    public void mover(){
        comportamento.mover();
    }
}
