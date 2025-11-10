import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // create an ArrayList
        ArrayList<Integer> a  = new ArrayList<>();

        // adding Element in Arrayalist
        a.add(1);
        a.add(2);
        a.add(3);

        // Printing ArrayList
        System.out.println(a);

        LinkedList<String> l = new LinkedList<>();

        l.add("One");
        l.add("Two");
        l.add("Tree");
        l.add("Four");
        System.out.println(l);


        LinkedList<String> ll = new LinkedList<>();
        ll.add("Geeks");
        ll.add("Geeks");
        ll.add(1, "For");

        for (int i = 0; i < ll.size(); i++){
            System.out.println(ll.get(i) + "");
        }
        System.out.println("=====================================");
        // using a for each loop
        for (String str: ll){
            System.out.println(str+ "");
        }

        System.out.println("=====================================");
        // stack

        Stack<Integer> s = new Stack<>();

        // Push elements onyo the stack

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(!s.isEmpty()){
            System.out.println(s.pop());
        }


    }
}