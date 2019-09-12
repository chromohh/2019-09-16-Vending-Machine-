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
        boolean wasFound = false;
        for (Money x : Money.values()) {
            if (money == x.getValue()) {
                moneyPool = moneyPool + money;
                wasFound = true;
            }
        }
        if (!wasFound) {
            throw new IllegalArgumentException("Wrong input, only 1,5,10,20,50,100,500,1000");
        }
    }
    @Override
    public Products request(int productNumber) {
        for(int i = 0; i < productArr.length; i++){
            if(productArr[i].getProductNumber() == productNumber || moneyPool >= productArr[i].getPrice()){
                moneyPool = moneyPool - productArr[i].getPrice();
                return productArr[i];
            }
        }
        throw new IllegalArgumentException("Product Does not exist or not enough money");
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
        return new String[0];
    }
}
