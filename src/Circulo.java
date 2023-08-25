public class Circulo extends FormasGeometricas{
     double raio;
     double diametro;

    public Circulo(double raio, double diametro){

        this.diametro=raio*2;
        this.raio=diametro/2;
    }

    public double calcArea(){
        double pi = Math.PI;
        area = pi*(raio*raio);

        return area;
    }

    public double calcPerimetro(){
        double pi = Math.PI;
        perimetro= pi*2*raio;

        return perimetro;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "Raio=" + raio +
                ", Diametro=" + diametro +
                ", Area=" + calcArea() +
                ", Perimetro=" + calcPerimetro() +
                '}';
    }

    public static void listarCirculos(){
        if (listaFormas!=null){
            for (FormasGeometricas eqFor: listaFormas) {
                if (eqFor instanceof Circulo){
                    System.out.println(eqFor+"\n====================================");
                }
            }
        }
    }
}
