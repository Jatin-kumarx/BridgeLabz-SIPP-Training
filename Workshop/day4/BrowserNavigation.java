package day4;

public class BrowserNavigation {
    public static void main(String[] args) {
        NavigationManager desktop = new DesktopBrowser();
        NavigationManager mobile = new MobileBrowser();

        desktop.openPage("google.com");
        desktop.openPage("github.com");
        desktop.openPage("stackoverflow.com");
        desktop.goBack();
        desktop.goForward();
        desktop.showCurrentPage();

        System.out.println();

        mobile.openPage("facebook.com");
        mobile.openPage("twitter.com");
        mobile.goBack();
        mobile.showCurrentPage();
    }
}