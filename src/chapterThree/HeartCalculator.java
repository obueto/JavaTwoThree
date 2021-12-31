package chapterThree;

public class HeartCalculator {
    private  String firstName;
    private  String lastName;
    private  int monthOfBirth;
    private  int dayOfBirth;
    private  int yearOfBirth;

//    public HeartCalculator(String firstName,String lastName,int dayOfBirth,int monthOfBirth,int yearOfBirth){
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.dayOfBirth = dayOfBirth;
//        this.monthOfBirth = monthOfBirth;
//        this.yearOfBirth = yearOfBirth;
//    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
public String getLastName(){
        return lastName;
}

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public int calculateAgeInYears(){
        int age = 2021 - yearOfBirth;

        return age;
}
public int calculateMaxHeartRate(){
        int maxHeartRate = 220 - calculateAgeInYears();
        return maxHeartRate;
}
public  double calculateTargetHeartRange85(){
        double targetHeartRange = (0.85 * calculateMaxHeartRate());
        return targetHeartRange;
}
public double calculateTargetHeartRange50(){
        double targetHeartRange = (0.5 * calculateMaxHeartRate());
        return targetHeartRange;
}
}
