package sindre.VendingMachine;

import sindre.Product.*;

public class ImplementVM implements VendingMachine{
    public enum Money {
        En(1),
        Fem(5),
        Tio(10),
        Tjugo(20),
        Femtio(50),
        Hundra(100),
        Femhundra(500),
        Tusen(1000);
        final int value;
        Money(int value) {
            this.value = value;
        }
        public int getValue(){return value;}
    }

    private int moneyPool;
    private Products[] productArr;

    public ImplementVM(){
        this.moneyPool = 0;
        this.productArr = new Products[5];
        productArr[0] = new Candy("Twix", "helt vanlig twix", 143, 13, 43);
        productArr[1] = new Drinks("Coca Cola", "helt vanliga cola", 99, 15, 44);
        productArr[2] = new Food("Stroganoff", "helt vanlig stroganoff", 253, 40, 45);
        productArr[3] = new Fruit("Banan", "helt vanlig banan", 100, 8, 46);
        productArr[4] = new Candy("Snickers", "helt vanlig snickers", 190, 13, 47);
    }

    @Override
    public void addCurrency(int money) {
        for (Money x : Money.values()) {
            try{
            if (money == x.getValue()) {
                moneyPool = moneyPool + money;
            }}
            catch(NullPointerException e){
                System.out.println("wrong input");
            }
        }

    }
    @Override
    public Products request(int productNumber) {

           for(int i = 0; i < productArr.length; i++){

               try{if(productArr[i].getProductNumber() == productNumber || moneyPool >= productArr[i].getPrice()){
                moneyPool = moneyPool - productArr[i].getPrice();
                return productArr[i];
            }
               }catch (NullPointerException e){
                   System.out.println("not a product");
               }

       }
        return null;
    }

    @Override
    public int endSession() {
        int ret = moneyPool;
        moneyPool = 0;
        return ret;
    }

    @Override
    public String getDescription(int productNumber) {
        for(int i = 0; i < productArr.length; i++){
            if(productArr[i].getProductNumber() == productNumber){ return productArr[i].getProductInfo();}
        }
        throw new IllegalArgumentException("Product Does not exist");
    }

    @Override
    public int getBalance() {
        return moneyPool;
    }

    @Override
    public String[] getProducts() {
        String[] ret = new String[productArr.length];
        for(int i = 0; i < productArr.length; i++){
            System.out.println(productArr[i].examineProduct(productArr[i]));
            ret[i] = productArr[i].toString();
        }
        return ret;
    }
}
