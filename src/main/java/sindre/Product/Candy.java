package sindre.Product;

public class Candy extends Products {

    public Candy(String name, String productInfo, int kcal, int price, int productNumber){
        super(name, productInfo, kcal, price, productNumber);
    }

    @Override
    public String useProduct(){
        System.out.println("ate big tasty " + name +"!");
        return "ate";
    }
}
