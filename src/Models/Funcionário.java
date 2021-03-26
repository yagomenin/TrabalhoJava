package Models;

import Crud.CrudFuncionario;

public class Funcionário extends Pessoa {
    CrudFuncionario crudfuncionario = new CrudFuncionario();
    private double salario;
    private String pis;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getPis() {
        return pis;
    }

    public void setPis(String pis) {
        this.pis = pis;
    }

    @Override
    public String andar() {
        return "O funcionário anda rapidamente pois está trabalhando";
    }


}

