public class Uchiha extends Ninja {
    public Uchiha(String nome, int idade, String classe) {
        super(nome, idade, classe);
    } //extends = herança

    public String sharinganAtivado(String nome) {
        return nome + "\nUsou o sharingan";
    }

    public String mangekyouSharingan(String nome) {
        return nome + "\nUsou o mangekyou";
    }
}
