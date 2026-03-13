import java.util.* ;
public class Library{
 private HashMap<String , Book> books ;   //string =  isbn 
 private HashMap<String , Member> members ; // string = memberId

 public Library(){
    this.books = new HashMap<>();
    this.members = new HashMap<>() ;
 }
public Member getMember(String memberId){
   return members.get(memberId) ;
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

    public void addMember(String name , String phone){
     int newId = members.size() + 1;
     Member member = new Member(  newId , name , phone);
     members.put(String.valueOf(newId), member);
     System.out.println("Member added successfully! Your ID is: " + newId);
    }

    public void viewBook(){
    for(Book b : books.values()){
        b.getDetails();
    }
    }

    public void searchBook(String isbn){
     if(!books.containsKey(isbn)){
        System.out.println("Book not found" ) ;
        return;
     }
     Book book = books.get(isbn) ;
     book.getDetails();
    
    
    }
    
  }
   
  

  
