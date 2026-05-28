import java.util.Scanner;
public class ExpenseTracker {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        ExpenseManager em= new ExpenseManager();
        while(true){
            System.out.println("\n----Expense Tracker----");
            System.out.println("1.Add Expense");
           System.out.println("2.Show Expense");
            System.out.println("3 Delete Expense");
             System.out.println("4.Total Expense");
              System.out.println("5. Filter Expense");
               System.out.println("6.Exit Expense");
               System.out.println("Enter your choice: ");
                int choice=sc.nextInt();
                sc.nextLine();
                 switch (choice) {
                    case 1 :
                         System.out.println("Enter the date : ");
                         String date= sc.nextLine();
                         System.out.println("Enter the amount: ");
                         double amount= sc.nextDouble();
                         sc.nextLine();
                         System.out.println("Enter the category: ");
                         String category= sc.nextLine();
                         System.out.println("Enter the description: ");
                        String description = sc.nextLine();
                           em.addExpense(date,amount,category,description);
                           break;
                    case 2 :  
                             em.showExpenses();
                             break;
                    case  3: System.out.println("enter expense id: ");
                             int id = sc.nextInt();
                             em.deleteExpense(id);
                             break;
                    case 4: em.totalExpense();
                            break;
                    case 5 : System.out.println("enter category : ");
                             String cat = sc.nextLine();
                              em.filterByCategory(cat);
                            break;
                    case 6: 
                             System.out.println("Exiting...");
                             sc.close();
                              System.exit(0);
                     default: 
                              System.out.println("Invalid choice");

                }
         }   
     }
 }
    

