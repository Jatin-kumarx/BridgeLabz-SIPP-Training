package day4;

class DesktopBrowser implements NavigationManager {
    TabNavigator navigator = new TabNavigator();

    public void openPage(String url) {
        navigator.open(url);
        System.out.println("Desktop opened: " + navigator.getCurrentPage());
    }

    public void goBack() {
        navigator.back();
        System.out.println("Desktop back to: " + navigator.getCurrentPage());
    }

    public void goForward() {
        navigator.forward();
        System.out.println("Desktop forward to: " + navigator.getCurrentPage());
    }

    public void showCurrentPage() {
        System.out.println("Desktop current page: " + navigator.getCurrentPage());
    }
}