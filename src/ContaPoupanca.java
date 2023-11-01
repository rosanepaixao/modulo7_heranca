
public class ContaPoupanca extends Conta{
    private int diaAniversario;
    private double jurosAniversario;
    private double taxaDeJuros;
    private double saldo;

    @Override
    public double getSaldo() {
        return this.saldo + this.taxaDeJuros * this.saldo;
    }

    @Override
    public double doubledepositar(double valor) {
        saldo += valor;
        System.out.println("R$" + valor + " depositados com sucesso!");

        return valor;
    }

    @Override
    public double sacar(double valor) {
        if (diaAniversario == 20) {

            setSaldo((getSaldo() - valor) * jurosAniversario);

            if (getSaldo() > 0)
                return getSaldo();
        }

        return 0;
    }

    public ContaPoupanca(int numero, int agencia, String banco, double saldo, int diaAniversario,
                         double jurosAniversario, double taxaDeJuros, double saldo2) {
        super(numero, agencia, banco, saldo);
        this.diaAniversario = diaAniversario;
        this.jurosAniversario = jurosAniversario;
        this.taxaDeJuros = taxaDeJuros;
        saldo = saldo2;
    }

    public int getDiaAniversario() {
        return diaAniversario;
    }

    public void setDiaAniversario(int diaAniversario) {
        this.diaAniversario = diaAniversario;
    }

    public double getJurosAniversario() {
        return jurosAniversario;
    }

    public void setJurosAniversario(double jurosAniversario) {
        this.jurosAniversario = jurosAniversario;
    }

    public double getTaxaDeJuros() {
        return taxaDeJuros;
    }

    public void setTaxaDeJuros(double taxaDeJuros) {
        this.taxaDeJuros = taxaDeJuros;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

