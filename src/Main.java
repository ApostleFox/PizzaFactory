import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        PizzaDemo pizzaDemo = new PizzaDemo(scanner);
        pizzaDemo.makeChoice();
    }
}
