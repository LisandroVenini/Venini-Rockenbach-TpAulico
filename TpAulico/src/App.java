import modelos.*;

public class App {
    public static void main(String[] args) throws Exception {
        ReportGenerator FinancialReport = new FinancialReport();
        FinancialReport.getDatos();
        FinancialReport.procesarDatos();
        
        ReportGenerator SalesReport = new SalesReport();
        SalesReport.procesarDatos();
        
        ReportGenerator InventoryReport = new InventoryReport();
        InventoryReport.getDatos();
        InventoryReport.exportarDatos();
    }

}
