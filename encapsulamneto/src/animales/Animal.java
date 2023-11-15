package animales;

public class Animal {
    protected String Nome;
    protected String Cor;
    protected Double Altura;
    protected   Double Peso;
    protected String EstadoDeEspirito;

    public Animal(String nome, String cor, Double altura, Double peso) {
        Nome = nome;
        Cor = cor;
        Altura = altura;
        Peso = peso;
    }

    protected void Comer(){

    }
    protected void Dormir(){

    }
    public void Soar(){
        System.out.println("CRI CRI CRI");
    }
}
