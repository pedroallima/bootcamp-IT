
public class Roupa {
    String marca,modelo;

    public Roupa() {

    }

    public Roupa(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }



    @Override
    public String toString() {
        return "Roupa{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}