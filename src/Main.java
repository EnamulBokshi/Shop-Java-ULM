import java.util.*;
public class Main {
    public static ArrayList<Items> item = new ArrayList<>();
    public static ArrayList<Customer> customer = new ArrayList<>();
    int customerCount = 0;
    int itemsCount = 0;
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Wanna buy an item (1/0)?");
        int isBuy = sc.nextInt();
        if(isBuy == 1) {
            System.out.println("Customer details: ");
            System.out.println("----------------------------------------");
            Main obj = new Main();
            obj.setCustomer();
            obj.setItems();
            obj.setCustomer();
            obj.setItems();
            Shop andromeda = new Shop("andromeda","Arshinagar",item,customer);
            andromeda.display();
        }
    }
    public void setItems(){
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
        item.add(new Items(name,id,quantity));
        itemsCount ++;
    }
    public void setCustomer(){
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
        customer.add(new Customer(name,phoneNum,gender,id));
        customerCount ++;
    }
}
