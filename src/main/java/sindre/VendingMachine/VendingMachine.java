package sindre.VendingMachine;
import sindre.Product.Products;

public interface VendingMachine {

    void addCurrency (int amount);

    Products request (int productNumber);

    int endSession ();

    String getDescription (int productNumber);

    int getBalance();

    String[] getProducts ();
}
