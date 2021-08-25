package com.meli;

public class Veiculo {
    public String tipo;
    public String marca;
    public String placa;
    public double velocidade;
    public double aceleracao;
    public double anguloDeVirada;
    public int rodas;
    public int peso;

    public Veiculo(String marca, String placa, double velocidade, double aceleracao, double anguloDeVirada) {
        this.marca = marca;
        this.placa = placa;
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
        this.anguloDeVirada = anguloDeVirada;
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
        return "Veiculo{" +
                "tipo='" + tipo + '\'' +
                ", marca='" + marca + '\'' +
                ", placa='" + placa + '\'' +
                ", velocidade=" + velocidade +
                ", aceleracao=" + aceleracao +
                ", anguloDeVirada=" + anguloDeVirada +
                ", rodas=" + rodas +
                ", peso=" + peso +
                '}';
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public double getAceleracao() {
        return aceleracao;
    }

    public void setAceleracao(double aceleracao) {
        this.aceleracao = aceleracao;
    }

    public double getAnguloDeVirada() {
        return anguloDeVirada;
    }

    public void setAnguloDeVirada(double anguloDeVirada) {
        this.anguloDeVirada = anguloDeVirada;
    }

    public int getRodas() {
        return rodas;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}







