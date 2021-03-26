package telas;

import Crud.CrudFuncionario;
import Models.Funcionário;

public class CadastroFuncionario {
    public void CadastarFuncionario(){
        CadastroFuncionario cadastrofun = new CadastroFuncionario();
        cadastrofun.SalvarFuncionario();
        cadastrofun.EditarFuncionario();
        cadastrofun.ExcluirFuncionario();
}
    public void SalvarFuncionario(){
        CrudFuncionario crudfuncionario = new CrudFuncionario();
        crudfuncionario.salvar();
    }

    public void EditarFuncionario(){
        CrudFuncionario crudfuncionario = new CrudFuncionario();
        crudfuncionario.editar();
    }

    public void ExcluirFuncionario(){
        CrudFuncionario crudfuncionario = new CrudFuncionario();
        crudfuncionario.excluir();
    }
}
