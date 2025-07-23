package models;

public abstract class User {
    String firstName;
    String lastName;
    private String username;
    char[] password;
    float tl;
    float dollar;
    float gold;
    float euro;
    

    public User(String firstName, String lastName,char[] password,float tl,float dollar,float euro, float gold) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.dollar=dollar;
        this.tl=tl;
        this.euro=euro;
        this.gold=gold;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public char[] getPassword() {
        return password;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }

    public float getTl() {
        return tl;
    }

    public void setTl(float tl) {
        this.tl = tl;
    }

    public float getDollar() {
        return dollar;
    }

    public void setDollar(float dollar) {
        this.dollar = dollar;
    }

    public float getGold() {
        return gold;
    }

    public void setGold(float gold) {
        this.gold = gold;
    }

    public float getEuro() {
        return euro;
    }

    public void setEuro(float euro) {
        this.euro = euro;
    }

    
    public abstract void displayInfo();
}
