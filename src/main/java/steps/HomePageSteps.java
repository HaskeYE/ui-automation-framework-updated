package steps;

import htmlelements.MyPageFactory;
import htmlelements.MyPageFactoryProvider;
import htmlelements.pages.HomePage;

import static io.qameta.htmlelements.matcher.DisplayedMatcher.displayed;

public class HomePageSteps {
    private static MyPageFactory pageFactory = MyPageFactoryProvider.getInstance();

    private HomePage homePage() {
        return pageFactory.on(HomePage.class);
    }

    public PrivacyModalSteps acceptPrivacyModal() {
        homePage().privacySettingsModal().waitUntil(displayed()).click();
        return new PrivacyModalSteps();
    }

    public SearchSteps clickSearchButton() {
        homePage().searchButton().waitUntil(displayed()).click();
        return new SearchSteps();
    }

    public LoginSteps clickLoginButton() {
        homePage().accountIcon().waitUntil(displayed()).click();
        return new LoginSteps();
    }
}
