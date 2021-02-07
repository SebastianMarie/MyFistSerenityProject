package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.AccountPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.LoginPage;
import org.fasttrackit.pages.SearchResultPage;
import org.openqa.selenium.By;

public class CartSummarySteps {

    private HomePage homePage;
    private LoginPage loginPage;
    private AccountPage accountPage;
    private SearchResultPage searchResultPage;

    @Step
    public void cartSummary() {
        searchResultPage.$(By.cssSelector("span [class='price']"));
    }

}
