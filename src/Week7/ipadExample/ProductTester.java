package Week7.ipadExample;

public class ProductTester {
    public static void main(String[] args) {
        Product iPad = new Product(new IPad(32, true));
        Product Pro11 = new Product(new IPadPro11(64, false));
        Product Pro12 = new Product(new IpadPro12(256, true));

        System.out.println(iPad + "\n");
        System.out.println(Pro11 + "\n");
        System.out.println(Pro12 + "\n");
    }
}
