package datastructure;
import java.util.Stack;
/**
 * Created by Zaqc on 8/2/2016.
 */
public class UseStack {

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push("Katya's plate");
        stack.push("Tanveer's plate");
        stack.push("Shakir's plate");


        System.out.println("Kaya is crying for the plate");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }

}
