package Day1;

class Book{
	int BookId;
	String BookTitle;
	String Author;
	public Book(int BookId,String BookTitle,String Author) {
		this.BookId=BookId;
		this.BookTitle=BookTitle;
		this.Author=Author;
	}
	public void GetDetails() {
		System.out.println("BookId: "+BookId);
		System.out.println("BookTitle: "+BookTitle);
		System.out.println("Author of the Book: "+Author);
	}
}
public class BookDetails {
	public static void main(String[] args) {
		Book ob = new Book(105,"The Girl On The Train","Ruskin Bond");
		ob.GetDetails();
	}
}
