package com.meli;

public class Veiculo {
    protected String tipo;
    public String marca;
    public String placa;
    public double velocidade;
    public double aceleracao;
    public double anguloDeVirada;
    protected int rodas;
    protected int peso;

    public Veiculo(String marca, String placa, double velocidade, double aceleracao, double anguloDeVirada) {
        this.marca = marca;
        this.placa = placa;
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
        this.anguloDeVirada = anguloDeVirada;
    }

    public Veiculo(double velocidade, double aceleracao, double anguloDeVirada, String placa){
        this.placa = placa;
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
        this.anguloDeVirada = anguloDeVirada;
    }

    public Veiculo(String placa) {
        this.placa = placa;
    }
    /*
    Uma corrida também tem um conjunto de veículos que participam da corrida.
    Portanto, agora a corrida terá a responsabilidade de poder adicionar um veículo à corrida, por isso devemos definir os seguintes métodos:
    -> public void adicionarCarro(velocidade, aceleracao, AnguloDeVirada, placa);
    -> public void adicionarMoto(velocidade, aceleracao, AngulaDeVirada, placa);
    Ambos os métodos acrescentam um veículo, desde que haja espaço.
    */


    @Override
    public String toString() {
        return  "\n"+tipo+" + tipo  + "+  marca +" + marca  + "+ placa+ " + placa  "+ velocidade + " velocidade "+
                ", aceleracao=" + aceleracao + ", anguloDeVirada=" + anguloDeVirada + ", rodas=" + rodas + ", peso=" + peso;
    }

}







