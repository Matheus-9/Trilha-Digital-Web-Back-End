import animales.Cachorro;
import animales.Gato;
import animales.Passaro;

public class Main {
    public static void main(String[] args) {

        Cachorro cachorro2 = new Cachorro("Zug", "Rosa", 3.3, 4.5, 5);
        Gato gato = new Gato("Zizi","Verde",3.3,6.6);
        Passaro passaro = new Passaro("Blu","Azul",1.1,3.3);

        cachorro2.Soar();
        gato.Soar();
        passaro.Soar();

    }
}