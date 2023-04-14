package POO;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InputReader inputReader = new InputReader();
        double valor = inputReader.readDouble("Qual o valor?");
        PaymentTypeSelector paymentTypeSelector = new PaymentTypeSelector();
        PaymentType paymentType = paymentTypeSelector.selectPaymentType();
        if (paymentType.isValid()) {
            System.out.println("Opção selecionada: " + paymentType.getName());
        } else {
            System.out.println("Opção inválida selecionada");
        }
    }
}

