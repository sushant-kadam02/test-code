import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<String> lst = new ArrayList<>();

        lst.add("Asdfg");
        lst.add("Sdfghjk");
        lst.add("Zdfg");
        lst.add("ctyuikjbv");
        lst.add("Tjuytres");

        System.out.println("Revers list : ");
        ListIterator<String> lt = lst.listIterator(lst.size());
        while (lt.hasPrevious()) {
            System.out.println(lt.previous());
        }

        System.out.println("Iterator loop : ");
        Iterator<String> itr = lst.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        Iterator<String> itr1 = lst.iterator();
        System.out.println("Iterator forEachRemaining loop : ");
        itr1.forEachRemaining(a -> System.out.println(a));

        System.out.println("New for loop : ");
        for (String name : lst ) {
            System.out.println(name);
        }

        System.out.println("forEach():");
        lst.forEach(a -> System.out.println(a));


    }
}
