package satya.prac.DSnCollections;

import java.util.*;
 
// Linked List Class
class lists {
 
    static Node head;  // head of list
 
    /* Node Class */
    static class Node {
 
        int data;
        Node next;
 
        // Constructor to create a new node
        Node(int d) {
            data = d;
            next = null;
        }
    }
 
    // A reservoir sampling based function to print a
    // random node from a linked list
    void printrandom(Node node) {
 
        // If list is empty
        if (node == null) {
            return;
        }
 
        // Use a different seed value so that we don't get
        // same result each time we run this program
        
        System.out.println();
        Math.abs(UUID.randomUUID().getMostSignificantBits());
 
        // Initialize result as first node
        int result = node.data;
 
        // Iterate from the (k+1)th element to nth element
        Node current = node;
        int n;
        for (n = 2; current != null; n++) {
 
            // change result with probability 1/n
        	double random=Math.random();
        	System.out.println("random"+random);
        	System.out.println("random%n"+random%n);
            if (random % n == 0) {
            	System.out.println(random % n);
                result = current.data;
            }
 
            // Move to next node
            current = current.next;
        }
 
        System.out.println("Randomly selected key is " + result);
    }
 
    // Driver program to test above functions
    public static void main(String[] args) {
 
        lists list = new lists();
        list.head = new Node(5);
        list.head.next = new Node(20);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(3);
        list.head.next.next.next.next = new Node(30);
 
        list.printrandom(head);
 
    }
}
 
// This code has been contributed by Mayank Jaiswal
