package musicInstrument;

public class MusicInst {
    private String melody = "дрыыыынь";

    public MusicInst (String melody) {
        this.melody = melody;
    }

    public String getMelody() {
        return melody;
    }

    protected String play () {
        return "лалалала" + melody;
    }
}
