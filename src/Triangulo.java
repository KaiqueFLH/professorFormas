
public abstract class Triangulo extends FormasGeometricas{

    double lado1;
    double lado2;
    double lado3;


    public Triangulo(double lado1,double lado2,double lado3){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;

    }

    public abstract double calcArea();

    public abstract double calcPerimetro();


    //static ArrayList<Triangulo> listaTriangulos = new ArrayList<>();




}
