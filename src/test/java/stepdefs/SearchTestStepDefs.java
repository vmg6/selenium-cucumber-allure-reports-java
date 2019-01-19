package stepdefs;

import com.qa.tlv.pageObjects.SearchPageObject;

import cucumber.api.java.en.And;

public class SearchTestStepDefs {
    
    SearchPageObject search = new SearchPageObject();

    @And("^my search is displayed$")
    public void verifySearchDisplayed() throws Throwable {
        search.verifySearchDisplayed();
    }

    @And("^user enters the search text$")
    public void enterSearchText() throws Throwable {
        search.enterSearchText();
    }
}
