package exercicio2;
public class Car implements CarbonFootprint{

    String combustivel;
    String modelo;

    public Car(String combustivel, String modelo) {
        super();
        this.combustivel = combustivel;
        this.modelo = modelo;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public float getCarbonFootprint() {
        return 0;
    }
}
