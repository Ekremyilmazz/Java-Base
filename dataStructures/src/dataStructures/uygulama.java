package dataStructures;

import java.util.Queue;

public class uygulama {

	public static void main(String[] args) {
		QueueYapısı kuyruk= new QueueYapısı(5);
		kuyruk.enQueue(10);
		kuyruk.enQueue(20);
		kuyruk.enQueue(30);
		kuyruk.enQueue(40);
		kuyruk.enQueue(50);
		
		
		kuyruk.elemanSayisi();
		
		kuyruk.yazdır();
		
		System.out.println("Kuyruğun başındaki eleman: "+ kuyruk.dizi[kuyruk.front]);
		System.out.println("Kuyruğun sonundaki eleman: "+ kuyruk.dizi[kuyruk.rear]);
	}

}
