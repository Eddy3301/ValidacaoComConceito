import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        float nota;

        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a nota do aluno:");
        nota = scanner.nextFloat();

       
        if (nota < 0 || nota > 100) {
            System.out.println("Nota inválida. Digite um valor entre 0 e 100."); }

            
        else if (nota >= 90) {
            System.out.println("A"); 
        } else if (nota >= 75 && nota < 90) {
            System.out.println("B");
        } else if (nota >= 60 && nota < 75) {
            System.out.println("C");
        } else if (nota < 60) {
            System.out.println("REPROVADO."); }
             
                scanner.close();
        }
        }
    

