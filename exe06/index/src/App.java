import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o horário desejado (HH:MM:SS): ");
        String horarioEntrada = teclado.nextLine();
        
        // Dividir a string com base nos ":" para obter horas, minutos e segundos
        String[] partes = horarioEntrada.split(":");
        int horas = Integer.parseInt(partes[0]);
        int minutos = Integer.parseInt(partes[1]);
        int segundos = Integer.parseInt(partes[2]);
        
        Horario horario = new Horario(horas, minutos, segundos);

        System.out.println("Horário no formato 24 horas: " + horario.Formato24Horas());
        System.out.println("Horário no formato 12 horas: " + horario.Formato12Horas());
        
        teclado.close();
    }
}
