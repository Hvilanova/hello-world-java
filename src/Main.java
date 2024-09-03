public class Main {


    public static void main(String[] args) {

        Ninja naruto = new Ninja("Naruto", 16, "joonin");

        System.out.println(naruto);
        System.out.println(naruto.atirarKunai(naruto.nome));
        //System.out.println(naruto.sharinga);

        Uchiha sasuke = new Uchiha("Sasuke", 16, "joonin");
        System.out.println(sasuke);
        System.out.println(sasuke.atirarKunai(sasuke.nome));
        System.out.println(sasuke.sharinganAtivado(sasuke.nome));

    }
}
