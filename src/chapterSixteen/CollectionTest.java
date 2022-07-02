package chapterSixteen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collection;

public class CollectionTest {
    public static void main(String[] args) {
        String[] colors = {"Magenta", "Red", "White", "Blue", "Chocolate","Pink"};
        List<String> list = new ArrayList<>();
        for (String color : colors) {
            list.add(color);
        }
        String[] removeColors = {"Magenta", "Chocolate", "Blue"};
        List<String> removeList = new ArrayList<>();

        for (String color : removeColors) {
            removeList.add(color);
        }
        System.out.println("ArrayList: ");
        for (int count = 0; count < list.size(); count++) {
            System.out.printf("%s ", list.get(count));
        }
        removeColors(list,removeList);
        System.out.printf("%n%nArrayList after calling removeColour: %n");
        for (String color:list)  {
            System.out.printf("%s ", color);
        }
    }
    private static void  removeColors(Collection <String> collection,Collection <String> collection1){
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()){
            if (collection1.contains(iterator.next())){
                iterator.remove();
            }
        }
    }
}