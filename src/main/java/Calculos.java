import java.util.HashMap;

public class Calculos {
    public float calcularAreaTrianguloRetangulo(float base, float altura) throws Exception {
        if(base <= 0){
            System.out.println("Não é permitido trabalhar com a base nula ou negativa");
            throw new Exception("Não é permitido trabalhar com a base nula ou negativa");
        }
        if(altura <= 0){
            System.out.println("Não é permitido trabalhar com a altura nula ou negativa");
            throw new Exception("Não é permitido trabalhar com a altura nula ou negativa");
        }
        System.out.println("Área do triângulo retângulo: " + (base*altura)/2);
        return (base*altura)/2;
    }

    public float calcularVolumeDoPrisma(float areaBase, float altura) throws Exception {
        if(areaBase <= 0){
            System.out.println("Não é permitido trabalhar com a área da base nula ou negativa");
            throw new Exception("Não é permitido trabalhar com a área da base nula ou negativa");
        }
        if(altura <= 0){
            System.out.println("Não é permitido trabalhar com a altura nula ou negativa");
            throw new Exception("Não é permitido trabalhar com a altura nula ou negativa");
        }
        System.out.println("Área do retângulo: " + areaBase*altura);
        return areaBase*altura;
    }

    public HashMap calcularBhaskara(int a, int b, int c) throws Exception {
        int delta = calcularDelta(a,b,c);
        System.out.println("Delta: " + delta);
        if(delta < 0){
            System.out.println("A equação não possui resultados reais.");
            throw new Exception("A equação não possui resultados reais.");
        }else if(delta == 0){
            System.out.println("A equação possui dois resultados reais iguais.");
        }else{
            System.out.println("A equação possui resultados reais distintos.");
        }
        HashMap<String, Float> raizes = new HashMap();
        raizes.put("x1",  -b+(float)Math.sqrt(delta)/2*a);
        raizes.put("x2",  -b-(float)Math.sqrt(delta)/2*a);
        System.out.println("Raízes: x1="+raizes.get("x1")+" x2="+raizes.get("x2"));
        return raizes;
    }

    public int calcularDelta(int a, int b, int c){ return (b*b)-4*a*c; }

    public double calcularIMC(double peso, double altura) throws Exception {
        if(peso <= 0) {
            System.out.println("Impossível trabalhar com peso nulo ou negativo");
            throw new Exception("Impossível trabalhar com peso nulo ou negativo");
        }
        if(altura <= 0) {
            System.out.println("Impossível trabalhar com altura nulo ou negativo");
            throw new Exception("Impossível trabalhar com altura nulo ou negativo");
        }
        System.out.println("IMC: "+peso/(altura*altura));
        return peso/(altura*altura);
    }
}
