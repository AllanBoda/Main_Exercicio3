package POO;

class BoletoPayment implements PaymentType {
    @Override
    public String getName() {
        return "Boleto";
    }

    @Override
    public boolean isValid() {
        return true;
    }
}
