package modelos;

public class InventoryReport extends ReportGenerator {

    @Override
    public void getDatos() {
        System.out.println("Obteniendo datos de inventario");   
    }
    @Override
    public void exportarDatos() {
        System.out.println("Exportando datos de inventario");   
    }
    @Override
    public void procesarDatos() {
        System.out.println("Procesando datos de inventario");   
    }
    
}
