public class Calculo{
    public static void main(String[] args) {
        PorcentajeCalculo(27, 1000);

    }
    public static void PorcentajeCalculo(int iva, int precio){
        int resultado = (iva * precio) / 100 + precio;
        System.out.println("El precio con IVA incluido es : " + resultado);
    }
}
