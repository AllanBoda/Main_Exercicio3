package POO;

class PixPayment implements PaymentType {
    @Override
    public String getName() {
        return "Pix";
    }

    @Override
    public boolean isValid() {
        return true;
    }
}
