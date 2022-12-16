public class Desenvolvedor {
  String nome;
  Double qtdHorasDisponiveis;
  Double salarioMensalDesejado;

  public Double calculaValorHora() {
    return salarioMensalDesejado / (20 * qtdHorasDisponiveis);
  }
}
