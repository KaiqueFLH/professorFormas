public class Quadrado extends FormasGeometricas{
    double lado;

    public Quadrado(double lado, int qtdLados){
        this.qtdLados = qtdLados;
        this.lado = lado;
    }

    public double calcArea(){
        area=Math.pow(lado,2);
        return area;
    }

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

    public static void listarQuadrado(){
        if (listaFormas!=null){
            for (FormasGeometricas eqFor: listaFormas) {
                if (eqFor instanceof Quadrado){
                    System.out.println(eqFor+"\n====================================");
                }
            }
        }
    }

}
