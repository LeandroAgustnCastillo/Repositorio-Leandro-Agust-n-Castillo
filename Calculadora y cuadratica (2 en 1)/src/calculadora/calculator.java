package calculadora;

public class calculator {

    public int suma(int num1, int num2) {
        return num1 + num2;
    }


    public int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public int division(int num1, int num2) {
        return num1 / num2;
    }
    
      public String miNombre() {
        return "pepe";
    }

    public double[] raiz (double a, double b, double c){
        double num1 = (-b + Math.sqrt( (b*b) - (4 * a * c ))) / (2 * a);
        double num2 = (-b - Math.sqrt( (b*b) - (4 * a * c))) / (2 * a);
        double[] resultados = {num1, num2};
        return resultados;
        
    
}
    }
}
