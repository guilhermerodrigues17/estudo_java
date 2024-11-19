package polimorfism.exerciseFix2.entities;

public class CompanyPayer extends Payer{
    private Integer numberOfEmployees;

    public CompanyPayer(String name, Double annualIncome, Integer numberOfEmployees) {
        super(name, annualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double incomeTaxCalc() {
        if (numberOfEmployees > 10) {
            return annualIncome * 0.14;
        }

        return annualIncome * 0.16;
    }
}
