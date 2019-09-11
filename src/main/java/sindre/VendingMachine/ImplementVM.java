package sindre.VendingMachine;

import sindre.Product.Products;

public class ImplementVM implements VendingMachine{
    public enum Money {
        En(1),
        Fem(5),
        Tio(10),
        Tjugo(20),
        Femtio(50),
        Hundra(100),
        Femhundra(500),
        Tusen(100);
        private final int value;
        Money(int value) {
            this.value = value;
        }
    }

    public ImplementVM(){}

    @Override
    public void addCurrency(int amount) {

    }

    @Override
    public Products request(int productNumber) {
        return null;
    }

    @Override
    public int endSession() {
        return 0;
    }

    @Override
    public String getDescription(int productNumber) {
        return null;
    }

    @Override
    public int getBalance() {
        return 0;
    }

    @Override
    public String[] getProducts() {
        return new String[0];
    }
}
