import java.util.* ;
public class Library{
 private HashMap<String , Book> books ;
 private HashMap<String , Member> members ;

 public Library(){
    this.books = new HashMap<>();
    this.members = new HashMap<>() ;
 }

  public void addBook(Book book){
   books.put(book.getIsbn(), book) ;
   System.out.println("The new book added is : " + book.getTitle());
  }
  public void borrowBook(String Isbn , Member member){
    if(!books.containsKey(Isbn)){
        System.out.println("Book not found");
        return ;
    }
    Book book = books.get(Isbn);
     if(!book.isAvailable()) {
        System.out.println("Book is already borrowed!");
        return;
    }
    
    book.setAvailable(false);
    member.borrowBook(book); // add to member's list
    System.out.println(member.getName() + " borrowed: " + book.getTitle());
    

    }
  
  public void returnBook(String Isbn , Member member){
    if(!books.containsKey(Isbn)){
        System.out.println("book not found");
        return ;
    }
    Book book = books.get(Isbn) ;
    if(book.isAvailable()){
        System.out.println("Book was not borrowd");
        return;
    }
    book.setAvailable(true);
    member.returnBook(book);
    System.out.println(member.getName() + " returned: " + book.getTitle());

    }

    
  }
   
  

  
