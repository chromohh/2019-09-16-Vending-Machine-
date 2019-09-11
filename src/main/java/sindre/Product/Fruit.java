package sindre.Product;

public class Fruit extends Products {
    public Fruit(String name, String productInfo, int kcal, int price, int productNumber){
        super(name, productInfo, kcal, price, productNumber);
    }

    @Override
    public String useProduct(){
        System.out.println("ate moldy " + name + "!!");
        return "ate";
    }
}
