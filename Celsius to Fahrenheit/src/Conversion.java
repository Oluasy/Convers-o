import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = -1;

        while (option != 0) {
            System.out.println("""
                    MENU
                    1 - Converter Celsius para Fahrenheit
                    2 - Converter Fahrenheit para Celsius

                    0 - Sair
                    Selecione a opção que deseja converter: """);
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Digite a temperatura em graus Celsius:");
                    double temperatureInCelsius = scanner.nextDouble();
                    double conversionInFahrenheit = (temperatureInCelsius * 1.8) + 32;
                    System.out.println(String.format("A temperatura de %.2f Celsius é equivalente a %.2f Fahrenheit", temperatureInCelsius, conversionInFahrenheit));
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Digite a temperatura em graus Fahrenheit:");
                    double temperatureInFahrenheit = scanner.nextDouble();
                    double conversionInCelsius = (5.0 / 9) * (temperatureInFahrenheit - 32);
                    System.out.println(String.format("A temperatura de %.2f Fahrenheit é equivalente a %.2f Celsius", temperatureInFahrenheit, conversionInCelsius));
                    System.out.println();
                    break;
                case 0:
                    System.out.println("Encerrando o programa");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente");
            }
        }
    }
}

