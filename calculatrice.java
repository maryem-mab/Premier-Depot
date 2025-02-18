import java.util.Scanner;

// Classe Calculatrice contenant les méthodes pour les opérations de base
class Calculatrice {
    
    public double addition(double a, double b) {
        return a + b;
    }
    
    public double soustraction(double a, double b) {
        return a - b;
    }
    
    public double multiplication(double a, double b) {
        return a * b;
    }
    
    public double division(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Erreur : Division par zéro !");
        }
        return a / b;
    }
}
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculatrice calculatrice = new Calculatrice();
        
        System.out.print("Entrez le premier nombre : ");
        double nombre1 = scanner.nextDouble();
        
        System.out.print("Entrez le deuxième nombre : ");
        double nombre2 = scanner.nextDouble();
        
        System.out.print("Choisissez une opération (+, -, *, /) : ");
        char operation = scanner.next().charAt(0);
        
        try {
            double resultat;
            switch (operation) {
                case '+':
                    resultat = calculatrice.addition(nombre1, nombre2);
                    break;
                case '-':
                    resultat = calculatrice.soustraction(nombre1, nombre2);
                    break;
                case '*':
                    resultat = calculatrice.multiplication(nombre1, nombre2);
                    break;
                case '/':
                    resultat = calculatrice.division(nombre1, nombre2);
                    break;
                default:
                    System.out.println("Opération invalide !");
                    return;
            }
            System.out.println("Résultat : " + resultat);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        
        scanner.close();
    }
}

    

