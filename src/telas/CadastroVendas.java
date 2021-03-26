package telas;

import Crud.CrudCompras;

public class CadastroVendas {
    public void cadastrarvendas(){
        CadastroVendas cadastroven = new CadastroVendas();
        cadastroven.SalvarVendas();
        cadastroven.EditarVendas();
        cadastroven.ExcluirVendas();
    }

    public void SalvarVendas(){
        CrudCompras crudcompras = new CrudCompras();
        crudcompras.salvar();
    }

    public void EditarVendas(){
        CrudCompras crudcompras = new CrudCompras();
        crudcompras.editar();
    }

    public void ExcluirVendas(){
        CrudCompras crudcompras = new CrudCompras();
        crudcompras.excluir();
    }
}
