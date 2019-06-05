package compilator.przyklad;

import compilator.przyklad.zadanie_1a.Osoba;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Osoba> osoba = new ArrayList<Osoba>();

        osoba.add(new Osoba("imie", "nazwisko", 19));
        osoba.add(new Osoba("d", "nazwisko", 11));
        osoba.add(new Osoba("imie", "a", 25));
        osoba.add(new Osoba("x", "nazwisko", 34));
        osoba.add(new Osoba("v", "nazwisko", 50));
        osoba.add(new Osoba("imie", "7", 13));
        osoba.add(new Osoba("t", "nazwisko", 10));



                Collections.sort(osoba, (os1, os2) -> Integer.compare(os1.getWiek(), os2.getWiek()));

        System.out.println(osoba);

    }


}
