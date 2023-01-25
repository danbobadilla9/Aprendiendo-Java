public class OperadorTernario {
    public static void main(String[] args) {
        // Estructura variable = condicion ? retorno1-> true: retorno 2 -> false
        String variable = 8 == 8 ? "Si es verdadero": "Es falso";
        System.out.println("variable = " + variable);
        String estado;
        double promedio = 6.2;
        estado = promedio >= 5.49 ? "Aprobado": "No aprobado";
        System.out.println("estado = " + estado);
    }
}
