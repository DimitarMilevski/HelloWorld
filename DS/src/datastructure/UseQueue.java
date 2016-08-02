package datastructure;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Zaqc on 8/2/2016.
 */
public class UseQueue {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();

        queue.add("Kaya's plate");
        queue.add("Tanveer's plate");
        queue.add("Shakir's plate");

        System.out.println(queue.element());
        System.out.println(queue.contains());

    }
}
