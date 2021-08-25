package com.meli;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Os carros pesam 1.000 Kg
        // Tem 4 rodas
        // Criando carro
        HashMap<Integer,Veiculo> veiculo = new HashMap<>();

        veiculo.put(1,new Carro(200,180,90,"Gol","BGQ9800098"));
        veiculo.put(2,new Carro(200,180,90,"Fiate","BGQ9800098"));
        veiculo.put(1,new Moto(200,180,90,"Suzuki","BGQ9800098"));
        veiculo.put(2,new Moto(200,180,90,"yamaha","BGQ9800098"));

    }
}
