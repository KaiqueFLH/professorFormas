
public abstract class Triangulo extends Forma {

    double lado1;
    double lado2;
    double lado3;


    public Triangulo(double lado1,double lado2,double lado3){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;

    }

    @Override
    public double calcPerimetro() {
        return perimetro = lado1 + lado2 + lado3;
    }

    //static ArrayList<Triangulo> listaTriangulos = new ArrayList<>();




}
