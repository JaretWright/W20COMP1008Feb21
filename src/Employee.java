import java.time.LocalDate;

public abstract class Employee {
    private String firstName, lastName, socialInsuranceNumber;
    private LocalDate birthday;

    public Employee(String firstName, String lastName, String socialInsuranceNumber, LocalDate birthday) {
        setFirstName(firstName);
        setLastName(lastName);
        setSocialInsuranceNumber(socialInsuranceNumber);
        setBirthday(birthday);
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
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

    public String getSocialInsuranceNumber() {
        return socialInsuranceNumber;
    }

    public void setSocialInsuranceNumber(String socialInsuranceNumber) {
        this.socialInsuranceNumber = socialInsuranceNumber;
    }

    public abstract double calculatePay();

    public String toString()
    {
        return String.format("%s %s", firstName, lastName);
    }
}
