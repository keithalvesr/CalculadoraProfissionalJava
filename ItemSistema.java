public class ItemSistema {
  int tipo;
  String nome;
  int complexidade;

  public String getTipo() {
    switch (tipo) {
      case 1: 
        return "Telas com entradas e saídas de dados";
      case 2: 
        return "Telas de consultas com informação de dados";
      case 3: 
        return "Gravação de dados";
    }

    return "Tipo indefinido";
  }

  public int calculaQtdHoras() {
    int qtdHoras = 0;

    if (tipo == 1) {
      switch (complexidade) {
        case 1:
          qtdHoras = 8;
          break;
        case 2:
          qtdHoras = 12;
          break;
        case 3:
          qtdHoras = 16;
          break;
      }
    } else if (tipo == 2) {
      switch (complexidade) {
        case 1:
          qtdHoras = 4;
          break;
        case 2:
          qtdHoras = 6;
          break;
        case 3:
          qtdHoras = 8;
          break;
      }
    } else if (tipo == 3) {
      switch (complexidade) {
        case 1:
          qtdHoras = 16;
          break;
        case 2:
          qtdHoras = 24;
          break;
        case 3:
          qtdHoras = 36;
          break;
      }
    }

    return qtdHoras;
  }
}
