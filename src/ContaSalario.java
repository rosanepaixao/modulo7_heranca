public class ContaSalario  extends Conta{
    private int limetesaques;
    private static int qtdeSaques;

    @Override
    public double doubledepositar(double valor) {
        setSaldo(saldo + valor);
        return getSaldo();
    }

    @Override
    public double sacar(double valor) {

        setQtdeSaques(getQtdeSaques() + 1);

        if (qtdeSaques <= getLimetesaques()) {
            setSaldo(getSaldo() - valor);

            if (getSaldo() > 0)
                return getSaldo();
        } else {
            System.out.println("Só é permitida "+limetesaques+" por objeto, o saldo da conta salário é R$"+getSaldo());
        }

        return 0;
    }

    @Override
    public double getSaldo() {

        return this.saldo;
    }

    public int getLimetesaques() {
        return limetesaques;
    }

    public void setLimetesaques(int limetesaques) {
        this.limetesaques = limetesaques;
    }

    public static int getQtdeSaques() {
        return qtdeSaques;
    }

    public static void setQtdeSaques(int qtdeSaques) {
        ContaSalario.qtdeSaques = qtdeSaques;
    }

    public ContaSalario(int numero, int agencia, String banco, double saldo, int limetesaques) {
        super(numero, agencia, banco, saldo);
        this.limetesaques = limetesaques;
    }

    @Override
    public String toString() {
        return "ContaSalario [limetesaques=" + limetesaques + "]";
    }
}

