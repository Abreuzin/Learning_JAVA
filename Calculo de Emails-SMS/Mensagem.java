public abstract class Mensagem{
    protected int quantidade;
    protected double precoPorEnvio;
    protected String campanha;
    protected String tipoMensagem;

    public Mensagem(String tipoMensagem, String campanha, int quantidade, double precoPorEnvio){
        this.quantidade = quantidade;
        this.precoPorEnvio = precoPorEnvio;
        this.tipoMensagem = tipoMensagem;
        this.campanha = campanha;
    }

    public abstract double calculaCusto();

    public void imprimeMensagem(){
        System.out.printf("%10s | %-20s | %5d envios | R$ %6.2f%n", tipoMensagem, campanha, quantidade, calculaCusto());
    }
}

class Sms extends Mensagem{
    public Sms(String tipoMensagem, String campanha, int quantidade){
        super(tipoMensagem, campanha, quantidade,0.15);
    }

    @Override 

    public double calculaCusto(){
        return quantidade * precoPorEnvio;
    }
}

class Email extends Mensagem{
    public Email(String tipoMensagem, String campanha, int quantidade){
        super(tipoMensagem, campanha, quantidade,0.02);
    }

    @Override 

    public double calculaCusto(){
        double total = quantidade * precoPorEnvio;
        return (quantidade >= 1000 ? total * 0.9 : total);
    }
}
