package models;

public class EmployerUser extends User {
    public EmployerUser(String firstName, String lastName, char[] password,float tl,float dollar,float euro, float gold) {
        super(firstName, lastName,password,tl,dollar,euro,gold);
    }

    public void sendSalary(IAccount account, double amount) {
        account.deposit(amount);
    }

    public String getUserType(){
        return "Employer";
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Employer: " + getFirstName() + " " + getLastName());
    }
}
