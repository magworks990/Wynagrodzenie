package com.company;

public class Obliczenia {
    double brutto;

    double semerytalne;
    double srentowna;
    double schorobowa;
    double ssuma;
    double szdrowotne;
    double szdrowotne2;
    double przychod;
    double zpdochodowy;
    double szdrowotne3;
    double szaliczkaPdochodowy;
    double wynagrodzenienetto;


    //Download Data
    public double getBrutto() {
        return brutto;
    }

    //Calculate
    public double liczSkladkaEmerytalna() {
        semerytalne = brutto * 0.0976;
        return semerytalne;
    }

    double liczSkladkaRentowna() {
        srentowna = brutto * 0.015;
        return srentowna;
    }
    double liczSkladkaChorobowa(){
        schorobowa = brutto * 0.0245;
        return schorobowa;
    }
    double liczSumaSkladek() {
        ssuma = semerytalne + srentowna + schorobowa;
        return ssuma;
    }
    double liczSkladkeZdrowotna(){
        szdrowotne = brutto - ssuma;
        return  szdrowotne;
    }
    double liczSkladkeZdrowotna2(){
        szdrowotne2 = szdrowotne * 0.09;
        return szdrowotne2;
    }
    double liczPrzychod (){
        przychod = szdrowotne - 112.25;
        return przychod;
    }
    double liczZaliczkaPodatekDochodowy(){
        zpdochodowy = (przychod * 0.18) - 46.33;
        return  zpdochodowy;
    }
    double liczSkladkeZdrowotna3(){
        szdrowotne3 = szdrowotne * 0.0775;
        return szdrowotne3;
    }
    double liczZaliczkaPodatekDochodowyDoPobrania(){
        szaliczkaPdochodowy = zpdochodowy - szdrowotne3;
        return  szaliczkaPdochodowy;
    }
    double liczWynagrodzenieNetto(){
        wynagrodzenienetto = brutto - ssuma - szdrowotne2 - szaliczkaPdochodowy;
        return wynagrodzenienetto;
    }

}
