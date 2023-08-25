public class Professor {
    String nome;
    String senha;


    public Professor(String nome, String senha){
        this.nome = nome;
        this.senha=senha;
    }


    public String createCircle(double raio){
        Circulo circuloLog = new Circulo(raio,raio*2);
        Forma.listaFormas.add(circuloLog);
        return "Círculo Criado!";
    }

    public String createTriangle(double lado1, double lado2, double lado3){
            double ladoMaior,ladoMenor;

            if (lado1>lado2 && lado2>lado3 || lado1>lado3 && lado3>lado2){
                ladoMaior=lado1;
                ladoMenor=lado2+lado3;
            }
            else if (lado2>lado1 && lado1>lado3 || lado2>lado3 && lado3>lado1){
                ladoMaior=lado2;
                ladoMenor=lado1+lado3;
            }
            else{
                ladoMaior=lado3;
                ladoMenor=lado1+lado2;
            }

            if (ladoMaior<ladoMenor){

                if (lado1==lado2 && lado2==lado3){
                    Equilatero trianguloEquilatero = new Equilatero(lado1,lado2,lado3);
                    Forma.listaFormas.add(trianguloEquilatero);
                }
                else if (lado1!=lado2 && lado2==lado3 || lado1==lado2 && lado2!=lado3 || lado1==lado3 && lado3!=lado2){
                    Isosceles trianguloIsosceles = new Isosceles(lado1, lado2, lado3);
                    Forma.listaFormas.add(trianguloIsosceles);
                }
                else if (lado1!=lado2 && lado2!=lado3){
                    Escaleno trianguloEscaleno = new Escaleno(lado1, lado2, lado3);
                    Forma.listaFormas.add(trianguloEscaleno);
                }
                return "Triângulo Criado!";
            }
            else {

                return "O Triângulo não pode ser criado, pois as medidas não são válidas!";
            }
            //FormasGeometricas.listaFormas.add(Triangulo.listaTriangulos);
    }

    public String createRetangle(double comprimento, double altura){
            if (altura > 0 && altura == comprimento){
                return "A Forma Geométrica que você está criando não é um Retângulo, mas sim um quadrado pois os lados são iguais.";
            }
            if (comprimento<=0 && altura<=0){
                return "O Retângulo não pode ser criado! Suas Medidas são iguais ou inferiores a 0.";
            }
            else {
                Retangulo retanguloLog = new Retangulo(comprimento, altura, 4);
                Forma.listaFormas.add(retanguloLog);
                return "Retângulo Criado!";
            }
    }

    public String createSquare(double lado){
        Quadrado quadradoLog = new Quadrado(lado, 4);
        Forma.listaFormas.add(quadradoLog);
        return "Quadrado Criado!";
    }



}
