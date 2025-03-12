class Exp81{
  public static class Book{
    private String title;
    private String author;
    private String isbn;

    //constructor
    Book(String title, String author, String isbn){
      this.title = title;
      this.author = author;
      this.isbn = isbn;
    }

    // method to display the details
    public void displayDetails(){
      System.out.println(title);
      System.out.println(author);
      System.out.println(isbn);
    }
  }

  public static void main(String[] args){
    Book book = new Book("1984", "George Orwell something", "123456789");

    book.displayDetails();
  }
}
