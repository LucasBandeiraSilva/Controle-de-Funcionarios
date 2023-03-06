public class App {
    public static void main(String[] args) throws Exception {
        
      engenheiro eng = new engenheiro("aaa", 1000, 1234, "RH");
      gerente gen = new gerente("Lucas", 20000, 5354, "TI", 0.2);
      presidente pre = new presidente("Jair", 1000, 6787, 1000);

      System.out.println();
      System.out.println(eng);
      System.out.println();
      System.out.println(gen);
      System.out.println();
      System.out.println(pre);
    }
}
