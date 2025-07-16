package day4;

interface NavigationManager {
    void openPage(String url);
    void goBack();
    void goForward();
    void showCurrentPage();
}