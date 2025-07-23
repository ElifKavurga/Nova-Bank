package models;

public class StudentUser extends User {
    private String university;
    private String department;

    public StudentUser(String firstName, String lastName, char[] password, String university, String department,float tl,float dollar,float euro, float gold) {
        super(firstName, lastName, password,tl,dollar,euro,gold);
        this.university = university;
        this.department = department;
    }
    
    public StudentUser(String firstName, String lastName, char[] password,float tl,float dollar,float euro, float gold){
        super(firstName, lastName, password,tl,dollar,euro,gold);

    }

    public char[] getPassword(){
        return password;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public String getUserType(){
        return "Student";
    }
    
    
    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void displayInfo() {
        System.out.println("Student: " + getFirstName() + " " + getLastName() +
                ", University: " + university + ", Department: " + department);
    }

    
}
