package chapterSix;

public class Human {
    private String name;
    private Gender gender;
    public Human(String name,Gender gender){
        this.name = name;
        this.gender= gender;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public  String toString (){
            String woman;
            woman = "Human Name: " + getName() + " Human Gender: " + getGender();
            return woman;
    }
}
