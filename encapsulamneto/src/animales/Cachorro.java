package animales;

public class Cachorro extends Animal{

        private int NumeroDeGatos;

        private Integer TamanhodoRabo;


        public Cachorro(String Nome, String Cor, Double Altura, Double Peso, Integer TamanhodoRabo){
            super(Nome,Cor,Altura,Peso);
            this.Nome = Nome;
            this.Cor = Cor;
            this.Altura = Altura;
            this.Peso = Peso;
            this.TamanhodoRabo = TamanhodoRabo;

            NumeroDeGatos ++;

        }



       public String getNome(){
           return Nome;
       }

       public void setNome(String nome){
           this.Nome = nome;
       }


       public String getCor(){
           return Cor;
       }

       public void setCor(String cor){
           this.Cor = Cor;
       }

       public Double getAltura(){
           return Altura;
       }

       public void setAltura(Double Altura){
           this.Altura = Altura;
       }

       public Double getPeso(){
           return Peso;
       }

       public void setPeso(Double peso){
           this.Peso = Peso;
       }

       public Integer getTamanhodoRabo(){
           return TamanhodoRabo;
       }

       public void setTamanhodoRabo(Integer TamanhodoRabo){
           this.TamanhodoRabo = TamanhodoRabo;
       }

       public String getEmocoes(){
           return EstadoDeEspirito;
       }

       public void setEmocoes(){
           this.EstadoDeEspirito = EstadoDeEspirito;
       }








        public String carinho(String acao) {

            switch (acao) {
                case "carinho":
                    this.EstadoDeEspirito = "Feliz";
                    break;
                case "Pisei na pata":
                    this.EstadoDeEspirito = "Triste";
                    break;
                case "pega graveto":
                    this.EstadoDeEspirito = "Pegou graveto";
                    break;
                default:
                    this.EstadoDeEspirito = "Neutro";
            }
            return this.EstadoDeEspirito;
        }

    @Override
    public String toString() {
        return "Cachorro{" +
                "Nome='" + Nome + '\'' +
                '}';
    }

    @Override
    public void Soar() {
        System.out.println("AU AU");
    }
}

