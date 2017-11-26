package exercicio2;
public class Building implements CarbonFootprint{
    int numeroPessoas;
    boolean usoEnergiaRenovavel;
    int numeroLampadas;
    boolean usoArCondicionado;

    public Building(int numeroPessoas, boolean usoEnergiaRenovavel, int numeroLampadas, boolean usoArCondicionado) {
        super();
        this.numeroPessoas = numeroPessoas;
        this.usoEnergiaRenovavel = usoEnergiaRenovavel;
        this.numeroLampadas = numeroLampadas;
        this.usoArCondicionado = usoArCondicionado;
    }

    public int getNumeroPessoas() {
        return numeroPessoas;
    }

    public void setNumeroPessoas(int numeroPessoas) {
        this.numeroPessoas = numeroPessoas;
    }

    public boolean isUsoEnergiaRenovavel() {
        return usoEnergiaRenovavel;
    }

    public void setUsoEnergiaRenovavel(boolean usoEnergiaRenovavel) {
        this.usoEnergiaRenovavel = usoEnergiaRenovavel;
    }

    public int getNumeroLampadas() {
        return numeroLampadas;
    }

    public void setNumeroLampadas(int numeroLampadas) {
        this.numeroLampadas = numeroLampadas;
    }

    public boolean isUsoArCondicionado() {
        return usoArCondicionado;
    }

    public void setUsoArCondicionado(boolean usoArCondicionado) {
        this.usoArCondicionado = usoArCondicionado;
    }

    @Override
    public float getCarbonFootprint() {
        return 0;
    }

}