import java.util.Arrays;
import java.util.Random;

public class exercicios
{
    public static void exUm()
    {

        System.out.println("Hello, world!!!");

    }

    public static void exDois()
    {

        String nome = "Vitor";
        byte idade = 18;
        short dias = 6570;
        float peso = 74.5f;
        boolean vivo = true;

        System.out.print(nome + "\n" + idade + "\n" + dias + "\n" + peso + "\n" + vivo + "\n");

    }

    public static void exTres()
    {

        int N1, N2;

        N1 = iof.inputInt("Digite um número: ");
        N2 = iof.inputInt("Digite mais um número: ");

        System.out.println(N1 + N2 + "\n" + N1 * N2 + "\n" + (N1 - N2) + "\n" + N1/N2 + "\n");

    }

    public static void exQuatro()
    {

        int N1;

        N1 = iof.inputInt("Digite um número: ");

        if (N1%2==0)
        {
            System.out.println("O número é par!!");
        }
        else
        {
            System.out.println("O número é impar!!");
        }

    }

    public static void exCinco()
    {

        for(int i = 1; i<=10; i++)
        {

            System.out.println(i);

        }

    }

    public static void exSeis()
    {

        int[] numbers = {2, 1, 3, 5, 4};

        for (int i = 0; i<5; i++)
        {

            System.out.println(numbers[i]);

        }

    }

    public static int exSete()
    {

     int N1, N2;

     N1 = iof.inputInt("Digite um número: ");
     N2 = iof.inputInt("Digite mais um número: ");

     return N1+N2;
    }

    public static void exOito()
    {

        String nome;
        int idade;

        nome = iof.inputString("Digite seu nome: ");
        idade = iof.inputInt("Digite sua idade: ");

        System.out.printf("Olá %s, vi que tem %d anos!!\n", nome, idade);

    }

    public static void exNove()
    {

        int N1, N2;
        char op;

        N1  = iof.inputInt("Digite um número: ");

        op = iof.inputChar("Selecione uma operação (| + | - | * | / |): ");

        N2 = iof.inputInt("Digite outro número: ");

        switch (op)
        {
            case '+':
                System.out.println(N1 + N2);
                break;
            case '-':
                System.out.println(N1 - N2);
                break;
            case '/':
                System.out.println(N1 / N2);
                break;
            case '*':
                System.out.println(N1 * N2);
                break;
            default:
                System.out.println("Operação não identificada!!");
                break;
        }

    }

    public static int exDez(int number, int numberCheck)
    {

        if(number!=1 && number%numberCheck!=0)
        {
            return(exDez(number, numberCheck-1));
        }
        if(numberCheck==1 && number%numberCheck==0)
        {
            System.out.println("O número é primo!!!");
            return 0;
        }
        else
        {
            System.out.println("O número não é primo!!!");
            return 0;
        }

    }

    public static void exOnze()
    {

        String palavra = iof.inputString("Digite um palíndromo(ou não): ");
        int tam = palavra.length();

        for(int i = 0; i<=tam; i++)
        {
            int j = (tam - (i + 1));

            if(i<tam)
            {
                if (palavra.charAt(i) == palavra.charAt(j)) {
                    continue;
                }
                else
                {
                    System.out.println("Não é um palíndromo!!");
                    break;
                }
            }
            else if(i==tam)
            {
                System.out.println("É um palíndromo!!");
            }
        }

    }

    public static void exDoze()
    {
        int[] num = new int[5];

        num[0] = iof.inputInt("Digite um número: ");
        num[1] = iof.inputInt("Digite um número: ");
        num[2] = iof.inputInt("Digite um número: ");
        num[3] = iof.inputInt("Digite um número: ");
        num[4] = iof.inputInt("Digite um número: ");

        Arrays.sort(num);

        for (int i = 0; i<5; i++)
        {
            System.out.print(num[i] + " ");
        }

        System.out.println();
    }

    public static void exTreze()
    {

        Random numberGen = new Random();

        int n = numberGen.nextInt(100), chute;

        chute = iof.inputInt("Chute um número de 1 a 100: ");

        if (n == chute)
        {
            System.out.println("Parabéns!!! Você acertou!!!");
        }
        else
        {
            System.out.println("Que pena, o número era : " + n);
        }

    }

    public static void exQuatorze()
    {

        String str = iof.inputString("Digite uma palavra ou uma frase: ");
        int tam = str.length();
        int count = 0;
        for (int i = 0; i<tam; i++)
        {

            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
            {
                count++;
            }
            else
            {
                continue;
            }

        }

        System.out.println("O número de vogais na frase/palavra é : " + count);

    }

    public static void exQuinze()
    {

        int n = iof.inputInt("Digite um número para ver seu fatorial: ");
        int produto = n;

        for(int i = n-1; i!=1; i--)
        {
            produto = produto * i;
        }

        System.out.println(produto);

    }

    public static void exDezesseis()
    {
        int opc = iof.inputInt("Cº --> Fº(Digite - 1)\nFº --> Cº(Digite - 2)\n(0 para Sair)\n");

        if(opc == 1)
        {
            double C = iof.inputDouble("Digite a temperatura em Cº: ");
            double F;

            F = C * 1.8 + 32;

            System.out.printf("A temperatura convertida é de %.1f °F\n", F);
        }
        else if(opc == 2)
        {
            double F = iof.inputDouble("Digite a temperatura em Fº: ");
            double C;

            C = (F - 32) / 1.8;

            System.out.printf("A temperatura convertida é de %.1f °C\n", C);
        }
    }
}