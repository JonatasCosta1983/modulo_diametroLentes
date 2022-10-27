package entity;

public class Diametro {
    public double aro;
    public double ponte;
    public double menorDnp;
    public double maiorDiagonal;
    public double diametro;

    public double calcular() {
        return diametro = aro + ponte - menorDnp * 2 + maiorDiagonal + 2;
    }


    public String toString(){
        return   String.format("O diametro é de: %.2f", diametro);
    }
}