package javaprogramming;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class LibraryUser {

	private String personname;
	private LocalDate personbirth;
	//LocalDate date = LocalDate.now();
	private ArrayList<Librarybooks> Books = new ArrayList<Librarybooks>();
	
	
	LibraryUser(String personname,String personbirth)
	{
		this.personname = personname;
	    this.personbirth = LocalDate.parse(personbirth);
	}
	
	public String getpersonname()
	{
		return this.personname;
	}
	
	public String getpersonbirth()
	{
		return this.personbirth.toString();
	}
	
	
	public void borrow(Librarybooks book)
	{
		this.Books.add(book);
		
	}
	
	public String borrowedBooks()
	{
		return this.Books.toString();
	}
	
	/*public int Userage ()
	
	{
		int Userage = Period.between(this.personbirth,date.getYear());
				
				return Userage;
	}*/
	
}


