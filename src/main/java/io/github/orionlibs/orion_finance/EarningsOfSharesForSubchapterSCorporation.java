package io.github.orionlibs.orion_finance;

public class EarningsOfSharesForSubchapterSCorporation
{
    private double incomeTaxRateForDividentPerShare;


    public EarningsOfSharesForSubchapterSCorporation(double incomeTaxRateForDividentPerShare)
    {
        this.incomeTaxRateForDividentPerShare = incomeTaxRateForDividentPerShare;
    }


    public long getEarningPerShareAfterIncomeTax(long earningPerShareBeforeIncomeTax)
    {
        long dividentPerShareAfterIncomeTax = (long)(earningPerShareBeforeIncomeTax * (1 - incomeTaxRateForDividentPerShare));
        return dividentPerShareAfterIncomeTax;
    }


    public long getEarningsForSharesAfterIncomeTax(long earningPerShareBeforeIncomeTax, long numberOfShares)
    {
        long earningForAllSharesAfterIncomeTax = numberOfShares * getEarningPerShareAfterIncomeTax(earningPerShareBeforeIncomeTax);
        return earningForAllSharesAfterIncomeTax;
    }
}
