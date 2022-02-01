public class Exercicio002 {
    public static void main(String[] args) {


        String[] wordListOne = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

        String[] wordListTwo = {"Sabiá", "sagui", "salamandra", "salmão", "sapo", "saracura", "sarapó", "sardinha", "saripoca", "saruê", "saúva", "seriema", "serpente", "siri", "sisão", "sovi", "sucuri", "suricato", "surucucu"};

        String[] wordListThree = {"Abóbora", "Açafrão", "Amarelo", "Âmbar", "Ameixa", "Amêndoa", "Ametista", "Anil"};


        int oneLenght = wordListOne.length;
        int twoLenght = wordListTwo.length;
        int threeLenght = wordListThree.length;

        System.out.println(oneLenght);  //Quantas palavras têm em cada lista ?
        System.out.println(twoLenght);
        System.out.println(threeLenght);

        int rand1 = (int) (Math.random() * oneLenght);
        int rand2 = (int) (Math.random() * twoLenght);
        int rand3 = (int) (Math.random() * threeLenght); //Gerador de números aleatórios.

        System.out.println(rand1);
        System.out.println(rand2);
        System.out.println(rand3);

        System.out.println(wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3]);
    }
}