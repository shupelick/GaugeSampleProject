import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.assertEquals;


public class VerifySearchButtonImplementation {

    @Step("Navigate to <https://www.google.co.in>")
    public void navigateTo(String url) {
        Driver.driver.get(url);
    }

    @Step("Verify search button")
    public void verifySearchButton() {
        WebElement searchButton = Driver.driver.findElement(By.name("btnK"));
        searchButton.isDisplayed();
    }

    @Step("Enter query <playtika> in the search box and submit")
    public void enterQuery(String query) {
        WebElement searchBox = Driver.driver.findElement(By.name("q"));
        searchBox.sendKeys(query);
        searchBox.submit();
    }
}
