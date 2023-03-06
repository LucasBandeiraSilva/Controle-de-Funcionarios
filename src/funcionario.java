import java.text.NumberFormat;

public abstract class funcionario {

    protected String nome;
    protected double salario;
    protected int codigo;
   
    public funcionario(String nome, double salario, int codigo) {
        this.nome = nome;
        this.salario = salario;
        this.codigo = codigo;
        calculaDesconto();
    }
    
    public abstract void calculaDesconto();

    //@Override
    public String toString() {
        return  "Nome: " + nome + ", salário: " + NumberFormat.getCurrencyInstance().format(salario) + ",";
    }

   
}
