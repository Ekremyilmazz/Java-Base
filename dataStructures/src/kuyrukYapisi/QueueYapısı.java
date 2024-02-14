package kuyrukYapisi;

public class QueueYapısı {
    Node front;  //head
    Node rear;   //tail
    
    int cnt;    //counter(sayici)
    int size;
	public QueueYapısı(int size) {
		this.size = size;
		cnt=0;
		front=null;
		rear=null;
	}
	
	void enQueue(int data) {
		if(isFull()) {
			System.out.println("Kuyruk dolu, ekleme yapılamadı");
		}
		else {
			Node eleman =new Node(data);
			if(isEmpty()) {
				front =eleman;
				rear=eleman;
				System.out.println(data + "kuyruğa ilk eleman olarak eklendi");
			}
			else {
				rear.next=eleman;
				rear=rear.next;
				System.out.println(data +"kuyruğa eklendi");
			}
			cnt++;
		}
		
	}
	
	void deQueue() {
		if( isEmpty()) {
			System.out.println("Kuyruk boş, silinecek eleman yok");
		}
		else {
			System.out.println(front.data +"silindi");
			front=front.next;
			cnt--;
		}
	}

	private boolean isEmpty() {
		return cnt==0;
	}

	private boolean isFull() {
		return cnt==size;
	}
	
	void print() {
		if( isEmpty()) {
			System.out.println("Kuyruk boş, yazdırılacak eleman yok");
		}
		else {
			Node temp=front;
			System.out.print("baş <-");
			while(temp!=null) {
				
				System.out.print(temp.data +"<-");
				temp=temp.next;
			}
			System.out.println("son");
		}
	}
	
}
