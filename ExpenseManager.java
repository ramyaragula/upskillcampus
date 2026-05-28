import java.util.ArrayList;
   class ExpenseManager {
    ArrayList<Expense> list = new ArrayList<>();
    int id=1;
    void addExpense(String date, double amount, String category, String description) {
        Expense e = new Expense(id, date, amount, category, description); 
             list.add(e);
             id++;
             System.out.println("Expenses are added succesfully");
        }
         void showExpenses() {
            if(list.size()==0) {
                System.out.println("No Expenses found");
                return;
            } for(Expense e: list){
                System.out.println(e);
            }

        } void deleteExpense(int id){
            boolean found = false;
            for(int i = 0; i<list.size(); i++){
                if(list.get(i).id==id){
                    list.remove(i);
                    found=true;
                    System.out.println("expense deleted");
                    break;
                }
            }
            if(!found){
                System.out.println("Expense id not found");
            }   
        } void totalExpense(){
            double total=0;
            for(Expense e: list){
                total=total+ e.amount;
            }
                System.out.println("Total Expense =" + total);
        }
                void filterByCategory(String category){
                    boolean found = false;
                    for(Expense e: list){ 
                if(e.category.equalsIgnoreCase(category)){
                    System.out.println(e);
                    found =true;
                }
            } if(!found){
                System.out.println("No matching category found");
            }
        }
    }

    
 
