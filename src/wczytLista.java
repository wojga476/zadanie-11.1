import java.util.ArrayList;
import java.util.Scanner;

public class wczytLista {

        public static void main(String[] args) {

            ArrayList<Integer> lista = new ArrayList<> ( );
            Metody metody = new Metody ( );
            metody.tworzenieListy (lista);
            metody.odwrotWysw (lista);
            int sumaLiczb = metody.obliczSuma (lista);
            System.out.println ("=" + sumaLiczb);
            System.out.println ("Suma wszystkich podanych liczb do listy: " + sumaLiczb);
            int najwieksza = metody.najwiekLiczba (lista);
            System.out.println ("Najwieksza liczba to: "+najwieksza );
            int najmniejsza = metody.najmnLiczba (lista);
            System.out.println ("Najmniejsza liczba to: "+najmniejsza );
        }
}
