public class linked_list {
    Node head;
    private int size;
    linked_list(){
     this.size=0;
    }
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }

    //add first
    public void addFirst(String data) {
        Node newNode=new Node(data);
        if(head==null)
        {
             head=newNode;
             return;
        }
        newNode.next=head;
        head=newNode;
    }

    //add last
    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null)
        {
             head=newNode;
             return;
        }
        Node currNode=head;//for traversing
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next= newNode;
    }

    //print
    public void printList(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node currNode=head;
        while(currNode!=null){//no .next warna last wala node print nhi ho rha hoga
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }

    //delete first
    public void deleteFirst() {
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        size--;
        head=head.next;
    }

    //delete last
    public void deleteLast(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast=head;
        Node lastNode=head.next;//head.next=null -> lastNode=null
        while(lastNode.next!=null){//null.next    to avoid this case we need to perform next if (line 69)
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }

    //returning size
    public int getSize() {
        return size;
    }
    public static void main(String[] args) {
        linked_list list=new linked_list();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();
        
        list.addLast("List");
        list.printList();
        
        list.addFirst("This");
        list.printList();
        
        list.deleteFirst();
        list.printList();
        
        list.deleteLast();
        list.printList();

        System.out.println(list.getSize());
        list.addFirst("This");
        System.out.println(list.getSize());
    }
}
