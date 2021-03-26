package Models;

public class Vendas {

private String valor;
private Integer estoque;
private String NumeroCompras;

public String getValor(){
    return valor;
}

public void setValor(String Valor){
    this.valor = Valor;
}

public Integer getEstoque(){
    return estoque;
}

public void setEstoque(Integer Estoque){
    this.estoque = Estoque;
}

public String getNumeroCompras(){
    return NumeroCompras;
}

public void setNumeroCompras(String numeroCompras){
    this.NumeroCompras = numeroCompras;
}
}
