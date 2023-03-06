

public class engenheiro extends funcionario {

    private String departamento;
    private int crea;

    public engenheiro(String nome, double salario, int codigo, String departamento) {
        super(nome, salario, codigo);
        crea = codigo;
        this.departamento = departamento;
        
    }

    
    public String getDepartamento() {
        return departamento;
    }

    @Override
    public void calculaDesconto() {
        this.salario = salario + (salario*0.5);
    }


    @Override
    public String toString() {
        return super.toString() + "CREA " + crea +
        ", departamento: " + departamento + ".";

    }


   
}
