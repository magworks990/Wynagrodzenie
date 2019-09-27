package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Brutto {
    public static void main (String [] args)
    {
        Obliczenia oblicz = new Obliczenia();
        DecimalFormat format = new DecimalFormat();
        DecimalFormat format0 = new DecimalFormat();

        Scanner skaner = new Scanner(System.in);
        System.out.println("Podaj kwotę Brutto: ");
        oblicz.brutto=skaner.nextDouble();

        format.setMaximumFractionDigits(2);
        format0.setMaximumFractionDigits(0);


        oblicz.liczSkladkaEmerytalna();
        System.out.println("Wysokość składki emerytalnej: -> " +format.format(oblicz.semerytalne) +" zł");
        oblicz.liczSkladkaRentowna();
        System.out.println("Wysokość składki rentownej: -> " +format.format(oblicz.srentowna)+" zł");
        oblicz.liczSkladkaChorobowa();
        System.out.println("Wysokość składki chorobowej: -> " +format.format(oblicz.schorobowa)+" zł");
        oblicz.liczSumaSkladek();
        System.out.println("Wysokość składek SUMA: -> " +format.format(oblicz.ssuma)+" zł");
        oblicz.liczSkladkeZdrowotna();
        System.out.println("Podstawa wymiaru składki na ubezpieczenie zdrowotne wynosi: -> " +format.format(oblicz.szdrowotne)+" zł");
        oblicz.liczSkladkeZdrowotna2();
        System.out.println("Sama składka na ubezpieczenie zdrowotne: -> " +format.format(oblicz.szdrowotne2) +"zł");
        oblicz.liczPrzychod();
        System.out.println("Przychód pomniejszony o koszty uzyskania przychodu: -> " +format.format(oblicz.przychod)+"zł");
        oblicz.liczZaliczkaPodatekDochodowy();
        System.out.println("Zaliczkę na podatek dochodowy przed odliczeniem składki zdrowotnej: -> " +format.format(oblicz.zpdochodowy) +"zł");
        oblicz.liczSkladkeZdrowotna3();
        System.out.println("Składkę zdrowotną – tym razem według stawki 7,75%: -> " +format.format(oblicz.szdrowotne3) +"zł");
        oblicz.liczZaliczkaPodatekDochodowyDoPobrania();
        System.out.println("Zaliczka na podatek dochodowy do pobrania dla Pracownika wynosi: -> " +format0.format(oblicz.szaliczkaPdochodowy) +"zł");
        oblicz.liczWynagrodzenieNetto();
        System.out.println("Wynagrodzenie netto Pracownika wynosi: -> " +format.format(oblicz.wynagrodzenienetto) +"zł");


    }
}
