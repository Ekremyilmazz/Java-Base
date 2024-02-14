package dataStructures;

public class QueueYapısı {
     
	int [] dizi;
	int size;
	int front;     //dizinin en baştaki elemenı
	int rear;      //dizinin en sondaki elemanı
	
	
	public QueueYapısı(int size) {
		this.size = size;
		dizi=new int[size];
		front =0;
		rear=-1;
	}
	
	void enQueue(int data) {
		 if( isFull()) {
			 System.out.println("Kuyruk dolu, ekleme yapamazsınız!");
		 }
		 else {
			 rear++;
			 dizi[rear]=data;
			 System.out.println(dizi[rear] +"kuyruğa eklendi");
		 }
		 
	}

	void deQueue() {
		if(isEmpty ()) {
			System.out.println("kuyruk boş, silinecek eleman yok");
		}
		else {
			int sayi=dizi[front];
			for(int i=1;i<=rear;i++) {
				dizi[i-1]=dizi[i];
				}
			rear--;
			System.out.println(sayi + "kuyruktan çıkarıldı");
		}
	}
	
    void elemanSayisi() {
    	System.out.println("Eleman sayısı =" +(rear+1));
    }
	
    void yazdır() {
    	int i=rear;
    	System.out.print("son -> ");
    	while(i >=0) {
    		System.out.print(dizi[i] +" ->");
    		i--;
    	}
    	System.out.println("baş");
    }
    
	private boolean isFull() {
		return rear ==size-1;
	}
	private boolean isEmpty() {
		return rear == -1;
	}
}
