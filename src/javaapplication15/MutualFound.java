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
public class MutualFound extends ShareAsset{
    private double TotalShares;

    public MutualFound(double TotalShares, String symbol, double TotalCost, double CurrentPrice) {
        super(symbol, TotalCost, CurrentPrice);
        this.TotalShares = TotalShares;
    }

    public double getTotalShares() {
        return TotalShares;
    }

    public void setTotalShares(double TotalShares) {
        this.TotalShares = TotalShares;
    }

    @Override
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
    public double getMarketValue() {
        return this.TotalShares*this.CurrentPrice;
    }

    @Override
    public double getProfit() {
        return (this.CurrentPrice*this.TotalShares)-this.TotalCost;
    }
    
}
