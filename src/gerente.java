public class gerente extends funcionario {
    private String area;
    private double bonifica;

    public gerente(String nome, double salario, int codigo, String area, double bonus) {
        super(nome, salario, codigo);
        this.area = area;
        bonifica = bonus;
        //calculaDesconto();
    }
    


   
     @Override
    public void calculaDesconto() {
        this.salario = salario + (salario * bonifica);
    }
    
   
    

    public double salarioBonificado(double salario){
    
        return this.salario + (salario*bonifica);
    }

    @Override
    public String toString() {
        return super.toString() +  "codigo: " + codigo  +", Area: " + area + ", " + "salario com bonus:" 
        +" R$ "+ salarioBonificado(salario); 
    }

    
    
}
