package polimorfism.exerciseFix2.entities;

public abstract class Payer {
    private String name;
    protected Double annualIncome;

    public Payer() {
    }

    public Payer(String name, Double annualIncome) {
        this.name = name;
        this.annualIncome = annualIncome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(Double annualIncome) {
        this.annualIncome = annualIncome;
    }

    public abstract double incomeTaxCalc();
}
