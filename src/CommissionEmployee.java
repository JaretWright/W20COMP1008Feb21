import java.time.LocalDate;

public class CommissionEmployee extends Employee{
    private double salesTotal, commissionRate;

    public CommissionEmployee(String firstName, String lastName, String socialInsuranceNumber, LocalDate birthday, double commissionRate) {
        super(firstName, lastName, socialInsuranceNumber, birthday);
        this.commissionRate = commissionRate;
        salesTotal=0;
    }

    public double getSalesTotal() {
        return salesTotal;
    }

    public void setSalesTotal(double salesTotal) {
        this.salesTotal = salesTotal;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }


    @Override
    public double calculatePay() {
        return commissionRate*salesTotal;
    }
}
