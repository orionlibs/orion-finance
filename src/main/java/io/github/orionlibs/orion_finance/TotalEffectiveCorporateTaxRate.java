package io.github.orionlibs.orion_finance;

public class TotalEffectiveCorporateTaxRate
{
    private double corporateTaxRate;
    private double incomeTaxRateForDividentPerShare;


    public TotalEffectiveCorporateTaxRate(double corporateTaxRate, double incomeTaxRateForDividentPerShare)
    {
        this.corporateTaxRate = corporateTaxRate;
        this.incomeTaxRateForDividentPerShare = incomeTaxRateForDividentPerShare;
    }


    public double getTotalEffectiveTaxRatePerShare(long earningPerShareBeforeCorporateTax)
    {
        long dividentPerShareAfterCorporateTax = (long)(earningPerShareBeforeCorporateTax * (1 - corporateTaxRate));
        long earningPerShareAfterIncomeTax = (long)(dividentPerShareAfterCorporateTax * (1 - incomeTaxRateForDividentPerShare));
        double totalEffectiveTaxRate = (earningPerShareBeforeCorporateTax - earningPerShareAfterIncomeTax) / earningPerShareBeforeCorporateTax;
        return totalEffectiveTaxRate;
    }
}
