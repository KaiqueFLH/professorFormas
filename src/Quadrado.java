public class Quadrado extends Forma {
    double lado;

    public Quadrado(double lado, int qtdLados){
        this.qtdLados = qtdLados;
        this.lado = lado;
    }

    @Override
    public double calcArea(){
        area=Math.pow(lado,2);
        return area;
    }

    @Override
    public double calcPerimetro(){
        perimetro = lado*4;
        return perimetro;
    }

    @Override
    public String toString() {
        return "Quadrado{" +
                "Lado=" + lado +
                ", Area=" + calcArea() +
                ", Perimetro=" + calcPerimetro() +
                '}';
    }



}
