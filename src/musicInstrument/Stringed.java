package musicInstrument;

public class Stringed extends MusicInst {

    Stringed (String melody) {
        super (melody);
    }

    @Override
    protected String play() {
        return  "уииииииии" + getMelody();
    }

}

