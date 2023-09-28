public class Main 
{
    static int productId;
    static String productName;
    static String description;
    static float price;
    static float maxDiscountAllowed;
    static int monthOfManufacture;
    static int yearOfManufacture;
    static boolean imported;
    
    public static int getProductId()
    {
        return productId;
    }
    public static void setProductId(int productId)
    {
        this.productId= productId;
    }
    public static String getProductName()
    {
        return productName;
    }
    public static void setProductName(String productName)
    {
        this.productName= productName;
    }
    public static String getDescription()
    {
        return description;
    }
    public static void setDescription(String description)
    {
        this.description= description;
    }
    public static float getPrice()
    {
        return price;
    }
    public static void setPrice(float price)
    {
        this.price= price;
    }
    public static void setMaxDiscountAllowed(float maxDiscountAllowed)
    {
        this.maxDiscountAllowed=maxDiscountAllowed;
    }
    public static float getMaxDiscountAllowed()
    {
        return maxDiscountAllowed;
    }
     public static int getMonthOfManufacture()
    {
        return  monthOfManufacture;
    }
    public static void setMonthOfManufacture(int monthOfManufacture)
    {
        this.monthOfManufacture = monthOfManufacture;
    }
    public static int getYearOfManufacture()
    {
        return yearOfManufacture;
    }
    public static void setYearOfManufacture(int yearOfManufacture)
    {
        this.yearOfManufacture = yearOfManufacture;
    }
    public static boolean getImported(boolean imported)
    {
        this.imported= imported;
    }
    public static void setImported()
    {
        return imported;
    }
   public static float getDiscountedPrice() 
   {
       float a= getPrice();
       float b= getMaxDiscountAllowed();
       return a-b;
   }
   public static float getTotalPriceForItems(int count)
   {
       float a= getPrice();
       return a*count;
   }
   public static float getDiscountedPriceForItems(int count)
   {
       float a= getDiscountedPrice();
       return a*count;
   }
}

public class TestMain()
{
    public static void main (String[] args) {
        /* code */
    }
}
