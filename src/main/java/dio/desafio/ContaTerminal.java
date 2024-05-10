package dio.desafio;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    private Integer numero;
    private String agencia;
    private String nomeCliente;
    private BigDecimal saldo;

    public ContaTerminal() {
    }

    public ContaTerminal(Integer numero, String agencia, String nomeCliente, BigDecimal saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public static void main(String[] args) {
        ContaTerminal contaTerminal = new ContaTerminal();

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, nome:");
        contaTerminal.nomeCliente = scanner.next();

        System.out.println("Por favor, digite o número da agência:");
        contaTerminal.agencia = scanner.next();

        System.out.println("Por favor, digite o número da conta:");
        contaTerminal.numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da saldo:");
        contaTerminal.saldo = scanner.nextBigDecimal();

       System.out.println("Olá ["+ contaTerminal.nomeCliente +"], obrigado por " +
                "criar uma conta em nosso banco, sua agência é ["+ contaTerminal.agencia +"], " +
                "conta [" + contaTerminal.numero + "] e seu saldo [" + contaTerminal.saldo + "] já está disponível para saque.");

    }


}
