package POO;

class InvalidPayment implements PaymentType {
    @Override
    public String getName() {
        return "";
    }

    @Override
    public boolean isValid() {
        return false;
    }
}
