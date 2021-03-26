package Crud;

import Interface.Reposytory;

public class CrudFuncionario implements Reposytory {

    @Override

    public void salvar(){
        System.out.println("Salvar Funcionario");
    }

    @Override

    public void editar(){
        System.out.println("Editar Funcionario");
    }

    public void excluir(){
        System.out.println("Excluir funcionario");
    }
}
