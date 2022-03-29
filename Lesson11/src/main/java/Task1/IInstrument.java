package Task1;

public interface IInstrument {
    String KEY = "До мажор";

    enum Type {
        GUITAR, DRUM, PIPE
    }

    void play();
}
