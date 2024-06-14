package io.github.orionlibs.orion_finance;

public class BalanceSheetIdentity
{
    public long getAssets(long liabilities, long shareholdersEquity)
    {
        long assets = liabilities + shareholdersEquity;
        return assets;
    }


    public long getLiabilities(long assets, long shareholdersEquity)
    {
        long liabilities = assets - shareholdersEquity;
        return liabilities;
    }


    public long getShareholdersEquity(long assets, long liabilities)
    {
        long shareholdersEquity = assets - liabilities;
        return shareholdersEquity;
    }
}
