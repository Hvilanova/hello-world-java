public class Ninja {

     String nome;
     int idade;
     String classe;


     public Ninja(String nome, int idade, String classe) {
          this.nome = nome;
          this.idade = idade;    //metodo construtor{}
          this.classe = classe;
     }

     public String atirarKunai(String nome) {
          return nome + " Aprendeu o jutsu clone";
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


