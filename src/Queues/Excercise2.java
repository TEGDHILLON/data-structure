/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queues;

/**
 *
 * @author Teginder
 */
public class Excercise2 {

    public static void main(String[] args) {
        LinkedQueue<String> Q1 = new LinkedQueue<String>();
        Q1.enqueue("1");
        Q1.enqueue("2");
        Q1.enqueue("3");
        Q1.enqueue("4");
        Q1.enqueue("5");
        System.out.println("Elements in Q1");
        System.out.println(Q1);

        LinkedQueue<String> Q2 = new LinkedQueue<String>();
        Q2.enqueue("6");
        Q2.enqueue("7");
        Q2.enqueue("8");
        System.out.println("Elements in Q2");
        System.out.println(Q2);

        Q1.Concat(Q2);
        System.out.println("After Merging Q1 and Q2");
        System.out.println(Q1);

        System.out.println("After Merging values in Q2");
        System.out.println(Q2);

    }
}
