package sideHustle;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class DemoLinkedList {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        addInOrder(placesToVisit,"LagosA//*369");
        placesToVisit.add("Abuja");
        placesToVisit.add("Lagos");
        placesToVisit.add("Port-Harcourt");
        placesToVisit.add("Ibadan");
        placesToVisit.add("Calabar");
        placesToVisit.add("Ghana");
        placesToVisit.add("France");
        printList(placesToVisit);

        placesToVisit.add(3, "A calm beachHouse");
        printList(placesToVisit);
        placesToVisit.remove(6);
        printList(placesToVisit);
    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while ((i.hasNext())) {
            System.out.println("Now visiting:  " + i.next());
        }
        System.out.println("============");

    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0) {
                System.out.println(newCity = "is already included as a destination");
                return false;
            } else if (comparison > 0) {
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if (comparison < 0) {
            }
        }
        stringListIterator.add(newCity);
        return true;

    }
}
