public class Retangulo extends Forma {
    double comprimento;
    double altura;

    public Retangulo(double comprimento, double altura, int qtdLados){
        this.qtdLados = qtdLados;
        this.comprimento= comprimento;
        this.altura = altura;
    }

    @Override
    public double calcArea(){
        area=comprimento*altura;
        return area;
    }

    @Override
    public double calcPerimetro(){
        perimetro= 2*(comprimento+altura);
        return perimetro;
    }

    @Override
    public String toString() {
        return "Retangulo{" +
                "Comprimento=" + comprimento +
                ", Altura=" + altura +
                ", Area=" + calcArea() +
                ", Perimetro=" + calcPerimetro() +
                '}';
    }
}
