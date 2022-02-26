package linklist1;

import java.util.LinkedList;
public class linklist {


  public static void main(String[] args){

    // create a linked list using the LinkedList class
    LinkedList<String> fruit = new LinkedList<String>();

    // Add elements to LinkedList
    fruit.add("apple");

    // add element at the beginning of linked list
    fruit.addFirst("banana");
    // add element at the end of linked list
    fruit.addLast("grapes");
    System.out.println("LinkedList: " + fruit);

    // access first element
    System.out.println("First Element: " + fruit.getFirst());

    // access last element
    System.out.println("Last Element: " + fruit.getLast());
    }
}