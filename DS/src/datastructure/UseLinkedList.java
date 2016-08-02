package datastructure;

import java.util.LinkedList;
import java.util.List;

public class UseLinkedList {

        public static void main(String[] args) {
            List<String> list = new LinkedList<>();
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
