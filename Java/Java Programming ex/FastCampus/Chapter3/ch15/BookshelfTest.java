package ch15;

public class BookshelfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue bq = new BookShelf();
		bq.enQueue("1");
		bq.enQueue("2");
		bq.enQueue("3");
		bq.enQueue("4");
		bq.enQueue("5");
		bq.enQueue("6");
		
		System.out.println(bq.getSize());
		System.out.println(bq.deQueue());
		System.out.println(bq.deQueue());
		System.out.println(bq.deQueue());
		System.out.println(bq.deQueue());
		System.out.println(bq.deQueue());

		

	}

}
