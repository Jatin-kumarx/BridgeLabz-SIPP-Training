public class IceCream {
    private String flavor;
    private int sales;

    public IceCream(String flavor, int sales) {
        this.flavor = flavor;
        this.sales = sales;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }
}
