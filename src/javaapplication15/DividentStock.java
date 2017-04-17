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
public class DividentStock extends Stock{
    private double dividendts;

    public DividentStock(double dividendts, int TotalShares, String symbol, double TotalCost, double CurrentPrice) {
        super(TotalShares, symbol, TotalCost, CurrentPrice);
        this.dividendts = dividendts;
    }

    public double getDividendts() {
        return dividendts;
    }

    public void setDividendts(double dividendts) {
        this.dividendts = dividendts;
    }
    
    
    @Override
    public double getMarketValue(){
        return(this.TotalShares*this.CurrentPrice)+this.dividendts;
    }
}
