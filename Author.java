public class Author
{
     
   public Author(final String first, final String last, final String publisher)
   {
      this.first = first;
      this.last = last;
      this.publisher = publisher;
   }
   
   @override
   public String toString()
   {
      return this.last + ", " + this.first + " - " + this.publisher;
   }
    private String first, last, publisher;

}