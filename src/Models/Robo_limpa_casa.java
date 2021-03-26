package Models;

import Crud.CrudRobo_limpa_casa;

public class Robo_limpa_casa extends Produtos {
    CrudRobo_limpa_casa crudrobo_limpa_casa = new CrudRobo_limpa_casa();

    private String cor;
    private String codigoDeBarra;




    @Override
    public String ligar() {
        return "Ligando o robo";
    }

    @Override
    public String vender() {
        return null;
    }

    @Override
    public String comprar() {
        return null;
    }

    @Override
    public String trocar() {
        return "Trocando modo do robo";
    }
}
