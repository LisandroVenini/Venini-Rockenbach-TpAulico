package modelos;

public class FinancialReport  extends ReportGenerator {
    @Override
    public void getDatos() {
        System.out.println("Obteniendo datos financieros");   
    }

    @Override
    public void procesarDatos() {
        System.out.println("Procesando datos financieros");   
    }

    @Override
    public void exportarDatos() {
        System.out.println("Exportando datos financieros");   
    }
}