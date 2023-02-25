//package LinkedList;
//
//import java.util.LinkedList;
//
//public class LinkedListAll {
//    Node head;
//    Node tail;
//    Node size;
//
//    private class Node{
//        int val;
//        Node next;
//
//
//        Node(){
//        }
//
//        Node(int value){
//            this.val=value;
//            this.next=null;
//        }
//    }
//    //_________________________________________________________//
//    //get first
//    public int getFirst() throws Exception{
//        Node firstNode= this.head;
//        if(firstNode!=null){
//            return firstNode.val;
//        }else{
//            throw new Exception("size of LinkedList is 0 right now");
//        }
//    }
//    //__________________________________________________________________//
//    //get last
//    public int getLast() throws  Exception{
//        Node lastNode= this.tail;
//        if(lastNode!= null){
//            return  lastNode.val;
//        }else{
//            throw new Exception("size of LinkedList is 0 right now");
//        }
//    }
//    //________________________________________________________________//
//    //getAt
//    public int getAt() throws Exception{
//        if(this.size==0){
//            throw new Exception("size of LinkedList is 0");
//        }
//        if(index<=0 || index>=this.size){
//            throw new Exception("index is out of bound" +index: "+index + ",size:" +this.size);
//        }
//        Node temp= this.head;
//        while(index--!= 0){
//            temp = temp.next;
//        }
//        return  temp.val;
//    }
//    //_______________________________________________________________//
//    //addFirst
//    public void addFirst(int data){
//        //create the node and fill the data
//        Node newNode= new Node(data);
//        // attach to the chain
//        if(this.size==0){
//            this.head= newNode;
//            this.tail= newNode;
//            this.size=1;
//        }else{
//            newNode.next= this.head;
//            this.head= newNode;
//            this.size+= 1;
//        }
//    }
//    //_________________________________________________________________________//
//    //addLast
//    public void addLast(int data) {
//        //create the node and fill the data
//        Node newNode = new Node(data);
//        //attach to cahin
//        if (this.size == 0) {
//            this.head = newNode;
//            this.tail = newNode;
//            this.size = 1;
//        } else {
//            Node tailNode = this.tail;
//            tailNode.next = newNode;
//            //change tail pointer
//            this.tail = newNode;
//
//            //change the size
//            this.size += 1;
//        }
//    }
//
//    //___________________________________________________________________________//
//    //addAt
//    public void addAt(int index)throws  Exception{
//        if(index<0 ||(index>= this.size) {
//            throw new Exception("index out of bound "+"index : "+index+", size:"+ this.size);
//        }
//        if(this.size==0 && index==0) {
//            this.addFirst(data);
//            return;
//        }
//        if(index== this.size) {
//            this.addLast(data);
//            return;
//        }
//        //create new node
//        Node newNode  = new Node(data);
//
//        //find previous node of the index
//        Node previousNode = this.getNodeAt(index-1);
//
//        //new node next will be the *(next)* of teh previous node'
//        Node nextOfPreviousNode= previousNode.next;
//        newNode.next= nextOfPreviousNode;
//
//        //previous node should be newly created node
//        previousNode.next= newNode;
//
//        this.size+=1;
//        }
//
//    //_______________________________________________________________//
//    //removeFirst
//         public int removeFirst()throws  Exception{
//           if(this.size==0){
//               throw new Exception("List is Empty");
//           }
//           int removedValue= this.head.val;
//
//           if(this.size==0){
//               this.head= this.tail= null;
//           }else{
//               this.head= this.head.next;
//           }
//           this.size-=1;
//           return  removedValue;
//         }
//         //___________________________________________________________________//
//    //removeLast
//         public int removeLast() throws  Exception{
//        if(this.size==0){
//            throw new Exception("list is empty");
//        }
//        int removedValue= this.head.val;
//
//        if(this.size==0){
//            this.head= this.tail= null;
//        }else{
//            nodeBeforeTail= tail.getNodeAt(this.size-2);
//            nodeBeforeTail.next=null;
//            this.tail= nodeBeforeTail;
//        }
//        this.size-=1;
//        return  removedValue;
//         }
//         //_____________________________________________________________________//
//    //removeAt
//    public int removeAt(int index)throws Exception{
//        if(this.size==0){
//            throw  new Exception("list is empty");
//        }
//        if(index<0 || index>=this.size){
//            throw new Exception("index out of bound "+"index :"+index +" , size:" + this.size);
//        }
//        int removedValue= this.head.val;
//        if(index==0){
//            return this.removeFirst();
//        }else if(index == this.size-1){
//            return this.removeLast();
//        }else{
//            Node nodeBeforeIndexNode= this.getNodeAt(index-1);
//            Node afterIndexNode= this.getNodeAt(index+1);
//            nodeBeforeIndexNode.next= afterIndexNode;
//        }
//        this.size--;
//        return  removedValue;
//    }
//}
////________________________________________________________________________________//