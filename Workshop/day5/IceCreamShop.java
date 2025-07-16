import java.util.*;

public class IceCreamShop {
    private IceCream[] flavors;

    public void inputFlavors() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of flavors: ");
        int n = sc.nextInt(); sc.nextLine();
        flavors = new IceCream[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Flavor name: ");
            String name = sc.nextLine();
            System.out.print("Sales: ");
            int sales = sc.nextInt(); sc.nextLine();
            flavors[i] = new IceCream(name, sales);
        }
    }

    public void sortBySales() {
        for (int i = 0; i < flavors.length - 1; i++) {
            for (int j = 0; j < flavors.length - i - 1; j++) {
                if (flavors[j].getSales() < flavors[j + 1].getSales()) {
                    IceCream temp = flavors[j];
                    flavors[j] = flavors[j + 1];
                    flavors[j + 1] = temp;
                }
            }
        }
    }

    public void display() {
        System.out.println("\nSorted Flavors:");
        for (IceCream ic : flavors) {
            System.out.println(ic.getFlavor() + " - Sold: " + ic.getSales());
        }
    }
}
