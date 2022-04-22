import LinkedIist.LL;


public class Main {
    public static void main(String[] args)  {

        LL<String> ll = new LL<String>();
        ll.insertFirst("midnode1");
        ll.insertFirst("midnode2");

        ll.insertFirst("midnode3");
        ll.insertFirst("headnode");

        ll.insertLast("tailnode");

        System.out.println(ll.insertNodeAtIndex("here", 2));
        ll.deleteNode("LAST");
        System.out.println(ll.getSize());
        System.out.println(ll.findNodeElement(2));;
        ll.displayLL();
    }
}