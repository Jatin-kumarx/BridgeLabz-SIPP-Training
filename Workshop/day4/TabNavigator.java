package day4;

import java.util.*;

class TabNavigator {
    private Stack<String> backStack = new Stack<>();
    private Stack<String> forwardStack = new Stack<>();
    private String currentPage = null;

    public void open(String url) {
        if (currentPage != null) {
            backStack.push(currentPage);
        }
        currentPage = url;
        forwardStack.clear();
    }

    public void back() {
        if (!backStack.isEmpty()) {
            forwardStack.push(currentPage);
            currentPage = backStack.pop();
        } else {
            System.out.println("No pages to go back.");
        }
    }

    public void forward() {
        if (!forwardStack.isEmpty()) {
            backStack.push(currentPage);
            currentPage = forwardStack.pop();
        } else {
            System.out.println("No pages to go forward.");
        }
    }

    public String getCurrentPage() {
        return currentPage != null ? currentPage : "No page open";
    }
}