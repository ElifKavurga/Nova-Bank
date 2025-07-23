package models;

public class RegularUser extends User {
    public RegularUser(String firstName, String lastName, char[] password,float tl,float dollar,float euro, float gold) {
        super(firstName, lastName, password,tl,dollar,euro,gold);
    }

    @Override
    public void displayInfo() {
        System.out.println("Regular User: " + getFirstName() + " " + getLastName());
    }
    
    public String getUserType(){
        return "Regular";
    }
}
