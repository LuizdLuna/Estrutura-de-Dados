public class ContaBancaria {
    
    private String titular;
    private double saldo;
    private String numeroConta;

    public ContaBancaria(String titular, String numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0.0; 
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Erro: O valor do depósito deve ser positivo.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Erro: Saldo insuficiente ou valor inválido.");
        }
    }

    public double consultarSaldo() {
        return saldo;
    }

    public String exibirDadosConta() {
        return "Titular: " + titular + "\nNúmero da Conta: " + numeroConta + "\nSaldo: " + saldo;
    }
}
