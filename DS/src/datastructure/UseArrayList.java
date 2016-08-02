package datastructure;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zaqc on 8/2/2016.
 */
public class UseArrayList {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<Object>();
        list.add("NY");
        list.add("FL");
        list.add("AZ");
        list.add("Nahreen got hedace");
        list.add("Abdul is taking class from home");
        list.add("Shohan is taking class from home");

        for (Object city : list) {
            System.out.println(city);
        }
        System.out.println(list.size());
        list.remove(3);
        System.out.println("After change");

        for (Object city : list) {
            System.out.println(city);

        }  System.out.println(list.size());
    }
}
