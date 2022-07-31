import java.util.Scanner;

public class Main {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the capacity of Vending Machine");
        int capacity = sc.nextInt();

        VendingMachine machine = new VendingMachine(capacity);

        int choice;
        do
        {
            System.out.println("1 : Add product");
            System.out.println("2 : Display product details");
            System.out.println("0 : Exit");

            choice = sc.nextInt();

            switch (choice)
            {
                case 1 : machine.addProducts();
                         break;
                case 2 : machine.displayProducts();
                         break;
                case 0 : break;
            }
        } while(choice != 0);

        System.out.println("Enter the Customer Name");
        String name = sc.nextLine();

        Customer customer = new Customer();
        customer.setName(name);
        
        System.out.println("Hi " + customer.getName());
        do
        {
            System.out.println("1 : Add Product");
            System.out.println("0 : Exit");

            choice = sc.nextInt();

            switch (choice)
            {
                case 1 : customer.addProduct(machine);
                         break;
                case 0 : break;
            }
        } while(choice != 0);

        if (customer.cartProducts.size() > 0)
        {
            System.out.println("Select Payment Mode ");
            System.out.println("1. Cash");
            System.out.println("2. Card");
            choice = sc.nextInt();
            if (choice == 1)
            {
                customer.setPaymentMode("Cash");
            }
            else
            {
                customer.setPaymentMode("card");
            }

            double totalAmount = customer.getToTalPrice() * (choice == 1 ? 1 : 2);
            System.out.println("ToTal Price = " + totalAmount);
        }

    }
}