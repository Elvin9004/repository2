package Book;

public class Main {
	public static void main(String[] args) {
		Book book1 = new Book("a", "Harry Potter", 1999);
		Book book2 = new Book("a", "Один дома", 1990);
		Book book3 = new Book("а", "Шторм", 2013);

		System.out.println(book1);
		System.out.println(book2);

		System.out.println(book1.equals(book2));
		System.out.println(book1.equals(book3));
	}
}
