public class Main {
    static int num = 1;

    public static String condition(int num){
        return num > 2? "maior":"menor";
    }

    public static void main(String[]args){
        System.out.println(condition(num));

        Cachorro c1 = new Cachorro("vira-lata", "thor");
        System.out.printf("O cachorro é da raça %s e se chama %s", c1.raca, c1.nome);
    }
}