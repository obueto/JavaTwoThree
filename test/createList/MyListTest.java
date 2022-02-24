package createList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class MyListTest {
    MyList arrayList;
    @BeforeEach
    void setUp(){
        arrayList = new MyList();
    }
    @Test
    public void createList(){
        assertNotNull(arrayList);
       assertTrue (arrayList.isEmpty());
    }
    @Test
public void addItemToListTest(){
        arrayList.add("rice");
        arrayList.add("spaghetti");
        assertEquals(2,arrayList.size());
}

}
