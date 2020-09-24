package structural.facade;

public class FacadePatternClient {

    public static void main(String args[]) {

        ShopKeeper sk = new ShopKeeper();
        sk.iphoneSale();
        sk.samsungSale();
        sk.blackberrySale();
    }
}  