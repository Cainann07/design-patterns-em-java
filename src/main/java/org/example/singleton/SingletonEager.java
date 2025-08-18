package org.example;


// Singleton "apressado"
// @author Cainann07
public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager(); // Agora a instância é criada assim que a classe é acionada

    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstancia(){
        return instancia;
    }
}
