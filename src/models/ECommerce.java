package models;

public class ECommerce implements CartSettings {
    private boolean domesticCashEnabled;
    private boolean internationalCashEnabled;

    public ECommerce(boolean domesticCashEnabled, boolean internationalCashEnabled) {
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

    public void buyProduct(String productName, double amount, boolean isInternational) {
        if (isInternational && internationalCashEnabled) {
            System.out.println("Purchased " + productName + " for " + amount + " internationally.");
        } else if (!isInternational && domesticCashEnabled) {
            System.out.println("Purchased " + productName + " for " + amount + " domestically.");
        } else {
            System.out.println("Purchase failed. Check your cart settings.");
        }
    }
}

