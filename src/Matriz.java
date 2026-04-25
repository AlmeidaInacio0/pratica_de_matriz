import java.util.Scanner;

public class Matriz {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int escolha;
        System.out.println("Escolha uma matriz");
        do {
            System.out.println("Escolha 1 para a matriz 2x2");
            System.out.println("Escolha 2 para a matriz 3x3");
            System.out.println("Se quiser sair digite 0");
            escolha = scanner.nextInt();
            if (escolha == 1){
                matri2x2();
            } else if (escolha == 2) {
                matri3x3();
            };
            if (escolha == 0) {
                break;
            }
        }
        while(true);
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