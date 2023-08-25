public class Retangulo extends FormasGeometricas{
    double comprimento;
    double altura;

    public Retangulo(double comprimento, double altura, int qtdLados){
        this.qtdLados = qtdLados;
        this.comprimento= comprimento;
        this.altura = altura;
    }

    public double calcArea(){
        area=comprimento*altura;
        return area;
    }
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

    public static void listarRetangulo(){
        if (listaFormas!=null){
            for (FormasGeometricas eqFor: listaFormas) {
                if (eqFor instanceof Retangulo){
                    System.out.println(eqFor+"\n====================================");
                }
            }
        }
    }
}
