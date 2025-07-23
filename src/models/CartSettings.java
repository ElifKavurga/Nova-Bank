package models;

public interface CartSettings {
    boolean isDomesticCashEnabled();
    boolean isInternationalCashEnabled();
    void setDomesticCashEnabled(boolean enabled);
    void setInternationalCashEnabled(boolean enabled);
}