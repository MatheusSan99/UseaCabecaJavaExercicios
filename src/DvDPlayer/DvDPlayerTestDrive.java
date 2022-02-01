package DvDPlayer;

public class DvDPlayerTestDrive {
    public static void main(String[] args) {

        DvDPlayer d = new DvDPlayer();
        d.canRecord = true;
        d.playDVD();

        if(d.canRecord == true) {
            d.recordDVD();
        }




    }


}
