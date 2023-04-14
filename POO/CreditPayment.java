package POO;

class CreditPayment implements PaymentType {
    @Override
    public String getName() {
        return "Crédito";
    }

    @Override
    public boolean isValid() {
        return true;
    }
}
