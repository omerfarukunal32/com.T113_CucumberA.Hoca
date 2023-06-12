package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.QualitydemyPage;

public class QualityStepDefinitions {
    QualitydemyPage qualitydemyPage = new QualitydemyPage();

    @Then("Ilk login linkine clik yapar")
    public void ilk_login_linkine_clik_yapar() {
        qualitydemyPage.ilkLogInLinki.click();
    }
    @Then("User email olarak {string} girer")
    public void user_email_olarak_girer(String kullaniciEmail) {
        qualitydemyPage.emailKutusu.sendKeys(kullaniciEmail);
    }
    @Then("Password olarak {string} girer")
    public void password_olarak_girer(String kullaniciPassword) {
        qualitydemyPage.passwordKutusu.sendKeys(kullaniciPassword);
    }
    @When("login butonuna basar")
    public void login_butonuna_basar() {
        qualitydemyPage.ilkLogInLinki.click();
    }
    @Then("giris yapilmadigini test eder")
    public void giris_yapilmadigini_test_eder() {
        Assert.assertTrue(qualitydemyPage.emailKutusu.isEnabled());
    }
}
