import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.jupiter.api.Assertions.*;

public class capitalizeDefinitions {
    String before;
    String after;

    @Given("I possess {string}")
    public void i_possess(String string) {
        try{
            if(string != null) {
                before = string;
            }
        }catch (Exception e){
            System.out.println(e);
        }
        assertTrue(string instanceof String);
    }
    @When("I captilize this String")
    public void i_captilize_this_string() {
        after=StringUtillities.capitilize(before);
    }
    @Then("I should retrieve {string}")
    public void i_should_retrieve(String string) {
        assertEquals(after,string);
    }
}
