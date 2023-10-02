public class Items {
    String name;
    String itemID;
    int quantity;
    Items(String name,String itemID,int quantity){
        this.itemID = itemID;
        this.name = name;
        this.quantity = quantity;
    }
    public void display(){
        System.out.println("Item Name: "+ name);
        System.out.println("Id: "+itemID);
        System.out.println("Quantity: "+quantity);
    }
}
