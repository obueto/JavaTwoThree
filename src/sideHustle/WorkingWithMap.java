package sideHustle;

import java.util.HashMap;
import java.util.Map;

public class WorkingWithMap {
    public static void main(String[] args) {

    }

private  static  void maps() {
    Map<Integer, Person> map = new HashMap<>();
    map.put(12, new Person("Dobs"));
    map.put(1, new Person("Kate"));
    map.clear();
}
// no duplicate key and value is not allowed cause key here must be unique
    static class Person{
        String name;
        public  Person( String name){
            this.name = name;
        }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
}
