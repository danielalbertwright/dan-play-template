import com.gargoylesoftware.htmlunit.BrowserVersion
import org.openqa.selenium.htmlunit.HtmlUnitDriver
import org.specs2.mutable._
import play.api.Logger
import play.api.test._

class IntegrationSpec extends Specification {

  def hostPath(port: Int): String = {
    s"http://localhost:$port"
  }

  "Index page" should {
    "display the correct title" in new WithBrowser(webDriver = new HtmlUnitDriver(BrowserVersion.CHROME)) {
      browser.goTo(hostPath(port))
      browser.find("#title").getText must_== "Template page"
    }
  }
}
