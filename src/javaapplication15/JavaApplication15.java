
package javaapplication15;


public class JavaApplication15 {

    
    public static void main(String[] args) {
            Banco BBVA = new Banco();
            Cliente Fabian = new Cliente("Fabian","Giraldo","123",33,"fagiraldo");
            Cliente Brian = new Cliente("Brian","Barreto","321",21,"bebarretoc");
            Asset activo1 = new Cash(100);
            Asset activo2 = new Stock(2, "Google", 100, 80);
            Asset activo3 = new MutualFound(2, "Samsung", 20, 50);
            Fabian.addAsset(activo1);
            Brian.addAsset(activo2);
            Brian.addAsset(activo3);
            BBVA.addCliente(Fabian);
            BBVA.addCliente(Brian);
            double TotalMercado = BBVA.getAllMarketValue();
            System.out.println("Total :"+ TotalMercado);
            
    }
    
}
