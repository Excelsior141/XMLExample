package xmlexample;

import java.time.LocalDate;

public class Human
{
    public static enum Gender
    {
        Male,
        Female
    };

    private String firstName;
    private String lastName;
    private String birthDate;
    private double money;
    private Gender gender;
    
    public Human()
    {
        
    }
    
    public Human(String firstName, String lastName, String birthDate, double money, Gender gender)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.money = money;
        this.gender = gender;
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

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
