package sindre;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import sindre.Product.Candy;
import sindre.VendingMachine.ImplementVM;
import sindre.VendingMachine.VendingMachine;

public class TestVM {

    private VendingMachine machine = new ImplementVM();

    @Test
    public void test_add_currency(){
        int expected = 505;
        machine.addCurrency(5);
        machine.addCurrency(11);
        machine.addCurrency(500);
        machine.addCurrency(900);

        Assert.assertEquals(expected, machine.getBalance());
    }

    @Test
    public void test_request(){
        Assert.assertNotNull(machine.request(43));
        Assert.assertNull(machine.request(57));
    }

    @Test
    public void test_endSession()
    {
        machine.addCurrency(500);
        Assert.assertEquals(machine.getBalance(), 500);
        machine.endSession();
        Assert.assertEquals(machine.getBalance(), 0);
    }

    @Test
    public void test_getProducts(){
        Assert.assertEquals(5, machine.getProducts().length);
    }

    @Test
    public void test_consume(){
        Assert.assertEquals(machine.request(43).useProduct(), "ate");
        Assert.assertEquals(machine.request(44).useProduct(), "drunk");
        Assert.assertEquals(machine.request(45).useProduct(), "ate");
        Assert.assertEquals(machine.request(46).useProduct(), "ate");
    }


    @Test
    public void test_product_getDescription(){
        Assert.assertEquals(machine.getDescription(43),"helt vanlig twix" );
    }



}
