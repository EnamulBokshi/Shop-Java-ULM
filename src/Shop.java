public class Shop {
    String name;
    String location;
    Items item;
    Customer customer;

    Shop(String name,String location,Items item,Customer customer){
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

        item.display();
        System.out.println("Customer Details:");
        System.out.println("=======================");
        customer.display();


    }
}
