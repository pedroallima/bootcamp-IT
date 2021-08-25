package com.meli;

public class Carro extends Veiculo{
 private final double peso = 1000;
 private final int rodas = 4;

    public Carro (double velocidade, double aceleracao, double anguloDeVirada, String marca, String placa){
        super( velocidade, aceleracao, anguloDeVirada, marca, peso, rodas,  placa);
    }

}
