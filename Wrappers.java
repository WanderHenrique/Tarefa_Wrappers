public class LeituraNumero {

    private double numeroPrimitivo;
    private Double numeroWrapper;
  
    public LeituraNumero() {
      this.numeroPrimitivo = 0;
      this.numeroWrapper = null;
    }
  
    public void lerNumero() {
      // Leitura do valor numérico do console
      this.numeroPrimitivo = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor numérico: "));
    }
  
    public void converterParaWrapper() {
      // Conversão para o tipo Wrapper
      this.numeroWrapper = this.numeroPrimitivo;
    }
  
    public void imprimirNumero() {
      // Impressão do valor numérico
      System.out.println("O valor numérico é: " + this.numeroWrapper);
    }
  
    public static void main(String[] args) {
      LeituraNumero leituraNumero = new LeituraNumero();
  
      leituraNumero.lerNumero();
      leituraNumero.converterParaWrapper();
      leituraNumero.imprimirNumero();
    }
  }
  