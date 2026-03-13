import java.util.* ;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

         Library library = new Library() ;
       while(true){
         System.out.println("------------Menu-------------");
        System.out.println("Chosse frome the follwing :  1. Add Book\n" + //
                        "2. Borrow Book\n" + //
                        "3. Return Book\n" + //
                        "4. Search Book\n" + //
                        "5. View All Books\n" + //
                        "6. Add Member\n" + //
                        "7. Exit ");
        int choose = sc.nextInt() ;
        
        switch (choose) {
            case 1 :     
                System.out.println("Books Title");    
                String title = sc.nextLine(); 
                
                System.out.println("Author's Name");
                String author = sc.nextLine() ;

                System.out.println("ISBN number");
                String isbn = sc.next();

                Book b1 = new Book(title, author, isbn);
                library.addBook(b1);
                
                break;

             case 2 :     //borrow book
              System.out.println("Your Member Id");
              String memberId = sc.nextLine();

              System.out.println("Book ISBN number");
              String isbn = sc.nextLine() ;

              Member m = library.getMember(memberId);
            if(m==null)
                s
             
                               
                break;

            case 3 :     
                               //add book
                
                break;

            case 4:     
                               //add book
                
                break;

            case 5 :     
                               //add book
                
                break;

             case 6 :     
                               //add book
                
                break;

            case 7 :     
                System.out.println("Goodbye!");   //exit 
                sc.close();   
                    return;
                  break ;

                
        
            default:
                break;
        }
        


      

    
    }

}
}   