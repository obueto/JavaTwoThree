package chapterThree;

public class HealthProfile {
   private String firstName;
   private String lastName;
   private String gender;
   private int dayOfBirth;
   private int monthOfBirth;
   private int yearOfBirth;
   private double weight;
   private double height;

//   public HealthProfile(String NameFirst,String lastName,String gender,int dayOfBirth,int monthOfBirth,int yearOfBirth,
//                        int weight, int height){
//       this.firstName = firstName;
//       this.lastName = lastName;
//       this.gender = gender;
//       this.dayOfBirth = dayOfBirth;
//       this.monthOfBirth = monthOfBirth;
//       this.yearOfBirth = yearOfBirth;
//       this.weight = weight;
//       this.height = height;
//   }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
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

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public int calculateAgeInYears(){
       int year = 2021 - yearOfBirth;
       return year;
    }
    public int maximumHeartRate (){
       int maxHeartRate = 220 - calculateAgeInYears();
       return  maxHeartRate;
    }
    public double calculateMaximumHeartRangeRateFor50(){
       double maxHeartRateRange = 0.5 * maximumHeartRate();
       return  maxHeartRateRange;
    }
public  double calculateMaximumHeartRangeRateFor85(){
       double maxHeartRateRange = 0.85 * maximumHeartRate();
       return  maxHeartRateRange;
}
public double calculateBmi (){

double bmi = getWeight()/ (getHeight() * getHeight());
       return bmi;
}
}
