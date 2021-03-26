package Crud;

import Interface.RepositoryProd;

public class CrudRobo_limpa_casa implements RepositoryProd {
    @Override
    public void comprar(){
        System.out.println("Comprar robo???? ");
    }

    @Override
    public void qualidade(){
        System.out.println("Qualidade boa!! ");
    }

    @Override
    public void cor(){
        System.out.println(" Preto é lindo!!!! ");
    }
}
