package compilator.przyklad;

import compilator.przyklad.zadanie_1a.Osoba;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Osoba> osoba = new ArrayList<Osoba>();

        Osoba o1 = new Osoba("imie", "nazwisko",  19);
        Osoba o2 = new Osoba("d", "nazwisko",  11);
        Osoba o3 = new Osoba("imie", "a",  25);
        Osoba o4 = new Osoba("x", "nazwisko",  34);
        Osoba o5 = new Osoba("v", "nazwisko",  50);
        Osoba o7 = new Osoba("imie", "7",  13);
        Osoba o8 = new Osoba("t", "nazwisko",  10);


        Collections.sort(osoba, (os1, os2) -> Integer.compare(os1.getWiek(), os2.getWiek()));

    }




}
