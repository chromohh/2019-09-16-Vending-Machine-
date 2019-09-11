package sindre.Product;

public class Food extends Products {
    public Food(String name, String productInfo, int kcal, int price, int productNumber){
        super(name, productInfo, kcal, price, productNumber);
    }

    @Override
    public String useProduct(){
        System.out.println("ate big tasty " + name + "!");
        return "ate";
    }
}
