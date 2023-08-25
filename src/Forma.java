import java.util.ArrayList;

public abstract class Forma {
    int qtdLados;
    double area;
    double perimetro;
    static ArrayList<Forma> listaFormas = new ArrayList<>();

    public abstract double calcArea();

    public abstract double calcPerimetro();

    public static void listarTudo(){

        if (listaFormas!=null){
            for (Forma forma:listaFormas){
                System.out.println(forma);
            }

        }
    }

    public static void listarQuadrado(){
        if (listaFormas!=null){
            for (Forma eqFor: listaFormas) {
                if (eqFor instanceof Quadrado){
                    System.out.println(eqFor+"\n====================================");
                }
            }
        }
    }

    public static void listarRetangulo(){
        if (listaFormas!=null){
            for (Forma eqFor: listaFormas) {
                if (eqFor instanceof Retangulo){
                    System.out.println(eqFor+"\n====================================");
                }
            }
        }
    }

    public static void listarCirculos(){
        if (listaFormas!=null){
            for (Forma eqFor: listaFormas) {
                if (eqFor instanceof Circulo){
                    System.out.println(eqFor+"\n====================================");
                }
            }
        }
    }

    public static void ListarIsosceles(){
        if (listaFormas!=null){
            for (Forma eqFor: listaFormas) {
                if (eqFor instanceof Isosceles){
                    System.out.println(eqFor+"\n====================================");
                }
            }
        }
    }

    public static void listarEscaleno(){
        if (listaFormas!=null){
            for (Forma eqFor: listaFormas) {
                if (eqFor instanceof Escaleno){
                    System.out.println(eqFor+"\n====================================");
                }
            }
        }
    }

    public static void listarEquilatero(){
        if (listaFormas!=null){
            for (Forma eqFor: listaFormas) {
                if (eqFor instanceof Equilatero){
                    System.out.println(eqFor+"\n====================================");
                }
            }
        }
    }
}
