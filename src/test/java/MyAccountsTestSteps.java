import com.tutorialninja.pages.HomePage;
import com.tutorialninja.pages.MyAccountPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class MyAccountsTestSteps {

    @Given("I am on the homepage")
    public void iAmOnTheHomepage() {
        // Assuming we have a method to ensure user is on the homepage
        System.out.println("User is on the homepage.");
    }

    @When("I click on {string} link")
    public void iClickOnLoginLink() {
        // Assuming a method that clicks the link, e.g., "My Account"
        new HomePage().clickOnLoginLink();
    }

    @When("I select {string} from My Account options")
    public void iSelectOptionFromMyAccount(String option) {
        // Assuming selectMyAccountOptions handles navigation for Register, Login, etc.
        new MyAccountPage().selectMyAccountOptions(option);
    }

    @Then("I should see the text {string}")
    public void iShouldSeeTheText(String expectedText) {
        // Verifying the header text on the page after selecting an option (Register/Login)
        String actualText = new MyAccountPage().getHeaderText();
        Assert.assertEquals(actualText, expectedText, "Text does not match!");
    }

    @When("I enter first name {string}")
    public void iEnterFirstName(String firstName) {
        new MyAccountPage().enterFirstName(firstName);
    }

    @When("I enter last name {string}")
    public void iEnterLastName(String lastName) {
        new MyAccountPage().enterLastName(lastName);
    }

    @When("I enter email {string}")
    public void iEnterEmail(String email) {
        new MyAccountPage().enterEmail(email);
    }

    @When("I enter telephone {string}")
    public void iEnterTelephone(String telephone) {
        new MyAccountPage().enterTelephone(telephone);
    }

    @When("I enter password {string}")
    public void iEnterPassword(String password) {
        new MyAccountPage().enterPassword(password);
    }

    @When("I enter password confirm {string}")
    public void iEnterPasswordConfirm(String passwordConfirm) {
        new MyAccountPage().enterPasswordConfirm(passwordConfirm);
    }

//    @When("I select {string} for Subscribe radio button")
//    public void iSelectSubscribeOption(String subscribeOption) {
//        new MyAccountPage().selectSubscribeOption(subscribeOption);
//    }

//    @When("I click on the Privacy Policy checkbox")
//    public void iClickOnPrivacyPolicyCheckbox() {
//        new MyAccountPage().clickOnPrivacyPolicyCheckbox();
//    }

//    @When("I click on the {string} button")
//    public void iClickOnButton(String buttonName) {
//        if (buttonName.equalsIgnoreCase("Continue")) {
//            new MyAccountPage().clickOnContinueButton();
//        } else if (buttonName.equalsIgnoreCase("Login")) {
//            new MyAccountPage().clickOnLoginButton();
//        }
//    }

//    @Then("I should see the message {string}")
//    public void iShouldSeeTheMessage(String expectedMessage) {
//        String actualMessage = new MyAccountPage().getSuccessMessage();
//        Assert.assertEquals(actualMessage, expectedMessage, "Success message mismatch!");
//    }

    @When("I click on {string} link")
    public void iClickOnAccountLink() {
        // Clicking on "My Account" link again to navigate to logout or login
        new HomePage().clickOnRegisterLink();
    }

    @When("I select {string} from My Account options")
    public void iSelectMyAccountOptions(String option) {
        new MyAccountPage().selectMyAccountOptions(option);
    }

    @Then("I should see the text {string}")
    public void iShouldSeeTextAfterLogout(String expectedText) {
        String actualText = new MyAccountPage().getHeaderText();
        Assert.assertEquals(actualText, expectedText, "Account Logout message mismatch");
    }

//    @When("I click on {string} button")
//    public void iClickOnButtonForLogout(String button) {
//        if (button.equals("Continue")) {
//            new MyAccountPage().clickOnContinueButton();
//        }
//    }
}
