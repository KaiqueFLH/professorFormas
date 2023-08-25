public class Escaleno extends Triangulo {

    public Escaleno(double lado1,double lado2,double lado3){
        super(lado1,lado2,lado3);
    }

    @Override
    public double calcArea(){
        double semiPerimetro = calcPerimetro()/2;
        return  Math.sqrt(semiPerimetro*(semiPerimetro-lado1)*(semiPerimetro-lado2)*(semiPerimetro-lado3));
    }

    @Override
    public String toString() {
        return "Escaleno{" +
                "lado1=" + lado1 +
                ", lado2=" + lado2 +
                ", lado3=" + lado3 +
                ", Area=" + calcArea() +
                ", Perimetro=" + calcPerimetro() +
                '}';
    }
}
