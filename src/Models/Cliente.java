package Models;

import Crud.CrudCliente;

public class Cliente extends Pessoa {
    CrudCliente crudcliente = new CrudCliente();
    private String cadastroDoCliente;
    private Double limiteDeCredito;

    public String getCadastroDoCliente() {
        return cadastroDoCliente;
    }

    public void setCadastroDoCliente(String CadastroDoCliente) {
        this.cadastroDoCliente = cadastroDoCliente;
    }

    public Double getLimiteDeCredito() {
        return limiteDeCredito;
    }

    public void setLimiteDeCredito(Double limiteDeCredito) {
        this.limiteDeCredito = limiteDeCredito;
    }

    @Override
    public String andar() {
        return "O cliente anda lentamente pois está comprando";
    }


}
