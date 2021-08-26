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
   // HashMap<Integer, List<Veiculo>> veiculos = new HashMap<>(); // ListaDeVeiculos
   List<Veiculo> veiculos = new ArrayList<>();



    public Corrida() {
    }


   /*--------------------------------------CCORRIDA----------------------------------------------
    Uma corrida também tem um conjunto de veículos que participam da corrida.
    Portanto, agora a corrida terá a responsabilidade de poder adicionar um veículo à corrida, por isso devemos definir os seguintes métodos:
    -> public void adicionarCarro(velocidade, aceleracao, AnguloDeVirada, placa);
    -> public void adicionarMoto(velocidade, aceleracao, AngulaDeVirada, placa);
    Ambos os métodos acrescentam um veículo, desde que haja espaço.
    --------------------------------------------------------------------------------------------*/
   public void adicionarCarro(Veiculo veiculo){
       for(int i=0;i< veiculos.size();i++) {
           if (veiculos.get(i).tipo == "Carro") {
               // adicionar carro na corrida
           }
       }
   }

    public void adicionarMoto(Veiculo veiculo){
        for(int i=0;i < veiculos.size();i++) {
            if (veiculos.get(i).tipo == "Moto") {
                // adicionar Moto na corrida

            }
        }

    }

    /* ----------- 4 ------------------
    Também teremos a possibilidade de remover um veículo por meio de dois métodos:
    -> public void removerVeiculo(vehículo);
    -> public void removeVeiculoComPlaca(String umaPlaca);
    --------------------------------------- */

    public void removerVeiculo (Veiculo veiculo){
        for (int i = 0; i < veiculos.size(); i++){
            if(veiculos.get(i).marca == veiculo.marca){
                veiculos.remove(veiculo);
            }
        }

    }
    public void removeVeiculoComPlaca(Veiculo umaPlaca){
        for (int i = 0; i < veiculos.size(); i++){
            if(veiculos.get(i).placa == umaPlaca.placa){
                veiculos.remove(umaPlaca);
            }
        }
    }


    /* ------------------- 6 ---------------------------------------
    Queremos ser capazes de definir o vencedor de uma corrida:
    O vencedor será aquele que tiver o valor máximo determinado pela seguinte fórmula:
    Velocidade * ½ Aceleração / (AnguloDeVirada*(Peso - NumeroDeRodas * 100).
    -----------------------------------------------------------------*/
    public void Vencedor( Veiculo tipo){
       // Velocidade * ½ Aceleração / (AnguloDeVirada*(Peso - NumeroDeRodas * 100).
        double vencedor = 0;
        for (int a = 0; a < veiculos.size(); a++) {
            double resultado = veiculos.get(a).velocidade * (veiculos.get(a).aceleracao) / (veiculos.get(a).anguloDeVirada) * (veiculos.get(a).anguloDeVirada * (veiculos.get(a).peso - veiculos.get(a).rodas * 100));
            if ((resultado > vencedor) && (veiculos.get(a).tipo == tipo.tipo)){
                // vencedor = resultadoConta;
                // vencedor = resultadoConta+"|| "+tipo.placa;
            }
        }

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
    public void socorrerCarro(String placa){

    }

    public void socorrerMoto(String placa){

    }






}
