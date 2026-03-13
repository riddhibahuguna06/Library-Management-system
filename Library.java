import java.util.* ;
public class Library{
 private HashMap<String , Book> books ;   //string =  isbn 
 private HashMap<String , Member> members ; // string = memberId

 public Library(){
    this.books = new HashMap<>();
    this.members = new HashMap<>() ;

    // pre-loaded books
    addBook(new Book("Harry Potter", "JK Rowling", "HP1001"));
    addBook(new Book("The Alchemist", "Paulo Coelho", "TA1002"));
    addBook(new Book("Rich Dad Poor Dad", "Robert Kiyosaki", "RD1003"));
    addBook(new Book("Atomic Habits", "James Clear", "AH1004"));
    addBook(new Book("Clean Code", "Robert Martin", "CC1005"));

    //pre-loaded members
    
    members.put("1", new Member(1, "Riddhi", "982366632"));
    members.put("2", new Member(2, "Kartik", "982974632"));
    members.put("3", new Member(3, "Kailash", "97396732"));
   members.put("4", new Member(4, "Shubhi", "904756632"));
    members.put("5", new Member(5, "Shaurya", "93567752"));
   
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
   
  

  
