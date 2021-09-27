import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> name = new LinkedList<>();

        name.add("Elif");
        name.add("Rana");
        name.add("Taha");
        name.addFirst("Reyhan");
        name.add("Mustafa");

        System.out.println("LinkedList: " + name);

        String str1 = name.get(0);
        System.out.println("0. indeksteki deger: " + str1);

        String str = name.get(1);
        System.out.println("1. indeksteki deger: " + str);

        String str2 = name.remove(4);
        System.out.println("Silinen deger: " + str2);
        System.out.println("Güncellenen LinkedList: " + name);
    }
}
