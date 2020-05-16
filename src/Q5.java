public class Q5 extends Audi {
    public String model = "Q5";
    String typ = "SUV";
    String silnik;
    public int liczbaDrzwi = 5;
    String kolor;




    public Q5(String silnik, String kolor) {
        this.silnik = silnik;
        this.kolor = kolor;
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
    public String getKolor(){
        return kolor;
    }

    public String toString(){
        return "\nKLASA Q5:\nInformacje o "+model+": typ: "+typ+", silnik: "+silnik+", kolor: "+kolor+", liczba drzwi: "+liczbaDrzwi;
    }

}
