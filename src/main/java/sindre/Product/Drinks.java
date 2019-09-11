package sindre.Product;

public class Drinks extends Products {
    public Drinks(String name, String productInfo, int kcal, int price, int productNumber){
        super(name, productInfo, kcal, price, productNumber);
    }

    @Override
    public String useProduct(){
        System.out.println("you drink " + name + "!!!");
        return "drunk";
    }
}
