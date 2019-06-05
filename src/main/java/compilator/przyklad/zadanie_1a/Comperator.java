package compilator.przyklad.zadanie_1a;


import java.util.Comparator;

public class Comperator implements Comparator<Osoba>{

    public int compare (Osoba o1, Osoba o2) {


        return Integer.compare(o1.getWiek(), o2.getWiek());

    }



}
