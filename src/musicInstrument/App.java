package musicInstrument;

public class App {
    public static void main (String[]args) {
        Stringed violin = new Stringed("kk");
        Percussion drums = new Percussion("тт");
        Wind flute = new Wind("wind");


        System.out.println(violin.play());


    }
}
