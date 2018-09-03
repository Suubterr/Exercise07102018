package training;

public class Tools {
    final int poleDanych;

    public Tools() {            //konstruktor publiczny w zależności od podanych parametrów
        this(0);     //używa konstruktorów prywantych z przeciążenia
    }

    private Tools(int poleDanych) {

        this.poleDanych = poleDanych;
    }

    private Tools(String wartosc) {

        this.poleDanych = Integer.parseInt(wartosc);
    }

    public Long horn(Integer... sound/*Integer[] sound*/) {  // var args - gdy nie ma okreslonej ilości podawanyc parametrów
        return 10L;                                          // raczej nie stosowane
    }
}