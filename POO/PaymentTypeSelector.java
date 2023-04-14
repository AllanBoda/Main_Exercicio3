package POO;

import java.util.Scanner;

class PaymentTypeSelector {
    private Scanner scanner;

    public PaymentTypeSelector() {
        scanner = new Scanner(System.in);
    }

    public PaymentType selectPaymentType() {
        System.out.println("Digite o tipo de pagamento:");
        System.out.println("1. Pix");
        System.out.println("2. Crédito");
        System.out.println("3. Boleto");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                return new PixPayment();
            case 2:
                return new CreditPayment();
            case 3:
                return new BoletoPayment();
            default:
                return new InvalidPayment();
        }
    }
}
