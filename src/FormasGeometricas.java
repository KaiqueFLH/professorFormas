import java.util.ArrayList;

public class FormasGeometricas {
    int qtdLados;
    double area;
    double perimetro;
    static ArrayList<FormasGeometricas> listaFormas = new ArrayList<>();


    public static void listarTudo(){

        if (listaFormas!=null){
            for (FormasGeometricas forma:listaFormas){
                System.out.println(forma);
            }

        }
    }
}
