package com.meli;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Corrida {
/*----------------------------FEITO--------------------------------------
     2. Modelar a classe Corrida que tem os seguintes ATRIBUTOS:
        ● Distancia ● PremioEmDolares ● Nome ● QuantidadeDeVeiculosPermitidos ● ListaDeVeiculos
---------------------------------------------------------------------------*/
    float Distancia;
    float PremioEmDolares;
    String Nome;
    int QuantidadeDeVeiculosPermitidos;
    private SocorristaCarro socorristaCarro = new SocorristaCarro(100,20,90,"2424");

    private SocorristaMoto socorristaMoto = new SocorristaMoto(100,20,90,"2424");
   List<Veiculo> corredores = new ArrayList<>();

    public Corrida(float distancia, float premioEmDolares, String nome, int quantidadeDeVeiculosPermitidos) {
        Distancia = distancia;
        PremioEmDolares = premioEmDolares;
        Nome = nome;
        QuantidadeDeVeiculosPermitidos = quantidadeDeVeiculosPermitidos;
    }

    /*--------------------------------------CCORRIDA----------------------------------------------
        Uma corrida também tem um conjunto de veículos que participam da corrida.
        Portanto, agora a corrida terá a responsabilidade de poder adicionar um veículo à corrida, por isso devemos definir os seguintes métodos:
        -> public void adicionarCarro(velocidade, aceleracao, AnguloDeVirada, placa);
        -> public void adicionarMoto(velocidade, aceleracao, AngulaDeVirada, placa);
        Ambos os métodos acrescentam um veículo, desde que haja espaço.
        --------------------------------------------------------------------------------------------*/

    public boolean isListaCheia() {
        if (corredores.size() == QuantidadeDeVeiculosPermitidos) {
            System.out.println("Limite maximo de inscritos!");
            return true;
        }
        return false;
    }



   public void adicionarCarro(Veiculo carro){
       // quantidade menor que o valor da corrida
       if (isListaCheia()) {
           return;
       }
          corredores.add(carro);
       System.out.println("Carro Adicionadas na corrida!");

   }

    public void adicionarMoto(Veiculo moto){
        // quantidade menor que o valor da corrida
        if (isListaCheia()) {
            return;
        }
        corredores.add(moto);
        System.out.println("Carro Adicionadas na corrida!");

    }

    /* ----------- 4 ------------------
    Também teremos a possibilidade de remover um veículo por meio de dois métodos:
    -> public void removerVeiculo(vehículo);
    -> public void removeVeiculoComPlaca(String umaPlaca);
    --------------------------------------- */

    public void removerVeiculo(String veiculo) {
        for (int i = 0; i < corredores.size(); i++){
            if(corredores.get(i).placa == veiculo){
                corredores.remove(veiculo);
            }
            System.out.println("Veiculo removido do Modelo " + veiculo);
        }
    }

    public void removeVeiculoComPlaca(String umaPlaca){
        for (int i = 0; i < corredores.size(); i++){
            if(corredores.get(i).placa == umaPlaca){
                corredores.remove(umaPlaca);
            }
            System.out.println("Veiculo removido, Placa " + umaPlaca);
        }
    }


    /* ------------------- 6 ---------------------------------------
    Queremos ser capazes de definir o vencedor de uma corrida:
    O vencedor será aquele que tiver o valor máximo determinado pela seguinte fórmula:
    Velocidade * ½ Aceleração / (AnguloDeVirada*(Peso - NumeroDeRodas * 100).
    -----------------------------------------------------------------*/

    public double calculaVencedor() {

        double valorMaximo = 0.0;
            for (int i = 0; i < corredores.size(); i++) {
            double resultado = corredores.get(i).velocidade * (corredores.get(i).aceleracao) + (corredores.get(i).anguloDeVirada) * (corredores.get(i).anguloDeVirada * (corredores.get(i).peso - corredores.get(i).rodas * 100));

            if (resultado > valorMaximo) {
                valorMaximo = resultado;
            }
        }
        return valorMaximo;

    }


    /*
    ----------------------- 7 ---------------------------------------------------
    As corridas também têm veículos de emergência que vão e consertam um veículo
    em caso de emergência. Como os carros são muito diferentes das motos, existem dois
    tipos diferentes de veículos de resgate. Um deles só sabe como resgatar carros e o
    outro só sabe como resgatar motos.
    ------------------------------------------------------------------------------*/


    /*
            a) Acrescente um socorrista de carro e um socorrista de moto à classe de corrida. (OK)
            b) Acrescente à corrida a responsabilidade de resgatar uma moto e um carro:
        public void socorrerCarro(String placa);
        public void socorrerMoto(String placa);
    */
    public void socorrerCarro(String placa) {
            socorristaCarro.socorrer(new Carro(placa));
            removeVeiculoComPlaca(placa);
            System.out.println(corredores.size());
        }

    public void socorrerMoto(String placa) {
        socorristaMoto.socorrer(new Moto(placa));
        removeVeiculoComPlaca(placa);
        System.out.println(corredores.size());
    }


}
