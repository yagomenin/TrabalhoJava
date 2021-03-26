package Crud;

import Interface.Reposytory;

public class CrudCliente implements Reposytory {
    @Override
    public void salvar(){
        System.out.println("Salvar Cliente");
    }

    @Override
    public void editar(){
        System.out.println("Editar Cliente");
    }

    @Override
    public void excluir(){
        System.out.println("Excluir Cliente");
    }

}
