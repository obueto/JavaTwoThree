package sideHustle;

public class AboutConstructors {
    private String name;
    private  double creditLimit;
    private String email;

    public AboutConstructors() {
        this( null, 0.00);
    }

    public  AboutConstructors(String name, double creditLimit){
        this(name, creditLimit,null);


    }


    public AboutConstructors(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }



}
