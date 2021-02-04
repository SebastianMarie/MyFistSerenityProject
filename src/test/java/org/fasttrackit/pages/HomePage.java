package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://testfasttrackit.info/selenium-test/")
public class HomePage extends PageObject {
    @FindBy(css = ".skip-account .label")
    private WebElementFacade accountLink;
    @FindBy(css = "a[title*='Log']")
    private WebElementFacade loginLink;
    @FindBy(css = "#search")
    private WebElementFacade searchField;
    @FindBy(css = ".search-button")
    private WebElementFacade searchIcon;

    public void clickAccountLink(){ clickOn(accountLink); }
    public void clickLoginLink(){ clickOn(loginLink); }
    public void setSearchField(String text){typeInto(searchField,text);}
    public void clickSearchIcon(){clickOn(searchIcon);}


}
