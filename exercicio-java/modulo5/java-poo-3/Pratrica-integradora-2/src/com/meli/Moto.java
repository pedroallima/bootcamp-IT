package com.meli;

public class Moto extends Veiculo{
    private final double peso = 300;
    private final int rodas = 2;

    public Moto (double velocidade, double aceleracao, double anguloDeVirada, String marca, String placa){
        super( velocidade, aceleracao, anguloDeVirada, marca, peso, rodas, placa);
    }


}
