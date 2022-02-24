package chapterNine.employee;

public class Employee {
    private String firstName;
    private String lastName;
    private  int securityNumber;
    public Employee(String firstName,String lastName,int securityNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.securityNumber = securityNumber;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSecurityNumber() {
        return securityNumber;
    }
 public double earnings() {
     return earnings();
 }
    @Override
    public String toString() {
        return String.format("%s,%s %d",getFirstName(),getLastName(),getSecurityNumber());
    }
}
