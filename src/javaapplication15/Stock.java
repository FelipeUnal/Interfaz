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
public class Stock extends ShareAsset{
    
    protected int TotalShares;

    public Stock(int TotalShares, String symbol, double TotalCost, double CurrentPrice) {
        super(symbol, TotalCost, CurrentPrice);
        this.TotalShares = TotalShares;
    }

    public int getTotalShares() {
        return TotalShares;
    }

    public void setTotalShares(int TotalShares) {
        this.TotalShares = TotalShares;
    }

    public String getSymbol() {
        return symbol;
    }

    @Override
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public double getTotalCost() {
        return TotalCost;
    }

    @Override
    public void setTotalCost(double TotalCost) {
        this.TotalCost = TotalCost;
    }

    @Override
    public double getCurrentPrice() {
        return CurrentPrice;
    }

    @Override
    public void setCurrentPrice(double CurrentPrice) {
        this.CurrentPrice = CurrentPrice;
    }
    
    
    
    @Override
    public double getProfit(){
        return (this.TotalShares*this.CurrentPrice)-this.TotalCost;
    }

    @Override
    public double getMarketValue() {
        return this.TotalShares*this.CurrentPrice;
    }
    
}
