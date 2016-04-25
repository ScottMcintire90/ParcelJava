import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
    return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
    goTo("http://localhost:4567/");
    assertThat(pageSource()).contains("Shipping Cost");
  }
  @Test
  public void squareTestIsASquare() {
    goTo("http://localhost:4567/");
    fill("#length").with("2");
    fill("#width").with("3");
    fill("#height").with("4");
    fill("#distance").with("100");
    fill("#weight").with("10");
    submit(".btn");
    assertThat(pageSource()).contains("Your shipping cost is");
  }
  
}
