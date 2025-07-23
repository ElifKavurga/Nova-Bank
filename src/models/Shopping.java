package models;

public class Shopping implements CartSettings {
    private boolean domesticCashEnabled;
    private boolean internationalCashEnabled;

    public Shopping(boolean domesticCashEnabled, boolean internationalCashEnabled) {
        this.domesticCashEnabled = domesticCashEnabled;
        this.internationalCashEnabled = internationalCashEnabled;
    }

    @Override
    public boolean isDomesticCashEnabled() {
        return domesticCashEnabled;
    }

    @Override
    public boolean isInternationalCashEnabled() {
        return internationalCashEnabled;
    }

    @Override
    public void setDomesticCashEnabled(boolean enabled) {
        this.domesticCashEnabled = enabled;
    }

    @Override
    public void setInternationalCashEnabled(boolean enabled) {
        this.internationalCashEnabled = enabled;
    }

    public void purchase(double amount, String location) {
        if (location.equalsIgnoreCase("domestic") && domesticCashEnabled) {
            System.out.println("Purchased items worth " + amount + " domestically.");
        } else if (location.equalsIgnoreCase("international") && internationalCashEnabled) {
            System.out.println("Purchased items worth " + amount + " internationally.");
        } else {
            System.out.println("Purchase not allowed at this location.");
        }
    }
}
