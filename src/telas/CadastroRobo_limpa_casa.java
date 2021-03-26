package telas;

import Crud.CrudRobo_limpa_casa;
import Models.Robo_limpa_casa;

public class CadastroRobo_limpa_casa{
    public void CadastrarRobo() {
        CadastroRobo_limpa_casa cadastrarrobo = new CadastroRobo_limpa_casa();
        cadastrarrobo.ComprarRoboLimpaCasa();
        cadastrarrobo.QualidadeRoboLimpaCasa();
        cadastrarrobo.CorRoboLimpaCasa();





    }
    public void ComprarRoboLimpaCasa(){
        CrudRobo_limpa_casa crudrobo_limpa_casa = new CrudRobo_limpa_casa();
        crudrobo_limpa_casa.comprar();
    }


    public void QualidadeRoboLimpaCasa(){
        CrudRobo_limpa_casa crudRobo_limpa_casa = new CrudRobo_limpa_casa();
        crudRobo_limpa_casa.qualidade();
    }

    public void CorRoboLimpaCasa(){
        CrudRobo_limpa_casa crudRobo_limpa_casa = new CrudRobo_limpa_casa();
        crudRobo_limpa_casa.cor();
    }
}





