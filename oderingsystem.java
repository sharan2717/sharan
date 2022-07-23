package orderingsystem;
import java.util.Scanner;
public  class oderingsystem {

    public static Scanner input = new Scanner(System.in);
    public static String again;
    public static int choose,quantity=1;
    public static double total=0,pay,change;
    public static void menu(){
        System.out.println("\t\t\t\t+===================================+");
        System.out.println("\t\t\t\t+          HOTEL SHARAN           ");
        System.out.println("\t\t\t\t               MENU          ");
        System.out.println("\t\t\t\t   1. Chapatti             RS. 15.00");
        System.out.println("\t\t\t\t   2. Dosa                 RS. 30.00");
        System.out.println("\t\t\t\t   3. Idly                 RS. 10.00");
        System.out.println("\t\t\t\t   4. CANCEL                         ");
        System.out.println("\t\t\t\t+====================================+");
    }

    public static void order(){
        System.out.println("Press 1 to Chapatti , Press 2 to Dosa , Press 3 to Idly and Press 4 to Cancel");
        System.out.print("Press you want to buy? :");
        choose = input.nextInt();
        //conditions
        if(choose==1){
            System.out.println("You choose Chapatti");
            System.out.print("How many Chapatti you want to Buy? :");
            quantity =input.nextInt();
            total = total +(quantity*15);

            System.out.println("You want to buy again? ");
            System.out.println("Press Y for Yes and N for N : ");
            again = input.next();
            if(again.equalsIgnoreCase("Y")){
                order();//call the method you to create
            }else{
                System.out.println("Enter a payment ");
                pay = input.nextDouble();
                if(pay <=total){
                    System.out.println("Not enough payment");
                }else{
                    System.out.println("Total price is " + total);
                    change = pay-total;
                    System.out.println("The change is " + change);
                }
            }
        }else if(choose==2){
            System.out.println("You choose Dosa");
            System.out.print("How many Dosa you want to Buy? :");
            quantity =input.nextInt();
            total = total +(quantity*30);

            System.out.println("You want to buy again? ");
            System.out.println("Press Y for Yes and N for N : ");
            again = input.next();
            if(again.equalsIgnoreCase("Y")){
                order();//call the method you to create
            }else{
                System.out.println("Enter a payment ");
                pay = input.nextDouble();
                if(pay <=total){
                    System.out.println("Not enough payment");
                }else{
                    System.out.println("Total price is " + total);
                    change = pay-total;
                    System.out.println("The change is " + change);
                }
            }
        }else if(choose==3){
            System.out.println("You choose Idly");
            System.out.print("How many Idly you want to Buy? :");
            quantity =input.nextInt();
            total = total +(quantity*10);

            System.out.println("You want to buy again? ");
            System.out.println("Press Y for Yes and N for N : ");
            again = input.next();
            if(again.equalsIgnoreCase("Y")){
                order();//call the method you to create
            }else{
                System.out.println("Enter a payment ");
                pay = input.nextDouble();
                if(pay <=total){
                    System.out.println("Not enough payment");
                }else{
                    System.out.println("Total price is " + total);
                    change = pay-total;
                    System.out.println("The change is " + change);
                }
            }
        }else if(choose==4){
            System.exit(0);//close program
        }else{
            System.out.println("Choose 1 to 4 only!");
            order();
        }
    }
    public static void driver(){
        double discount=0;
        discount = 0.05*total;
        System.out.println("Driver commision is "+ discount);
        System.out.println("Profit for Driver         :" + discount);


    }
    public static void prof(){
        System.out.println("Profit for Hotel          :" + total);
        System.out.println("Expenditure for customer  :" + total);


    }
    public static void main(String[] args) {
        menu();
        order();
        driver();
        prof();
    }
}

