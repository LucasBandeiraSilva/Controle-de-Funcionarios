public  final class presidente extends funcionario {
    private int cota;

    public presidente(String nome, double salario, int codigo, int cota) {
        super(nome, salario, codigo);
        this.cota = cota;
        calculaDesconto();
    }

    
    @Override
    public void calculaDesconto() {
        this.salario = salario+cota;
    }


    @Override
    public String toString() {
        return super.toString() + "codigo: "+ codigo + ", cota de ações: " + cota + ".";
    } 
}
