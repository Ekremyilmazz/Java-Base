package LinkedList;

public class app {

	public static void main(String[] args) {
		OurLinkedList<String> linkedlist=new OurLinkedList<>();
		linkedlist.add("uğur");
		linkedlist.add("can");
		linkedlist.add("Cetin");
		
		linkedlist.display();
		linkedlist.delete();
		System.out.println("------");
		linkedlist.display();
		linkedlist.delete();
		System.out.println("------");
		linkedlist.display();
		linkedlist.delete();
	}

}
