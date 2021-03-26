package Crud;

import Interface.Reposytory;

public class CrudCompras implements Reposytory {
    @Override
    public void salvar(){
        System.out.println(" Salvando Compras");
    }

    @Override
    public void editar(){
        System.out.println(" Editar compra");
    }

    @Override
    public void excluir(){
        System.out.println(" Excluir compras");
    }
}
