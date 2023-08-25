import java.text.Normalizer;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static Professor professorLogado = new Professor("Kaique", "123");
    public static FormasGeometricas forma = new FormasGeometricas();

    public static void main(String[] args) {
        if (login()){
            menuPrincipal();
        }
    }

    public static boolean login() {
        int i = 3;
        String senha;

        do {
            System.out.println("Informe a sua Senha: ");
            senha = sc.next();

            if (senha.equals(professorLogado.senha)) {
                i = 3;
                return true;
            } else {
                i--;
                System.out.println("Senha Incorreta! Tente Novamente!");
            }
            if (i == 0) {
                System.exit(0);
            }
        } while (!senha.equals(professorLogado.senha));
        return false;
    }

    public static void menuPrincipal() {
        int opcao;
        do {
            System.out.println("""
                    [1] Círculo
                    [2] Triângulo
                    [3] Retângulo
                    [4] Quadrado 
                    [5] Listar Formas.
                    """);
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.println("Digite o Raio:");
                    double raio = sc.nextDouble();
                    System.out.println(professorLogado.createCircle(raio,forma));
                }
                case 2 -> {
                    double lado1, lado2, lado3;
                    do {
                        System.out.println("Informe o Valor do Lado 1:");
                        lado1 = sc.nextDouble();
                        System.out.println("Informe o Valor do Lado 2:");
                        lado2 = sc.nextDouble();
                        System.out.println("Informe o Valor do Lado 3:");
                        lado3 = sc.nextDouble();
                    }while(lado1>(lado2+lado3) || lado2>(lado1+lado3) || lado3>(lado1+lado2));
                    System.out.println(professorLogado.createTriangle(lado1,lado2,lado3,forma));
                }
                case 3 -> {
                    double comprimento, altura;
                    do {
                        System.out.println("Informe o Comprimento do Retângulo:");
                        comprimento = sc.nextDouble();
                        System.out.println("Informe a Altura do Retângulo:");
                        altura = sc.nextDouble();

                    } while (comprimento <= 0 && altura <= 0 && altura != comprimento);
                    System.out.println(professorLogado.createRetangle(comprimento,altura,forma));
                }
                case 4 -> {
                    System.out.println("Informe o Valor do Lado do seu Quadrado: ");
                    double lado = sc.nextDouble();
                    System.out.println(professorLogado.createSquare(lado,forma));
                }
                case 5 -> listarFormas();
            }
        } while (true);
    }


    private static void listarFormas() {
        System.out.println("""
                [1] Listar Círculo
                [2] Listar Triângulo
                [3] Listar Retângulo
                [4] Listar Quadrado 
                [5] Listar Todas as Formas.
                [6] Voltar Para o Menu.
                """);
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1 -> {
                Circulo.listarCirculos();

            }
            case 2 -> {
                Equilatero.listarEquilatero();
                Isosceles.ListarIsosceles();
                Escaleno.listarEscaleno();
            }
            case 3 -> Retangulo.listarRetangulo();
            case 4 -> Quadrado.listarQuadrado();
            case 5 -> FormasGeometricas.listarTudo();
            case 6 -> System.out.println("Você selecionou Voltar para o Menu!");
        }
    }
}