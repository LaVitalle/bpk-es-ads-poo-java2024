import java.util.Scanner;

public class IO {

    /**
     *
     * @param msgDialog
     * @return
     * Método extraído da refatoração para reaproveitamento no processamento de entrada de dados
     * informados pelo usuário no terminal.
     *
     *
     */
    public String input(String msgDialog){
        Scanner scanner = new Scanner(System.in);
        String strPrint = msgDialog.contains(":")? msgDialog: msgDialog + ":";
        System.out.print(strPrint);
        return scanner.nextLine();
    }

    /**
     * Método para invocar o método input e retornar a informação digitada pelo usuário já
     * convertida para String
     * @param msgDialog
     * @return
     */
    public  int inputInt(String msgDialog){
        String strInput = input(msgDialog);
        return Integer.parseInt(strInput);
    }
}
