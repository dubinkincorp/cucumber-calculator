import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class SubStepdefs {
    private Calculator calc;
    double result;

    @Given("^two numbers we should subtract$")
    public void two_numbers() {
        calc = new Calculator();
    }


    @When("^we subtract two positive numbers (\\d+) and (\\d+)$")
    public void subtract_pos_nums(double a, double b) {
        result = calc.subtract(a, b);
    }
    @Then("^the result of subtraction of two positive numbers should be (\\d+)$")
    public void subtract_pos(double result) {
        Assert.assertEquals(result, result, 0.0001);
    }

    @When("^we subtract positive and negative numbers (\\d+) and -(\\d+)$")
    public void subtract_pos_neg_nums(double a, double b) {
        result = calc.subtract(a, b);
    }
    @Then("^the result of subtraction of positive and negative numbers should be (\\d+)$")
    public void subtract_pos_neg(double result) {
        Assert.assertEquals(result, result, 0.0001);
    }

    @When("^we subtract two negative numbers -(\\d+) and -(\\d+)$")
    public void subtract_neg_nums(double a, double b) {
        result = calc.subtract(a, b);
    }
    @Then("^the result of subtraction of two negative numbers should be (\\d+)$")
    public void subtract_neg(double result) {
        Assert.assertEquals(result, result, 0.0001);
    }
}
