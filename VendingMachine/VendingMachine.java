import java.util.Scanner;

public class VendingMachine 
{
    Product[] products;
    int capacity;
    public VendingMachine(int _capacity)
    {
        this.capacity = 0;
        products = new Product[_capacity];
    }

    public void addProducts()
    {
        if (capacity >= products.length)
        {
            System.out.println("Maximum limit reached");
            return;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the product");
        String name = sc.nextLine();

        System.out.println("Enter the price of the product");
        double price = sc.nextDouble();

        Product product = new Product();
        product.setName(name);
        product.setPrice(price);

        products[capacity] = product;
        capacity++;
    }

    public void displayProducts()
    {
        System.out.println("Name            Price");
        for (int i = 0; i < capacity; i++)
        {
            System.out.println(products[i].getName() + " " + products[i].getPrice());
        }
    }

}
