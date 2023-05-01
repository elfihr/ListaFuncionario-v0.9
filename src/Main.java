import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o numero de funcionarios a registrar: ");
        int totFuncionario = leia.nextInt();

        //Criação Lista
        EmpresaFuncionario[] listaFuncionario = new EmpresaFuncionario[totFuncionario];

        for(int cont = 0; cont < totFuncionario ; cont++) {
            //Inicialiador lista
            EmpresaFuncionario listaTotal = new EmpresaFuncionario();

            System.out.print("Nome: ");
            listaTotal.setNome(leia.next());

            System.out.print("Idade: ");
            listaTotal.setIdade(leia.nextInt());

            //listaFuncionario recebe registroTotal
            listaFuncionario [cont] = listaTotal;
        }

        System.out.println("\n==========LISTA DE FUNCIONARIO==========\n");
        for (EmpresaFuncionario empresa : listaFuncionario) {
            //impressao da lista
            System.out.print("NOME: "+empresa.getNome()+" Idade: "+empresa.getIdade()+"\n");
        }
    }
}