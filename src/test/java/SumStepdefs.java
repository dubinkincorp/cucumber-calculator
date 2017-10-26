import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class SumStepdefs {
    private Calculator calc;
    double result;

    @Given("^two numbers we should sum$")
    public void two_numbers() {
        calc = new Calculator();
    }

    @When("^try to sum positive numbers (\\d+) and (\\d+)$")
    public void sum_pos_nums(double a, double b) {
        result = calc.sum(a, b);
    }
    @Then("^the sum of two positive numbers should be (\\d+)$")
    public void sum_pos(double result) {
        Assert.assertEquals(result, result, 0.0001);
    }

    @When("^try to sum positive and negative numbers (\\d+) and -(\\d+)$")
    public void sum_pos_neg_nums(double a, double b) {
        result = calc.sum(a, b);
    }
    @Then("^the sum of positive and negative numbers should be -(\\d+)$")
    public void sum_pos_neg(double result) {
        Assert.assertEquals(result, result, 0.0001);
    }

    @When("^try to sum negative numbers -(\\d+) and -(\\d+)$")
    public void sum_neg_nums(double a, double b) {
        result = calc.sum(a, b);
    }
    @Then("^the sum of two negative numbers should be -(\\d+)$")
    public void sum_neg(double result) {
        Assert.assertEquals(result, result, 0.0001);
    }
}
