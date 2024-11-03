//CRISTIANO CORRÊA DA SILVA JÚNIOR, 231011
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite qual o tipo do competidor(1 --->  Individual // 2 --> Equipe): ");
        int tipoCompetidor = scan.nextInt();
        scan.nextLine();

        Competidor competidor = null;

        if(tipoCompetidor == 1){
            System.out.print("Digite sua modalidade: ");
            String modalidade = scan.nextLine();

            System.out.print("Digite o seu nome: ");
            String nome = scan.nextLine();

            competidor = new Individual(modalidade, nome); //cadastrando individualmente
        } else if(tipoCompetidor == 2){
            System.out.print("Digite sua modalidade: ");
            String modalidade = scan.nextLine();

            System.out.print("Digite o nome do técnico: ");
            String tecnico = scan.nextLine();

            System.out.print("Digite o número de competidores: ");
            int qtdCompetidores = scan.nextInt();
            scan.nextLine();
 
            competidor = new Equipe(modalidade, tecnico, qtdCompetidores); //cadastrando equipe
        }

        System.out.print("O seu competidor/equipe estará presente na data que voce determinar(Sim/Não) :");
        String resposta = scan.nextLine();
        if(resposta.equalsIgnoreCase("Sim")){
            System.out.print("Digite a data do agendamento (dd/mm/yyyy): ");
            String data = scan.nextLine();
            Agendamento agendamento = new Agendamento(competidor, data);
            agendamento.anuncia();
        }else{
            Agendamento agendamento = new Agendamento(null, null);
            agendamento.anuncia();
        }
    }
}
