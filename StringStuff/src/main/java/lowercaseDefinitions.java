import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.*;

public class lowercaseDefinitions {
    String toLowercase="";
    String lowercased;

    @Given("i get the string {string}")
    public void i_get_the_string(String string) {
        // Write code here that turns the phrase above into concrete actions
        try{
            if(string != null) {
                toLowercase = string;
            }
        }catch (Exception e){
            System.out.println(e);
        }
        assertTrue(string instanceof String);
    }
    @When("I lowercase the String")
    public void i_lowercase_the_string() {
        lowercased=StringUtillities.lowercase(toLowercase);
    }
    @Then("at last I should get {string}")
    public void at_last_i_should_get(String string) {
        assertEquals(string,lowercased);
    }
}
