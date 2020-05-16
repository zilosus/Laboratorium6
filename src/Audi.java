import java.util.Collection;

interface Comparable<T>
{
    public int compareTo(T o);
}

public class Audi implements Comparable<Audi> {
    String model;
    String typ;
    String silnik;
    int liczbaDrzwi;
    public int liczbaKol = 4;
    String kolor;

    public Audi(String model, String typ, String silnik, int liczbaDrzwi, String kolor){
        this.model = model;
        this.typ = typ;
        this.silnik = silnik;
        this.liczbaDrzwi = liczbaDrzwi;
        this.kolor = kolor;

    }

    public Audi(String model, String silnik, String kolor) {
        this.model = model;
        this.silnik = silnik;
        this.kolor = kolor;
    }

    public Audi(String silnik, String kolor) {
        this.silnik = silnik;
        this.kolor = kolor;
    }

    public Audi() {
    }

    public Audi(int liczbaKol) {
        this.liczbaKol = liczbaKol;
    }

    public void setSilnik(String silnik){
        this.silnik = silnik;
    }
    public void setkolor(String kolor){
        this.kolor = kolor;
    }
    public String getSilnik(){
        return silnik;
    }
    public String getTyp(){
        return typ;
    }
    public String getModel(){
        return model;
    }
    public String getKolor(){
        return kolor;
    }
    public String toString(){
        return "\nKLASA Audi:\nInformacje o "+model+": typ: "+typ+", silnik: "+silnik+", kolor: "+kolor+", liczba drzwi: "+liczbaDrzwi+", liczba kół: "+liczbaKol;
    }

    @Override
    public int compareTo(Audi o) {
        return this.getModel().compareTo( o.getModel() );
    }


}


