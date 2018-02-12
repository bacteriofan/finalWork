package musicInstrument;

public class Percussion extends MusicInst {

    Percussion (String melody) {
        super (melody);
    }

    @Override
    protected String play() {
        return  "бам-бам-бам" + getMelody();
    }
}
