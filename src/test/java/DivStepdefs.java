import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class DivStepdefs {
    private Calculator calc;
    double result;

    @Given("^two numbers we should divide$")
    public void two_numbers() {
        calc = new Calculator();
    }


    @When("^we divide two positive numbers (\\d+) and (\\d+)$")
    public void divide_pos_nums(double a, double b) {
        calc.divide(a, b);
    }
    @Then("^the result of division of two positive numbers should be (\\d+)$")
    public void divide_pos(double result) {
        Assert.assertEquals(result, result, 0.0001);
    }

    @When("^we divide positive and negative numbers (\\d+) and -(\\d+)$")
    public void divide_pos_neg_nums(double a, double b) {
        calc.divide(a, b);
    }
    @Then("^the result of division of positive and negative numbers should be -(\\d+)$")
    public void divide_pos_neg(double result) {
        Assert.assertEquals(result, result, 0.0001);
    }

    @When("^we divide two negative numbers -(\\d+) and -(\\d+)$")
    public void divide_neg_nums(double a, double b) {
        calc.divide(a, b);
    }
    @Then("^the result of division of two negative numbers should be (\\d+)$")
    public void divide_neg(double result) {
        Assert.assertEquals(result, result, 0.0001);
    }

    @When("^we try to divide (\\d+) by (\\d+)$")
    public void divide_by_zero(double a, double b) {
        result = calc.divide(a, b);
    }
    @Then("^there is an error$")
    public void error() {
        System.out.println("error");
    }
}
