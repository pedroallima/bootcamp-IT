package com.meli;

public class Moto extends Veiculo {
    public Moto(String marca, String placa, double velocidade, double aceleracao, double anguloDeVirada) {
        super(marca, placa, velocidade, aceleracao, anguloDeVirada);
        tipo ="Moto";
        peso = 1000;
        rodas = 4;

    }
    public Moto(String placa){
        super(placa);
    }
}

