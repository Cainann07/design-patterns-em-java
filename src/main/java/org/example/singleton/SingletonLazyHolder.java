package org.example;



// Singleton "apressado"
// - é thread safe
// @author Cainann07
public class SingletonLazyHolder {
    private static class InstanceHolder{ // Encapsulando a instância
        public static SingletonLazyHolder instancia = new SingletonLazyHolder(); //
    }

    private SingletonLazyHolder(){
        super();
    }

    public static SingletonLazyHolder getInstancia(){
        return InstanceHolder.instancia;
    }
}
