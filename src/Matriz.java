import java.util.Scanner;
import java.util.jar.JarEntry;

public class Matriz {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int escolha;
        System.out.println("Escolha uma matriz");
        do {
            System.out.println("Escolha 1 para a matriz 2x2");
            System.out.println("Escolha 2 para a matriz 3x3");
            System.out.println("Escolher quantas linhas a Matriz terá, Digite 3");
            System.out.println("Se quiser sair digite 0");
            escolha = scanner.nextInt();
            if (escolha == 1){
                matri2x2();
            } else if (escolha == 2) {
                matri3x3();
            }else if (escolha == 3){
                escolhaMatriz();
            }
            if (escolha == 0) {
                break;
            }
        }
        while(true);
    }

    private static void escolhaMatriz(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de linhas da sua matriz");
        int linha = scanner.nextInt();

        System.out.print("Digite a quantidade de colunas da sua matriz");
        int colunas = scanner.nextInt();

        int[][] numeros= new int[linha][colunas];

        System.out.println("Digite os valores da matriz -> "  + linha + "x" + colunas);

        for (int i = 0; i <numeros.length; i++){
            for (int j = 0; j < numeros.length; j++){
                System.out.print("Digite o valor da posição [" + i + "][" + j +"], da matriz: ");
                numeros[i][j] = scanner.nextInt();
            }
        }

        System.out.println();

        for (int i = 0; i <numeros.length; i++){
            for (int j =0; j <numeros.length; j++){
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println();
        }

        int somaTotalMatriz = 0;

        for (int[] l : numeros){
            for (int valorColuna : l){
                System.out.println(valorColuna);
                somaTotalMatriz += valorColuna;
            }
        }
        System.out.println("Valor total da soma da matriz: " + somaTotalMatriz);
    }


    private static void matri2x2 (){
        Scanner scanner = new Scanner(System.in);
        int [][] numeros = new int[2][2];

        System.out.println("Digite os valores da matriz 2x2: ");
        for (int i = 0; i <numeros.length; i++ ){
            for (int j =0; j< numeros.length; j++){
                System.out.print("Digite o valor da posição [" + i + "][" + j + "], da matriz");
                numeros[i][j] = scanner.nextInt();

            }
        }
        System.out.println();

        for (int i = 0; i <numeros.length; i++ ){
            for (int j =0; j< numeros.length; j++){
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println();

        }
    }
    private static void matri3x3(){
        Scanner scanner = new Scanner(System.in);
        int[][] numeros = new int[3][3];
        System.out.println("Digite os valores da matriz 3x3: ");
        for (int i = 0; i <numeros.length; i++){
            for (int j = 0; j < numeros.length; j++){
                System.out.print("Digite o valor da possição [" + i + "][" + j + "], da matriz");
                numeros[i][j] = scanner.nextInt();
            }
        }
        System.out.println();

        for (int i = 0; i < numeros.length; i++){
            for (int j = 0; j < numeros.length; j++){
                System.out.print(numeros[i][j] + "");
            }
            System.out.println();
        }
    }
}