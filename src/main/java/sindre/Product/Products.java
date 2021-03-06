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

    public String examineProduct(Products asd){
        String productExamine = "name: "+asd.name+"\nprice: "+asd.price+"\nkcal: "+asd.kcal+"\nproduct info: "+asd.productInfo;
        return productExamine;
    }

    public abstract String useProduct();

    public int getPrice() {return price; }
    public String getProductInfo() {return productInfo; }
    public int getProductNumber() {return productNumber; }

}
