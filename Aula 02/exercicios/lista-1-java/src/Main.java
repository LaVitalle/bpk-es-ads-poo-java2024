public class Main
{
    public static void main(String[] args)
    {
        byte check = 1;
        int opc;

        while(check==1)
        {
            opc = iof.inputInt("Digite o numero do exercicío desejado(0 p/ Sair): ");

            if (opc==1)
            {
                exercicios.exUm();
            }
            else if (opc==2)
            {
                exercicios.exDois();
            }
            else if (opc==3)
            {
                exercicios.exTres();
            }
            else if (opc==4)
            {
                exercicios.exQuatro();
            }
            else if (opc==5)
            {
                exercicios.exCinco();
            }
            else if (opc==6)
            {
                exercicios.exSeis();
            }
            else if (opc==7)
            {

                int soma = exercicios.exSete();

                System.out.println("Resultado = " + soma);

            }
            else if (opc==8)
            {
                exercicios.exOito();
            }
            else if (opc==9)
            {
                exercicios.exNove();
            }
            else if (opc==10)
            {

                int N1 = iof.inputInt("Digite um número para conferir se é primo: ");
                int N2 = N1-1;

                exercicios.exDez(N1, N2);

            }
            else if (opc==11)
            {
                exercicios.exOnze();
            }
            else if (opc==12)
            {
                exercicios.exDoze();
            }
            else if (opc==13)
            {
                exercicios.exTreze();
            }
            else if (opc==14)
            {
                exercicios.exQuatorze();
            }
            else if (opc==15)
            {
                exercicios.exQuinze();
            }
            else if (opc==16)
            {
                exercicios.exDezesseis();
            }
            else if (opc==0)
            {
                check=0;
                System.out.println("Saindo!!");
            }
            else
            {
                System.out.print("Exercicío inválido, tente novamente!!\nTente um número de 1 a 16\n");
            }
        }
    }
}