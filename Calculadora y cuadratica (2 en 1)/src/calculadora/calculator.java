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

    public double[] raiz (double a, double b, double c){
        double num1 = (-b + Math.sqrt( (b*b) - (4 * a * c ))) / (2 * a);
        double num2 = (-b - Math.sqrt( (b*b) - (4 * a * c))) / (2 * a);
        double[] resultados = {num1, num2};
        return resultados;
        
        public class Main {
    public static void main(String[] args) {
        String s = doSomething();
        System.out.println("Imprimir el valor de la función" + s);
    }

    private static String doSomething() {
        return "Leandro"; //ejemplo uno
        
    public String DevolverNombre (String Leandro) {
        If (nombre == "Leandro"){ //ejemplo 2
            return Leandro;
            }
    }
}
    }
}
