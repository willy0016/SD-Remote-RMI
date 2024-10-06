import java.rmi.registry.*;
import java.util.Scanner;

public class HelloClient {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            // Procura o registro RMI no servidor (localhost)
            Registry registry = LocateRegistry.getRegistry("localhost");

            // Procura a stub do servidor registrada como "Servidor"
            Hello stub = (Hello) registry.lookup("Servidor");

            // Invoca o método remoto e imprime a mensagem
            System.out.println("Invocando metodo do servidor");
            System.out.println("Digite o numero de a:");
            int a = scanner.nextInt();
            System.out.println("Digite o numero de b:");
            int b = scanner.nextInt();
            System.out.println("Digite o numero de c:");
            int c = scanner.nextInt();
            String msg = stub.hello(a, b, c);
            System.out.println("Mensagem retornada pelo servidor: " + msg);
            scanner.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
