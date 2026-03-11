import java.util.* ;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

         Library library = new Library() ;

        Book b1 = new Book("Harry Potter" , "JK Rowlling" , "HP1001") ;
        b1.getDetails() ;
      System.out.println("------------------------------");
        Member m1 = new Member(1001, "Kartik", "9763000577");
        m1.getMemberDetails() ;

        m1.borrowBook(b1) ;
        m1.viewBorrowedBooks();
        
        System.out.println("Write your name: " );
        String name = sc.next() ;

        System.out.println("Write your mobile number: ");
        String phone = sc.next() ;

       
        library.addMember(name , phone) ;

      

    sc.close();
    }
}