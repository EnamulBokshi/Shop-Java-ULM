import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Wanna buy an item (1/0)?");
        int isBuy = sc.nextInt();
        if(isBuy == 1) {
            System.out.println("Customer details: ");
            System.out.println("----------------------------------------");
            Main obj = new Main();
            Customer customer =  obj.setCustomer();
            Items item = obj.setItems();
            Shop andromeda = new Shop("andromeda","Arshinagar",item,customer);
            andromeda.display();
        }
    }
    public Items setItems(){
        Scanner  sc = new Scanner(System.in);
        String name;
        String id;
        int quantity;
        System.out.println("Item name: ");
        name = sc.nextLine();
        System.out.println("Item ID: ");
        id = sc.nextLine();
        System.out.println("Quantity: ");
        quantity = sc.nextInt();
        Items item = new Items(name,id,quantity);
        return item;
    }
    public Customer setCustomer(){
        Scanner  sc = new Scanner(System.in);
        String name;
        String phoneNum;
        String gender;
        int id;
        System.out.println("Customer name: ");
        name = sc.nextLine();
        System.out.println("Phone number: ");
        phoneNum = sc.nextLine();
        System.out.println("Gender: ");
        gender = sc.nextLine();
        System.out.println("Customer Id: ");
        id = sc.nextInt();
        Customer customer = new Customer(name,phoneNum, gender,id);
        return customer;
    }
}
