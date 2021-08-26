package com.meli;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Os carros pesam 1.000 Kg
        // Tem 4 rodas
        // Criando carro
        HashMap<Integer, Veiculo> veiculo = new HashMap<>();

        veiculo.put(1, new Carro("Gol", "H8PE31", 100, 3.6, 23.7));
        veiculo.put(2, new Moto("Suzuki", "S23RT1", 125, 4.7, 29.5));
        System.out.println(veiculo);
        System.out.println(veiculo);

    }
}
