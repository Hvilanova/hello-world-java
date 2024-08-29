public class Ninja {

     String nome;
     int idade;
     String classe;


     public Ninja(String nome, int idade, String classe) {
          this.nome = nome;
          this.idade = idade;
          this.classe = classe;
     }

     @Override
     public String toString() {
          return "Ninja{" +
                  "nome='" + nome + '\'' +
                  ", idade=" + idade +
                  ", classe='" + classe + '\'' +
                  '}';
     }
}


