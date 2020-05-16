import java.util.*;

public class Main {

    public static void main(String[] args) {
        Audi Audi1 = new Audi("A2", "Combi", "Benzynka", 5, "Niebieski");
        Q5 Q5_1 = new Q5("Diesel", "CZerwony");
        A3 A3_1 = new A3("Cabrio", "LPG", "Żółty");
        System.out.println(Audi1.toString());
        System.out.println(Q5_1.toString());
        System.out.println(A3_1.toString());
        tworzymyAudi();
        polimorfizm();
    }

    public static void tworzymyAudi(){
        ArrayList<Audi> list = new ArrayList<>();
        list.add(new Audi("A5", "Sedan", "Diesel", 5, "Czarny"));
        list.add(new Audi("A4", "Cabrio", "Benzynka", 3, "Czerwony"));
        list.add(new Audi("A6", "SUV", "Podtlenek Gazotu", 5, "Zielony"));

        System.out.println("\nLista: ");
        System.out.println(list);
        list.sort(Audi::compareTo);
        System.out.println("\nPosrtowana lista względem modelu: ");
        System.out.println(list);

    }

    public static void polimorfizm(){
        Audi o1 = new Audi("A4", "Cabrio", "Benzynka", 3, "Czerwony");
        Audi o2 = new Q5("Benzynka", "Zielona");
        Audi o3 = new A3("Sedan", "LPG", "Rudy");
        System.out.println("\n\nPolimorfizm");
        System.out.println(o1.toString());
        System.out.println(o2.toString());
        System.out.println(o3.toString());
    }




}

