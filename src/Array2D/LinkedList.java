//package Array2D;
//import org.w3c.dom.Node;
//import java.util.*;
//public class LinkedList {
//    int size=0;
//    class Node {
//        int val;
//        Node next;
//
//        public Node(int value) {
//            this.val = value;
//            this.next = null;
//        }
//    }
//    public Node head = null;
//    public Node tail = null;
//
//    //add node
//    public void addNode(int val) {
//        //create new node
//        Node newNode = new Node(val);
//        //check
//           if(head == null) {
//           this.head = newNode;
//           this.tail = newNode;
//            this.size++;
//        } else {
//            tail.next = newNode;
//            tail= newNode;
//            this.size++;
//        }
//    }
//        public void display () {
//            Node current = head;
//
//            if (head == null) {
//                System.out.println("List is empty");
//                return;
//            }
//            System.out.println("Nodes of list :");
//            while (current != null) {
//                //print nodes
//                System.out.print(current.val + " ");
//                current = current.next;
//            }
//            System.out.println();
//        }
//        public void insertNodeAtFirst(int val) {
//            //create a new node
//            Node newNode = new Node(val);
//
//            //check if head tail both is empty
//            if (head == null) {
//                head = newNode;
//                tail = newNode;
//            } else {
//                //Node temp will point to head
//                Node temp = head;
//
//                // new node become new head to the list
//                head = newNode;
//
//                //previous head will be added after new head
//                head.next = temp;
//            }
//
//        }
//
//    public void insertNodeAtLast(int val) {
////        //create the node and fill the data
//        Node newNode = new Node(val);
////        //attach to chain
//        if (this.size==0) {
//           this. head = newNode;
//            this.tail = newNode;
//            this.size = 1;
//        } else {
//            Node tailNode = this.tail;
//            tailNode.next = newNode;
////            //change tail pointer
//            this.tail = newNode;
////            //change the size
//            this.size += 1;
//        }
//    }
//    //getFirstIndex
//       public int getFirst() throws Exception{
//        Node firstNode=this.head;
//        if(firstNode!=null){
//            return firstNode.val;
//        }else{
//            throw new Exception("Size of linkedList is 0 right now");
//        }
//       }
//       //get last index
//       public int getLast()throws Exception{
//        if(this.size==0){
//            throw new Exception("size is 0 right now");
//        }
//        return this.tail.val;
//       }
//       //get At
//    public int getAt(int index) throws Exception{
//        if(this.size==0){
//            throw new Exception("size of LinkedList is 0");
//        }
//        if(index<0 || index>=this.size){
//            throw new Exception("index out of bound");
//        }
//        Node temp= this.head;
//        while(index--!=0){
//            temp=temp.next;
//        }
//        return  temp.val;
//    }
//    //add Node At IndexNumber
//    public void addNodeAtIndexNumber(int index,int data)throws  Exception{
//        if(index<0 ||(index>= this.size)){
//            throw new Exception("index out of bound "+"index : "+index+", size:"+ this.size);
//        }
//        if(this.size==0 && index==0) {
//            this.insertNodeAtFirst(data);
//             return;
//        }
//        if(index== this.size) {
//            this.insertNodeAtLast(data);
//            return;
//        }
//        //create new node
//        Node newNode  = new Node(data);
//
//        //find previous node of the index
//        Node previousNode = this.getAt();
//
//        //new node next will be the *(next)* of teh previous node'
//        Node nextOfPreviousNode= previousNode.next;
//        newNode.next= nextOfPreviousNode;
//
//        //previous node should be newly created node
//        previousNode.next= newNode;
//
//        this.size++;
//     }
//
//
//        public static void main (String[]args){
//            LinkedList l1 = new LinkedList();
//            //add nodes----->
//
//            l1.insertNodeAtFirst(65);
//             l1.addNode(1);
//           l1.addNode(2);
//            l1.addNode(3);
//            l1.addNode(4);
//            l1.addNode(5);
//            //display list----->
//            l1.display();
//            l1.insertNodeAtLast(21);
//
//            //display list----->
//            l1.display();
//        }
//    }

