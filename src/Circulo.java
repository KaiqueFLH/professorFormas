public class Circulo extends Forma {
     double raio;
     double diametro;

    public Circulo(double raio, double diametro){

        this.diametro=raio*2;
        this.raio=diametro/2;
    }

    @Override
    public double calcArea(){
        double pi = Math.PI;
        area = pi*(raio*raio);

        return area;
    }

    @Override
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
}
