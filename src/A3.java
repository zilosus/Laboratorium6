public class A3 extends Audi {
    public String model = "A3";
    String typ;
    String silnik;
    public int liczbaDrzwi = 3;
    String kolor;


    public A3(String typ, String silnik, String kolor) {
        this.typ = typ;
        this.silnik = silnik;
        this.kolor = kolor;
    }
    public void setTyp(String typ){
        this.typ = typ;
    }
    public void setSilnik(String silnik){
        this.silnik = silnik;
    }
    public void setkolor(String kolor){
        this.kolor = kolor;
    }
    public String getTyp(){
        return typ;
    }
    public String getSilnik(){
        return silnik;
    }
    public String getKolor(){
        return kolor;
    }

    public String toString(){
        return "\nKLASA A3:\nInformacje o "+model+": typ: "+typ+", silnik: "+silnik+", kolor: "+kolor+", liczba drzwi: "+liczbaDrzwi;
    }
}
