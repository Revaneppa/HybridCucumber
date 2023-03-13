package step.definitions;

import com.baseclasses.baseuse;
import com.baseclasses.modules.loginpage;
import com.baseclasses.utilites.dataexcelfile;
import com.baseclasses.utilites.propertiesutils;
import com.google.gson.JsonArray;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.simple.JSONArray;
import org.junit.Assert;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.PropertyPermission;

public class LoginStepDef extends baseuse {
    Properties pro= propertiesutils.loadalltheproperties();
    Response response;
    HashMap<String,String[]> values =new HashMap<String,String[]>();
    @Given("Navigate to the login page")
    public void navigateToTheLoginPage() throws InterruptedException, IOException {
        String endpoint=pro.getProperty("endpoint").toString();
        RestAssured.baseURI=endpoint;

  // String username=pro.getProperty("env.username").toString();
    // loginpage.setusername(username);
//assertEquals(true,false);
        JSONArray values= dataexcelfile.mapdatafromexcel();
        System.out.println(values);
    }

    @When("user enter the username and password")
    public void userEnterTheUsernameAndPassword() throws InterruptedException {
        response=RestAssured.get("/actuator/health");
      //  String password=pro.getProperty("env.password").toString();
     //loginpage.setPassword(password);
    }

    @Given("user click on submit for {string}")
    public void userClickOnSubmitFor(String test) throws InterruptedException {
        System.out.println(response.statusCode());
       // loginpage.setLoginbutton();
        Thread.sleep(5999);
    }

    @Then("logged in user should match with this name {string}")
    public void loggedInUserShouldMatchWithThisName(String test) {
    }

    @And("user logins in to application with {string}")
    public void userLoginsInToApplicationWith(String test) {
    }
}
