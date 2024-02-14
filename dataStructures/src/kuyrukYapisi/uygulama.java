package kuyrukYapisi;

public class uygulama {

	public static void main(String[] args) {
		QueueYapısı kuyruk=new QueueYapısı(5);
		
		kuyruk.enQueue(10);
		kuyruk.enQueue(20);
		kuyruk.enQueue(30);
		kuyruk.enQueue(40);
		kuyruk.enQueue(50);
		
		kuyruk.deQueue();
		kuyruk.deQueue();
		
		System.out.println("Kuyruktaki eleman sayisi: "+kuyruk.cnt);
		System.out.println("Kuyruğun başındaki eleman: "+kuyruk.front.data);
		System.out.println("Kuyruğun sonundaki eleman: "+kuyruk.rear.data);
		
		kuyruk.print();

	}

}
