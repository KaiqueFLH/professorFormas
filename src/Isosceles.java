public class Isosceles extends Triangulo {

    public Isosceles(double lado1,double lado2,double lado3){
        super(lado1,lado2,lado3);
        this.area=calcArea();
    }

    @Override
    public double calcArea(){
        double ladoDiferente,ladoIgual;
        if (lado1!=lado2 &&lado2==lado3){
            ladoDiferente=lado1;
            ladoIgual=lado3;
        }

        else if (lado1!=lado2 &&lado1==lado3){
            ladoDiferente=lado2;
            ladoIgual=lado3;
        }

        else {
            ladoDiferente=lado3;
            ladoIgual=lado2;
        }

        double altura = Math.sqrt(Math.pow(ladoIgual, 2) - Math.pow(ladoDiferente / 2, 2));

        area = (ladoDiferente*altura)/2;
        return area;

    }

    @Override
    public String toString() {
        return "Isosceles{" +
                "lado1=" + lado1 +
                ", lado2=" + lado2 +
                ", lado3=" + lado3 +
                ", Area=" + calcArea() +
                ", Perimetro=" + calcPerimetro() +
                '}';
    }


}
