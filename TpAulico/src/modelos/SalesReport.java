package modelos;

public class SalesReport extends ReportGenerator{

    @Override
    public void getDatos() {
        System.out.println("Obteniendo datos de ventas");   
    }
    @Override
    public void exportarDatos() {
        System.out.println("Exportando datos de ventas");   
    }
    @Override
    public void procesarDatos() {
        System.out.println("Procesando datos de ventas");   
    }
}
