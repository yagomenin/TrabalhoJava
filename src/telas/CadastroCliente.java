package telas;


import Crud.CrudCliente;
import Crud.CrudFuncionario;
import Models.Cliente;

public class CadastroCliente {
    public void CadastrarCliente() {
        CadastroCliente cadastrocliente = new CadastroCliente();
        cadastrocliente.SalvarCliente();
        cadastrocliente.EditarCliente();
        cadastrocliente.ExcluirCliente();



    }
    public void SalvarCliente(){
        CrudCliente crudcliente = new CrudCliente();
        crudcliente.salvar();
    }

    public void EditarCliente(){
        CrudCliente crudcliente = new CrudCliente();
        crudcliente.editar();
    }

    public void ExcluirCliente(){
        CrudCliente crudcliente = new CrudCliente();
        crudcliente.excluir();
    }

}
