package animales;

public class Passaro extends  Animal{
    static Integer NumeroDePassaros;


    public Passaro(String nome, String cor, Double altura, Double peso) {
        super(nome, cor, altura, peso);
    }

    @Override
    public String toString() {
        return "Passaro{" +
                "Nome='" + Nome + '\'' +
                '}';
    }

    @Override
    public void Soar() {
        System.out.println("PIU PIU");
    }
}
