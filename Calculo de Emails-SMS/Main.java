public class Main {
    public static void main(String[] args) {
        Mensagem[] meioMensagem = {
            new Email("E-mail", "boas-vindas", 2500),
            new Email("E-mail", "promocao-agosto", 800),
            new Sms("SMS", "codigo-verificacao", 300)
        };

    double totalFatura = 0;

    for (Mensagem mensagem : meioMensagem){
        mensagem.imprimeMensagem();
        totalFatura += mensagem.calculaCusto();
    }

    System.out.println();
    System.out.printf("Total da fatura: R$ %.2f%n", totalFatura);
    
    }
}    