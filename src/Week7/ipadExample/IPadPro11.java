package Week7.ipadExample;

public class IPadPro11 implements ProductInterface {
    private int memorySize;
    private boolean cellular;

    public IPadPro11(int memorySize, boolean cellular) {
        this.memorySize = memorySize;
        this.cellular = cellular;
    }

    public double computePrice() {
        if (cellular) return ((11 * memorySize) + 150);
        else return (11 * memorySize);
    }

    public String toString() {
        return "Ipad Pro 11 has " + memorySize + " gb, " + cellular;
    }
}

