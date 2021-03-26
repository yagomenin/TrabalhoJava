package telas;

import java.util.Scanner;
public class Login {


    public static void Login() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe C para cliente, F para Funcionario, P para Produto ou V para Vendas");
        String decisao = scan.nextLine();
        if (decisao.equals("C")) {
            CadastroCliente cliente = new CadastroCliente();
            cliente.CadastrarCliente();
        } else if (decisao.equals("F")) {
            CadastroFuncionario funcionario = new CadastroFuncionario();
            funcionario.CadastarFuncionario();
        } else if (decisao.equals("P")) {
            CadastroRobo_limpa_casa robo = new CadastroRobo_limpa_casa();
            robo.CadastrarRobo();
        } else if (decisao.equals("V")) {
            CadastroVendas cadastrovendas = new CadastroVendas();
            cadastrovendas.cadastrarvendas();
        } else {
            System.out.println("Você errou na sua escolha seu apedeuta");
        }

    }

}













