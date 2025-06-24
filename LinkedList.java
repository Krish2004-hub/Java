class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    Node head, tail;

    void insertion(int data) {
        Node n = new Node(data);
        if (head == null) {
            head = n;
            tail = n;
        } else {
            tail.next = n;
            tail = n;
        }
    }
    void insert_beg(int data){
        Node n=new Node(data);
        n.next=head;
        head=n;
        
    }
    void insert_mid(int data,int pos){
        Node temp=head;
        Node n=new Node(data);
        for(int i=0;i<pos-1;i++){
           temp=temp.next;
            n.next=temp.next;
            temp.next=n;
        }
    }
    void deletion_beg(){
        head=head.next;
    }
void deletion_mid(int pos){
    if(head==null ||pos<=0){
        return;
    }
    if(pos==1){
        head=head.next;
    }
    Node temp=head;
    for(int i=1;temp!=null&&i<pos-1;i++){
        temp=temp.next;}
        if(temp==null ||temp.next==null){
            return;}
        temp.next=temp.next.next;
    }
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.insertion(10);
        l.insertion(20);
        l.insertion(30);
        l.insert_beg(5);
        l.insert_mid(15,2);
       // l.deletion_beg();
       l.deletion_mid(4);
        l.display();
    
    }
}