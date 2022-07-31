import java.util.*;

public class Customer {
    private String name;

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    private PaymentMode paymentMode;

    public void setPaymentMode(String paymentMode)
    {
        if (paymentMode.equalsIgnoreCase("cash"))
            this.paymentMode = PaymentMode.Cash;
        else
            this.paymentMode = PaymentMode.Card;
    }

    public PaymentMode getPaymentMode()
    {
        return paymentMode;
    }

    public List<Product> cartProducts = new ArrayList<Product>();

    public List<Product> getCartProduct()
    {
        return this.cartProducts;
    }

    public double getToTalPrice()
    {
        double sum = 0;
        for (Product product : cartProducts)
        {
            sum += product.getPrice();
        }

        return sum;
    }

    public void addProduct(VendingMachine machine)
    {
        System.out.println("Which Product do you want to add");
        System.out.println("Select ");
        int productsCount = machine.capacity;
        for (int i = 1; i <= productsCount; i++)
        {
            System.out.println(i + " for product name = " + 
                machine.products[i-1].getName() + "    price = " + 
                machine.products[i-1].getPrice());
        }

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        if (choice > 0 && choice <= productsCount)
        {
            this.cartProducts.add(machine.products[choice-1]);
        }
    }
}
