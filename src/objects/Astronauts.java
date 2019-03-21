package objects;

import java.util.Objects;

public class Astronauts {
    private String firstName;
    private String lastName;
    private int age;
    private boolean sex;
    private String speciality;

    public Astronauts() {
    }

    public Astronauts(String firstName, String lastName, int age, boolean sex, String speciality) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
        this.speciality = speciality;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Astronauts that = (Astronauts) o;
        return age == that.age &&
                sex == that.sex &&
                Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastName, that.lastName) &&
                Objects.equals(speciality, that.speciality);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, sex, speciality);
    }

    @Override
    public String toString() {
        return "Astronauts{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", speciality='" + speciality + '\'' +
                '}';
    }
}
