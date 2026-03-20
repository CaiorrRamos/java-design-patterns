package one.digital.inovation.gof;


import one.digital.inovation.gof.facade.Facade;
import one.digital.inovation.gof.singleton.SingletonEager;
import one.digital.inovation.gof.singleton.SingletonLazy;
import one.digital.inovation.gof.singleton.SingletonLazyHolder;
import one.digital.inovation.gof.strategy.*;

public class Teste {

    public static void main(String[] args) {
        // Testes em relação ao Design Pattern
        // Singleton:

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        // Sgtrategy:

        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();

        // Facade

        Facade facade = new Facade();
        facade.migrarCliente("Caio", "55750460");
        

    }
}
