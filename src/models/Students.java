package models;

import static java.lang.Integer.parseInt;

public class Students {
    private String firstName;
    private String lastName;
    private int year;
    private char gender;
    public Students(String element){
        String[] split = element.split(",");
        this.firstName = split[0];
        this.lastName = split[1];
        this.year = Integer.parseInt(split[2]);
        this.gender = split[3].charAt(0);
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Students{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", year=" + year +
                ", gender=" + gender +
                '}';
    }
}
