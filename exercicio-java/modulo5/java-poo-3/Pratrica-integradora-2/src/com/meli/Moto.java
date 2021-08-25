package com.meli;

public class Moto extends Veiculo {
    public Moto(String marca, String placa, double velocidade, double aceleracao, double anguloDeVirada) {
        super(marca, placa, velocidade, aceleracao, anguloDeVirada);
        setTipo("Carro");
        setPeso(300);
        setRodas(2);
    }
}

