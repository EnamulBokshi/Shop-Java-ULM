import java.util.ArrayList;
public class Shop {
    String name;
    String location;

   ArrayList<Items> item;
   ArrayList<Customer> customer;

    Shop(String name,String location,ArrayList <Items> item,ArrayList<Customer>customer){
        this.name = name;
        this.location = location;
        this.item = item;
        this.customer = customer;
    }
    public void display(){
        System.out.println("Shop name: "+ name);
        System.out.println("Shop location"+ location);
        System.out.println("Items Details: ");
        System.out.println("======================= ");
        for (Items item: item
        ) {
            item.display();
        }
        System.out.println("Customer Details:");
        System.out.println("=======================");
        for (Customer customer: customer
        ) {
            customer.display();
        }

    }
}
