import java.util.* ;
public class Member{
     private int memberId;
     private String name ;
     private String phoneNumber;
     private ArrayList <Book> borrowedBooks ;

     public Member(int memberId , String name ,String phoneNumber){
        this.memberId = memberId ;
        this.name = name ;
        this.phoneNumber = phoneNumber ;
        this.borrowedBooks = new ArrayList<>() ;
     }

     public int getMemberId(){
        return memberId ;
     }
     public String getName(){
        return name ;
     }
     public String PhoneNumber(){
        return phoneNumber ;
     }

     public void borrowBook(Book book){
        borrowedBooks.add(book) ;
     }
     public void returnBook(Book book){
        borrowedBooks.remove(book) ;
     }
     public void viewBorrowedBooks(){
        if(borrowedBooks.isEmpty()){
            System.out.println("No borrowed books");
            return;
        }else{
        for(Book b : borrowedBooks){
         System.out.println(" " + b.getTitle());
        }
        }
        
     }


     public void getMemberDetails(){
        System.out.println("Member Id : " + memberId);
        System.out.println("Name : " + name);
        System.out.println("Phone Number : " + phoneNumber);
     }
}