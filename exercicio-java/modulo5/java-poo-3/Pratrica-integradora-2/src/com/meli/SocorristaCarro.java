package com.meli;

public class SocorristaCarro extends Veiculo {

    public SocorristaCarro(double velocidade, double aceleracao, double anguloDeVirada, String placa) {
        super(velocidade, aceleracao, anguloDeVirada, placa);
    }



    public void socorrer(Carro umCarro){
        System.out.println("Socorrendo carro placa " + umCarro);
    }
}
