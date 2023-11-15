package animales;

public class Gato extends  Animal {
    static int NumerodeGatos;

    public Gato(String nome, String cor, Double altura, Double peso) {
        super(nome, cor, altura, peso);
    }


    @Override
    public String toString() {
        return "Gato{" +
                "Nome='" + Nome + '\'' +
                '}';
    }

    @Override
    public void Soar() {
        System.out.println("MIAU MIAU");
    }
}
