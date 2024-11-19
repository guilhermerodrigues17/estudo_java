package polimorfism.exerciseFix2.entities;

public class IndividualPayer extends Payer{
    private Double healthExpenditures;

    public IndividualPayer(String name, Double annualIncome, Double healthExpenditures) {
        super(name, annualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double incomeTaxCalc() {
        if (annualIncome < 20000.0) {
            if (healthExpenditures > 0.0) {
                return annualIncome * 0.15 - healthExpenditures * 0.50;
            }

            return annualIncome * 0.15;
        } else {
            if (healthExpenditures > 0.0) {
                return annualIncome * 0.25 - healthExpenditures * 0.50;
            }

            return annualIncome * 0.25;
        }
    }
}
