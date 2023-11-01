
    public class ContaCorrente extends Conta {

        private double chequeEspecial;
        private double limite;

        public double getSaldo() {
            return this.chequeEspecial + this.saldo;
        }

        @Override
        public double doubledepositar(double valor) {
            setSaldo(saldo+valor);
            return valor;
        }

        @Override
        public double sacar(double valor) {
            setSaldo((getLimite()+getSaldo()) - valor);

            if (getSaldo() > 0)
                return getSaldo();
            else {
                System.out.println("Valor insuficiente para saque!");
                return 0;
            }
        }

        public ContaCorrente(int numero, int agencia, String banco, double saldo, double chequeEspecial, double limite) {
            super(numero, agencia, banco, saldo);
            this.chequeEspecial = chequeEspecial;
            this.limite = limite;
        }

        public double getChequeEspecial() {
            return chequeEspecial;
        }

        public void setChequeEspecial(double chequeEspecial) {
            this.chequeEspecial = chequeEspecial;
        }

        public double getLimite() {
            return limite;
        }

        public void setLimite(double limite) {
            this.limite = limite;
        }

        @Override
        public String toString() {
            return "ContaCorrente [chequeEspecial=" + chequeEspecial + ", limite=" + limite + "]";
        }
    }

