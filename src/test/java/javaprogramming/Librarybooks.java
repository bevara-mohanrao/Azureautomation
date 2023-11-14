package javaprogramming;

public class Librarybooks {


		private String Publisher;
		private String Title;
		private String Author;
		
	
		public String toString()
		{
			return String.format(this.Title, this.Author, this.Publisher);
		}
		
		Librarybooks(String Title,String  Author, String Publisher)
		{
			this.Title = Title;
			this.Author = Author;
			this.Publisher = Publisher;
		}
		
		public String getTitle()
		{
			return this.Title;
		}
		public String getAuthor()
		{
		return this.Author;
	
		}
		public String getPublisher()
		{
			return this.Publisher;
		}
	
}
