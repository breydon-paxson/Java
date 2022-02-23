package Week7.ipadExample;

public class IPad implements ProductInterface {
    private int memorySize;
    private boolean cellular;

    public IPad(int memorySize, boolean cellular) {
        this.memorySize = memorySize;
        this.cellular = cellular;
    }

    public double computePrice() {
        if (cellular) return ((10 * memorySize) + 140);
        else return (10 * memorySize);
    }

    public String toString() {
        return "Ipad has " + memorySize + " gb, " + cellular;
    }
}

