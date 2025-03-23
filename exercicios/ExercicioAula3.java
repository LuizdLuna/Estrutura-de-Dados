public class ExercicioAula3 {
    public class Main {
        public static void main(String[] args) {
            
            ContaBancaria conta = new ContaBancaria("João Silva", "12345-6");
    
            System.out.println(conta.exibirDadosConta());
    
            conta.depositar(1000.0);
            System.out.println("Saldo após depósito: " + conta.consultarSaldo());
    
            conta.sacar(500.0);
            System.out.println("Saldo após saque: " + conta.consultarSaldo());
    
            conta.sacar(600.0); 
    
            System.out.println(conta.exibirDadosConta());
        }
    }
}
