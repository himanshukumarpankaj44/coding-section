package linkedList;
import java.util.*;
public class LinkedList {
    public static class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
  }
public static void addFirst(int data){
    Node newnode=new Node(data);
    if(head==null){
        head=tail=newnode;
        return;
    }
    //create new node}
    
    // new next = head
    newnode.next=head;
    //assign head to new node
    head=newnode;

}
public static Node head;
public static Node tail;
public  void main(String args[]){
    Scanner sc= new Scanner(System.in);
    LinkedList  ll=new LinkedList();
    

    ll.addFirst(45);
    ll.addFirst(23);   
}
}