import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.*;


public class stepDefinitionsReverse {
    String toReverse="hej";
    String reversed;
    @Given("i have {string}")
    public void i_have(String string) {
        // Write code here that turns the phrase above into concrete actions
        try{
            if(string != null) {
                toReverse = string;
            }
        }catch (Exception e){
            System.out.println(e);
        }
        assertTrue(string instanceof String);
    }

    @When("I reverse the String")
    public void i_reverse_the_string() {
        reversed=StringUtillities.reverseText(toReverse);
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("I should get {string}")
    public void i_should_get(String string) {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(reversed,"jeh");
    }

}
