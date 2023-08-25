public class Equilatero extends Triangulo {

    public Equilatero(double lado1,double lado2,double lado3){
        super(lado1,lado2,lado3);
    }

    @Override
    public double calcArea(){
        area = 1.73*(lado1*lado1)/4;
        return area;
    }

    @Override
    public double calcPerimetro() {
        perimetro = 3 * lado1;
        return perimetro;
    }

    @Override
    public String toString() {
        return "Equilatero{" +
                "lado1=" + lado1 +
                ", lado2=" + lado2 +
                ", lado3=" + lado3 +
                ", Area=" + calcArea() +
                ", Perimetro=" + calcPerimetro() +
                '}';
    }

    public static void listarEquilatero(){
        if (listaFormas!=null){
            for (FormasGeometricas eqFor: listaFormas) {
                if (eqFor instanceof Equilatero){
                    System.out.println(eqFor+"\n====================================");
                }
            }
        }
    }
}
