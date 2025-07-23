package models;

public class CashWithdrawal implements CartSettings {
    private boolean domesticCashEnabled;
    private boolean internationalCashEnabled;

    public CashWithdrawal(boolean domesticCashEnabled, boolean internationalCashEnabled) {
        this.domesticCashEnabled = domesticCashEnabled;
        this.internationalCashEnabled = internationalCashEnabled;
    }

    public boolean isDomesticCashEnabled() {
        return domesticCashEnabled;
    }

    public boolean isInternationalCashEnabled() {
        return internationalCashEnabled;
    }

    public void setDomesticCashEnabled(boolean enabled) {
        this.domesticCashEnabled = enabled;
    }

    public void setInternationalCashEnabled(boolean enabled) {
        this.internationalCashEnabled = enabled;
    }

    public void withdrawDomestic(double amount) {
        if (domesticCashEnabled) {
            System.out.println("Withdrawn " + amount + " domestically.");
        } else {
            System.out.println("Domestic cash withdrawal is disabled.");
        }
    }

    public void withdrawInternational(double amount) {
        if (internationalCashEnabled) {
            System.out.println("Withdrawn " + amount + " internationally.");
        } else {
            System.out.println("International cash withdrawal is disabled.");
        }
    }
}

