package musicInstrument;

public class Wind extends MusicInst {
    Wind (String melody) {
        super (melody);
    }

    @Override
    protected String play() {
        return  "фуфууууууу" + getMelody();
    }



}
