package Week7.ipadExample;

public class IpadPro12 implements ProductInterface {
    private int memorySize;
    private boolean cellular;

    public IpadPro12(int memorySize, boolean cellular) {
        this.memorySize = memorySize;
        this.cellular = cellular;
    }

    public double computePrice() {
        if (cellular) return ((12 * memorySize) + 160);
        else return (12 * memorySize);
    }

    public String toString() {
        return "Ipad Pro 12 has " + memorySize + " gb, " + cellular;
    }
}
