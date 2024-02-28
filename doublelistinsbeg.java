public class doublelistinsbeg {
    Node head,tail;

    doublelistinsbeg(){
        head = tail = null;
    }
    class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public void create(int value){
        Node newnode = new Node(value);
        if(head==null){
            head = tail = newnode;
        }
        else{
            newnode.prev = tail;
            tail.next = newnode;
            tail = newnode;
        }
    }
    public void display(Node head){
        if(head==null){
            System.out.println("list is empty");
        }
        else{
            while (head!=null) {
                System.out.println(head.data);
                head = head.next;
            }
        }
    }
    public void insebeg(int value){
        Node newnode = new Node(value);
        if(head == null){
            head = newnode;
        }
        else{
            head.prev = newnode;
            newnode.next = head;
            head = newnode;
        }
    }
    public static void main(String[] args){
        doublelistinsbeg list = new doublelistinsbeg();
        list.create(2);
        list.create(4);
        list.create(6);
        list.display(list.head);
        list.insebeg(1);
        System.out.println();
        list.display(list.head);
        
    }
}
