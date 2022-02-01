package Game;

public class GuessGame {
  Player p1;
  Player p2;
  Player p3;


    public void StartGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guessp1 = 0;    //Palpite dos jogadores
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("A IA está pensando em um número de 0 a 9...");

        while (true) {
            System.out.println("O número que a IA escolheu foi: " + targetNumber);

            p1.guess();
            p2.guess();
            p3.guess();

            guessp1 = p1.number;
            System.out.println("O jogador um chutou o número: " + guessp1);
            guessp2 = p2.number;
            System.out.println("O jogador dois chutou o número: " + guessp2);
            guessp3 = p3.number;
            System.out.println("O jogador três chutou o número: " + guessp3);

            if (guessp1 == targetNumber) {
                p1isRight = true;
            }
            if (guessp2 == targetNumber) {
                p2isRight = true;
            }
            if (guessp3 == targetNumber) {
                p3isRight = true;
            }

            if (p1isRight || p2isRight || p3isRight) {
                System.out.println("Temos um vencedor!!!");
                System.out.println("O jogador um acertou? " + p1isRight);
                System.out.println("O jogador dois acertou?" + p2isRight);
                System.out.println("O jogador três acertou?" + p3isRight);
                System.out.println("Fim de jogo!");
                break;
            } else {
                System.out.println("Poxa, ninguém acertou desta vez, vamos tentar novamente!!!");
            }
        }
    }
}
