package TapeDeck;

import TapeDeck.TapeDeck;

public class TapeDeckTestDrive {

    public static void main(String[] args) {

        TapeDeck t = new TapeDeck();
        t.canRecord = true;
            t.playtype();

            if (t.canRecord == true) {
                t.recordTape();
            }
    }
}
