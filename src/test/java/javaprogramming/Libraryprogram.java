package javaprogramming;
import java.time.LocalDate;

public class Libraryprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LibraryUser younguser = new LibraryUser("Mohan Rao","1977-11-06");
		
		
		
//	younguser.personname = "Mohan Rao";
//	younguser.personbirth = LocalDate.parse("1977-11-06");
	
      Librarybooks book = new Librarybooks("Cindrella returns","Michael williams","Charles swab");	  
	//  book.Title = "Cindrella returns";
	//  book.Author = "Michael williams"; 
	//  book.Publisher = "Jimson publishers";
      
      AudioBook Favaudio = new AudioBook("Samurai King george","Michael williams","Charles swab",500);
      digitalBook digitalformat = new digitalBook("Harris potter","Michael williams","Charles swab","PDF");
      

	  younguser.borrow(book);
	  younguser.borrow(Favaudio);
	  younguser.borrow(digitalformat);

	
		
		System.out.printf("Younguser name is : %s and Younguser Birthday is %s \n",younguser.getpersonname(),younguser.getpersonbirth());
		
		System.out.printf("%s has borrowed books from Library for pickup book names %s \n",younguser.getpersonname(),younguser.borrowedBooks());
		
		
		
		
		
		
	}

}
