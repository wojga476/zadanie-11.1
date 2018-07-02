import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

    public class Metody {
        public void tworzenieListy(ArrayList lista) {
            int a = 1;
            Scanner scan = new Scanner (System.in);
            while (a > 0) {
                System.out.println ("Podaj liczbę dodatnią:");
                a = scan.nextInt ( );
                if (a > 0) {
                    lista.add(a);
                } else {
                    System.out.println ("Podano liczbę ujemną.\nProgram się zakończył.");
                }
            }
        }
        public int obliczSuma (ArrayList<Integer> lista){
            int suma = 0;
            for (int i = 0; i < lista.size( ); i++) {
                System.out.print (lista.get(i) + "+");
                int a =  lista.get (i);
                suma =suma + a;
            }
            return  suma;
        }
        public void odwrotWysw(ArrayList lista){
            List<Integer> odwrotWysw = lista.subList(0, lista.size());
            Collections.reverse(odwrotWysw);
            System.out.println(odwrotWysw.toString());
            Collections.reverse(lista);
        }
        public int najwiekLiczba (ArrayList<Integer> lista){
            int najwiekszaLiczba = 0;
            for (int i = 0; i < lista.size ( ); i++) {
                int a = lista.get (i);
                if (a > najwiekszaLiczba) {
                    najwiekszaLiczba = a;
                }
            }
            return  najwiekszaLiczba;
        }
        public int najmnLiczba (ArrayList<Integer> lista){
            int najmniejszaLiczba = najwiekLiczba (lista);
            for (int i = 0; i < lista.size ( ); i++) {
                if (lista.get (i) < najmniejszaLiczba) {
                    najmniejszaLiczba = lista.get (i);
                }
            }
            return najmniejszaLiczba;
        }
    }

