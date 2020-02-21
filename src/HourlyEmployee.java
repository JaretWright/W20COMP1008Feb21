import java.time.LocalDate;

public class HourlyEmployee extends Employee {

    private double hoursWorked, hourlyRate;

    public HourlyEmployee(String firstName, String lastName, String socialInsuranceNumber, LocalDate birthday, double hourlyRate) {
        super(firstName, lastName, socialInsuranceNumber, birthday);
        this.hoursWorked = 0;
        this.hourlyRate = hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculatePay() {
        return hourlyRate*hoursWorked;
    }

    public String toString()
    {
        return String.format("%s with hourly rate $%.2f", super.toString(), hourlyRate);
    }
}
