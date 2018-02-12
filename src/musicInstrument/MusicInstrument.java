package musicInstrument;

public class MusicInstrument {

    String type;
    int size;
    String sound;

    public MusicInstrument(String type, int size, String sound) {
    this.type = type;
    this.size = size;
    this.sound = sound;

    }

    public void getType() {
        this.type = type;

    }

    public int getSize() {
        this.size = size;
        return size;
    }

    public void getSound(String sound) {
        this.sound = sound;
    }

    public void play(String type, int size, String sound) {
        if (type.equals("струнный") && size < 5) {
            System.out.println("Вероятно вы играете на скрипке" + " " + sound);
        }
        if (type.equals("струнный") && size > 5) {
            System.out.println("Вероятно вы играете на виолончели" + " " + sound);


            if (type.equals("ударный") && size < 5) {
                System.out.println("Вероятно вы играете на бонге" + " " + sound);
            }
            if (type.equals("ударный") && size > 5) {
                System.out.println("Вероятно вы играете на барабане" + " " + sound);
            }


            if (type.equals("духовой") && size < 5) {
                System.out.println("Вероятно вы играете на флейте" + " " + sound);
            }
            if (type.equals("духовой") && size > 5) {
                System.out.println("Вероятно вы играете на трубе" + " " + sound);
            }


        }
    }
}