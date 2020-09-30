/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/**
 *
 * @author Teginder
 */
public class Exercise1 {

    public static <E> void transfer(LinkedStack s, LinkedStack t) {
        while (s.top() != null) {
            t.push(s.pop());
        }
    }

    public static void main(String args[]) {

        // With String Values.
        LinkedStack s = new LinkedStack();
        LinkedStack t = new LinkedStack();
        s.push("Karan");
        s.push("Jashan");
        s.push("Smeet");
        s.push("Sarb");

        System.out.println(s.toString());
        transfer(s, t);
        System.out.println("After moving elements from one stack to other.");
        System.out.println(t.toString());

        //With Integer Values
        LinkedStack<Comparable> s1 = new LinkedStack<Comparable>();
        LinkedStack t1 = new LinkedStack();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        
        System.out.println(s1);
        System.out.println("After moving elements from one stack to other.");
        transfer(s1, t1);
        System.out.println(t1);
    }

}

