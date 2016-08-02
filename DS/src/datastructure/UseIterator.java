package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Zaqc on 8/2/2016.
 */
public class UseIterator {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("NY");
        list.add("FL");
        list.add("AZ");
        list.add("Nahreen got hedace");
        list.add("Abdul is taking class from home");
        list.add("Shohan is taking class from home");

        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}