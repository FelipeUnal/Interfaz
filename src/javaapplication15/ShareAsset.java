/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;

/**
 *
 * @author Estudiante
 */
public abstract class ShareAsset implements Asset{
    protected String symbol;
    protected double TotalCost;
    protected double CurrentPrice;

    public ShareAsset(String symbol, double TotalCost, double CurrentPrice) {
        this.symbol = symbol;
        this.TotalCost = TotalCost;
        this.CurrentPrice = CurrentPrice;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getTotalCost() {
        return TotalCost;
    }

    public void setTotalCost(double TotalCost) {
        this.TotalCost = TotalCost;
    }

    public double getCurrentPrice() {
        return CurrentPrice;
    }

    public void setCurrentPrice(double CurrentPrice) {
        this.CurrentPrice = CurrentPrice;
    }
    
    
    
    @Override
    public double getProfit(){
        return TotalCost*CurrentPrice;
    }
}
