package day4;

class MobileBrowser implements NavigationManager {
    TabNavigator navigator = new TabNavigator();

    public void openPage(String url) {
        navigator.open(url);
        System.out.println("Mobile opened: " + navigator.getCurrentPage());
    }

    public void goBack() {
        navigator.back();
        System.out.println("Mobile back to: " + navigator.getCurrentPage());
    }

    public void goForward() {
        navigator.forward();
        System.out.println("Mobile forward to: " + navigator.getCurrentPage());
    }

    public void showCurrentPage() {
        System.out.println("Mobile current page: " + navigator.getCurrentPage());
    }
}