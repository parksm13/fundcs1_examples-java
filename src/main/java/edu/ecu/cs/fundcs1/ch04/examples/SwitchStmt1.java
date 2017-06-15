package edu.ecu.cs.fundcs1.ch04.examples;

class SwitchStmt1
{
    public enum CustType
    {
        PLATINUM,
        GOLD,
        SILVER
    }

    public static void discountRate(CustType aCustType)
    {
        switch(aCustType)
        {
            case PLATINUM:
                System.out.format("Discount rate for customer type: %d is: 40.00%", aCustType);
                break;
            case GOLD:
                System.out.format("Discount rate for customer type: %d is: 30.00%", aCustType);
                break;
            case SILVER:
                System.out.format("Discount rate for customer type: %d is: 20.00%", aCustType);
                break;
        }
    }
    public static void main()
    {
        CustType cType = CustType.PLATINUM;
        discountRate (cType);
        cType = CustType.GOLD;
        discountRate (cType);
        cType = CustType.SILVER;
        discountRate (cType);
    }
}

//TODO: needs review and tests