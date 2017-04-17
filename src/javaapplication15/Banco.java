
package javaapplication15;
import java.util.HashMap;
import java.util.TreeMap;


public class Banco {
    private HashMap<String,Cliente> Cliente;
    
    public Banco(){
        this.Cliente = new HashMap<>();
    }
    
    public void addCliente(Cliente Cliente){
        this.Cliente.put(Cliente.getEmail(), Cliente);
    }
    
    public HashMap getAllByTypeAsset(){
        HashMap<String,Double> Total = new HashMap<>();
        for (Cliente cliente : this.Cliente.values()) {
            for(Asset asset : cliente.getAsset()){
                if(asset instanceof Cash){
                    if(!Total.containsKey("Cash")){Total.put("Cash", asset.getMarketValue());}
                    else{Total.put("Cash", (Total.get("Cash")+asset.getMarketValue()));}
                }else if(asset instanceof MutualFound){
                    if(!Total.containsKey("MutualFouund")){Total.put("MutualFound", asset.getMarketValue());}
                    else{Total.put("MutualFound", (Total.get("MutualFound")+asset.getMarketValue()));}
                }else if(asset instanceof Stock){
                    if(!Total.containsKey("Stock")){Total.put("Stock", asset.getMarketValue());}
                    else{Total.put("Stock", (Total.get("Stock")+asset.getMarketValue()));}
                }else if(asset instanceof DividentStock){
                    if(!Total.containsKey("DividentStock")){Total.put("DividentStock", asset.getMarketValue());}
                    else{Total.put("DividentStock", (Total.get("DividentStock")+asset.getMarketValue()));}
                }
            }            
        }
        return Total;
    }
    
    /*public Cliente getMaxProfit(){
        TreeMap<String, Double> Total = new TreeMap<>();
        for (Cliente cliente : this.Cliente.values()) {
            for(Asset asset : cliente.getAsset()){
                
     
            }            
        }
     
    }*/
    
    public double getAllProfit(){
        double Total = 0;
        for (Cliente cliente : this.Cliente.values()) {
            for(Asset Asset : cliente.getAsset()){
                Total+=Asset.getProfit();
            }            
        }
        return Total;
    }
    
    public double getAllMarketValue(){
        double Total = 0;
        for (Cliente cliente : this.Cliente.values()) {
            for(Asset Asset : cliente.getAsset()){
                Total+=Asset.getMarketValue();
            }            
        }
        return Total;
    }
}
