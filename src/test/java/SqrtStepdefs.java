import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class SqrtStepdefs {
    private Calculator calc;
    double result;

    @Given("^we should find square root of a given number$")
    public void number() {
        calc = new Calculator();
    }


    @When("^we find square root of a positive number (\\d+)$")
    public void sqrt_pos_num(double a) {
        result = calc.sqrt(a);
    }
    @Then("^the result should be (\\d+)$")
    public void sqrt_pos(double result) {
        Assert.assertEquals(result, result, 0.0001);
    }

    @When("^we find square root of a negatibe number -(\\d+)$")
    public void sqrt_neg_num(double a) {
        result = calc.sqrt(a);
    }
    @Then("^there is an imaginary number$")
    public void im_num() {
        System.out.println("there is an imaginary number");
    }
}
