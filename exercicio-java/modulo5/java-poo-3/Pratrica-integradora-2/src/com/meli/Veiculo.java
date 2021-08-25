package com.meli;

public class Veiculo {
    public Veiculo(String marca, double peso, int rodas) {
    }
    /* ------------------------------------------------------------------------
    *1. Criar uma classe de veículo que tenha os seguintes ATRIBUTOS:
        ● Velocidade ● Aceleracao ● AnguloDeVirada ● Patente ● Peso ● Rodas
    ------------------------------------------------------------------------- */
    double Velocidade;
    double Aceleracao;
    double AnguloDeVirada;
    String Marca; //Patente
    double Peso; // extende
    int Rodas; // esstende
    public String Placa; // Placa
    public String Tipo; // Tipo carro ou Moto

    public Veiculo(String marca, double peso, int rodas, String placa) {
        this.Marca = marca;
        this.Peso = peso;
        this.Rodas = rodas;
        this.Placa = placa;
    }

    public Veiculo(double velocidade, double aceleracao, double anguloDeVirada, String marca, double peso, int rodas, String placa) {
        this.Velocidade = velocidade;
        this.Aceleracao = aceleracao;
        this.AnguloDeVirada = anguloDeVirada;
        this.Marca = marca;
        this.Peso = peso;
        this.Rodas = rodas;
        this.Placa = placa;
    }

    public Veiculo(String marca, String tipo, double peso, int rodas) {
        this.Tipo = tipo;
    }
    /*
    -----------------------------------------------------------------------
    * * 3. Se deseja adicionar novas CATEGORIA de Veículos:
        ● Carros ● Motos.
       -> Os carros pesam 1.000 Kg e as motos 300 Kg, os carros têm 4 rodas e as motos têm 2.
    ------------------------------------------------------------------------
     */

   /*
    Uma corrida também tem um conjunto de veículos que participam da corrida.
    Portanto, agora a corrida terá a responsabilidade de poder adicionar um veículo à corrida, por isso devemos definir os seguintes métodos:
    -> public void adicionarCarro(velocidade, aceleracao, AnguloDeVirada, placa);
    -> public void adicionarMoto(velocidade, aceleracao, AngulaDeVirada, placa);
    Ambos os métodos acrescentam um veículo, desde que haja espaço.
    */

    @Override
    public String toString() {
        return "Veiculo{" +
                "Velocidade=" + Velocidade +
                ", Aceleracao=" + Aceleracao +
                ", AnguloDeVirada=" + AnguloDeVirada +
                ", Marca='" + Marca + '\'' +
                ", Peso=" + Peso +
                ", Rodas='" + Rodas + '\'' +
                '}';
    }


}
