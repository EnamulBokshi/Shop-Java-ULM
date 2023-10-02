public class Customer {
    String name;
    String phoneNum;
    String gender;
    int customerId;
    Customer(String name,String phoneNo,String gender,int customerId){
        this.name = name;
        this.phoneNum = phoneNo;
        this.gender = gender;
        this.customerId = customerId;
    }
    public void display(){
        System.out.println("Customer name: "+name);
        System.out.println("Phone Number: "+phoneNum);
        System.out.println("Gender : "+gender);
        System.out.println("Customer Id: "+customerId);
    }

}
