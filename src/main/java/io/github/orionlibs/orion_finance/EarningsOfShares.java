package io.github.orionlibs.orion_finance;

public class EarningsOfShares
{
    private double corporateTaxRate;
    private double incomeTaxRateForDividentPerShare;


    public EarningsOfShares(double corporateTaxRate, double incomeTaxRateForDividentPerShare)
    {
        this.corporateTaxRate = corporateTaxRate;
        this.incomeTaxRateForDividentPerShare = incomeTaxRateForDividentPerShare;
    }


    public long getEarningPerShareAfterTaxes(long earningPerShareBeforeCorporateTax)
    {
        long dividentPerShareAfterCorporateTax = (long)(earningPerShareBeforeCorporateTax * (1 - corporateTaxRate));
        long earningPerShareAfterIncomeTax = (long)(dividentPerShareAfterCorporateTax * (1 - incomeTaxRateForDividentPerShare));
        return earningPerShareAfterIncomeTax;
    }


    public long getEarningsForSharesAfterTaxes(long earningPerShareBeforeCorporateTax, long numberOfShares)
    {
        long earningForAllSharesAfterIncomeTax = numberOfShares * getEarningPerShareAfterTaxes(earningPerShareBeforeCorporateTax);
        return earningForAllSharesAfterIncomeTax;
    }
}
