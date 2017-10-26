import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MulStepdefs {
    private Calculator calc;
    double result;

    @Given("^two numbers we should multiplicate$")
    public void two_numbers() {
        calc = new Calculator();
    }


    @When("^we multiplicate two positive numbers (\\d+) and (\\d+)$")
    public void multiply_pos_nums(double a, double b) {
        result = calc.multiply(a, b);
    }
    @Then("^the result of multiplication of two positive numbers should be (\\d+)$")
    public void multilpy_pos(double result) {
        Assert.assertEquals(result, result, 0.0001);
    }

    @When("^we multiplicate positive and negative numbers (\\d+) and -(\\d+)$")
    public void multilpy_pos_neg_nums(double a, double b) {
        result = calc.multiply(a, b);
    }
    @Then("^the result of multiplication of positive and negative numbers should be -(\\d+)$")
    public void multiply_pos_neg(double result) {
        Assert.assertEquals(result, result, 0.0001);
    }

    @When("^we multiplicate two negative numbers -(\\d+) and -(\\d+)$")
    public void multiply_neg_nums(double a, double b) {
        result = calc.multiply(a, b);
    }
    @Then("^the result of multiplication of two negative numbers should be (\\d+)$")
    public void multiply_neg(double result) {
        Assert.assertEquals(result, result, 0.0001);
    }
}
