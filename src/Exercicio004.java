public class Exercicio004 {

    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        while (a < 5) {
            a = a + 1;
            b = a + b;

            System.out.println(a + " " + b);
        }
    }
}