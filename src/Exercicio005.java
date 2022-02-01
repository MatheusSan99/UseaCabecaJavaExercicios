public class Exercicio005 {
    public static void main(String[] args) {
       // a // noise // annoys // an // oyster

        int x = 0;


        while (x < 4) {


            if (x < 1) {
                System.out.print("A ");
            }
            if (x == 3) {
                System.out.print(" an ");
            }
            if (x == 1) {
                System.out.print(" noise ");
            }
            if (x == 2) {
                System.out.print(" annoys ");
            }
            ++x;


        }
        System.out.println(" oyster ");

    }
}