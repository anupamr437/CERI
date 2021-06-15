package lab4exercise3;

public class Main {
	public static void main(String[] args) {
		Book b = new Book(1234, "Being Different", 126000, "Dr. Rajiv Malhotra");
		b.addItems();
		b.print();
		System.out.println("After checkout, number of copies left: ");
		b.checkOut();
		b.print();
		System.out.println("After adding one element, number of copies left: ");
		b.addItems();
		b.print();

		System.out.println();

		Video v = new Video(651, "Bahubali", 3000, 148, "S.S. Rajamouli", "Action/Drama", 2010);
		v.addItems();
		v.print();
		System.out.println("After checking in, number of copies left: ");
		v.checkIn();
		v.print();

		System.out.println();

		CD c = new CD(3261, "Tumbbad", 98600, 33, "Rahi Anil Garve", "Haunted/Drama");
		c.addItems();
		c.print();
		System.out.println("After checking out, number of copies left: ");
		c.checkOut();
		c.print();
	}
}