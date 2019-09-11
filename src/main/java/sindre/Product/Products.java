package sindre.Product;

public abstract class Products {
    protected String name;
    protected int price;
    protected int kcal;
    protected String productInfo;
    protected int productNumber;

    public Products(String name, String productInfo, int kcal, int price, int productNumber){
        this.name = name;
        this.productInfo = productInfo;
        this.kcal = kcal;
        this.price = price;
        this.productNumber = productNumber;
    }

    public static String examineProduct(Products asd){
        String productExamine = "name: "+asd.name+"\nprice: "+asd.price+"\nkcal: "+asd.kcal+"\nproduct info: "+asd.productInfo;
        System.out.println(productExamine);
        return productExamine;
    }

    public abstract String useProduct();
}