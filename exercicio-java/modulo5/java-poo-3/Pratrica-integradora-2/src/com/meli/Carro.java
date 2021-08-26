package com.meli;

public class Carro extends Veiculo {
    public Carro(String marca, String placa, double velocidade, double aceleracao, double anguloDeVirada) {
        super(marca, placa, velocidade, aceleracao, anguloDeVirada);
        tipo ="Carro";
        peso = 1000;
        rodas = 4;

    }
    public Carro(String placa){
        super(placa);
    }
}

