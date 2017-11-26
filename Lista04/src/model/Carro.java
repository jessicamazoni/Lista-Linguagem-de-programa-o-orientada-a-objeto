package model;

public class Carro extends Automovel{
    protected String modelo;
    
    public Carro(String modelo, String marca, String cor, String kmRodado, String chassi) {
        super(cor, marca , kmRodado, chassi);
        this.modelo = modelo;
    }
    
    public Carro() {
    }
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
}

