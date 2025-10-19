import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //ArrayList is a resizable arry that can grow as needeed
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        cars.add(0, "glodi");
        cars.remove(0);

        Iterator<String> it = cars.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("===================NEXT LINE =====================");

        //System.out.println(cars);

        // A HashSet is a collection where every element is unique - no duplicates are allowed

        HashSet<String> cars1 = new HashSet<>();
        cars1.add("Volvo");
        cars1.add("BMW");
        cars1.add("Ford");
        cars1.add("Mazda");
        //System.out.println(cars1);
        Iterator<String> nor = cars1.iterator();
        while(nor.hasNext()){
            System.out.println(nor.next());
        }






        // A HashMap stores key-value pairs, which are great when you want to store values and find them by a key
        HashMap<String, String> capitalCities = new HashMap<>();

        //Add keys and values (country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        System.out.println(cars1);



    }
}