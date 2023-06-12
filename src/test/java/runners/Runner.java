package runners;

import io.cucumber.java.en.And;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"
        },
        features = "src/test/resources/features", // virgulu unutma, sonda yok
        glue = "stepdefinitions",
        tags = "@ss",
        //tags = "@smoke and @regression",  // bu ifadeyi ilgili yerlere yazdik
                                          // "@smoke or  @regression"
        dryRun = false
        //dryRun = true
)

public class Runner {
    /*
        Cucumber'da Runner Class'i istedigimiz testleri calistirmak
        ve her calistirilan test icin rapor hairlamak amaciyla kullanilir

        Runner Class bos bir Class'dir

        Belirtilen bu isleri
        class icerisindeki kodlar degil
        Class deklarasyonunda kullanacagimiz Notasyonlar halleder

        @RunWith  notasyonu framwork'umuze JUnit yuklemememizin sebebidir
                  ve Runner Class'inin Cucumber ile calismasini saglar

        @CucumberOptions   ise framwork''umuze gerekli ayarlari yapar

        features :  feature dosyalarimizin bulundugu konumu gosterir
                    dikkat edilirse tek tek feature dosyalarini degil
                    tum feature dosyalarini iceren klasorun yolunu yaziyoruz
        glue     :  feature dosyalari ile bagli olan
                    Java method'larinin yerini gosterir
                    Burada da tek tek class'lari degil,
                    tum class'lari iceren package'in adresini yazariz
                    boylece ilgili step hangi Class altinda olursa olsun
                    cucumber bulup calistirir
        tags     :  calistirilacak Feature veya Scenario(lari) isaretlemek icin kullanilir
                    Cucumber Runner class'i calistirildiginda
                    tum Feature dosyalarini goyden gecirir ve
                    Runner class'inda belirtilen tag'a sahip
                    Tum Feature ve Scenario(lari) calistirir

                    Eger birden fayla tag'i kontrol ederek calistirmasini istersek
                    "@smoke or  @regression"  veya  "@smoke and  @regression" gibi yazabiliriz

        dryRun   :  Bir deature dosyasini ilk defa yazdigimizda
                    step'lerden bazilari daha once var oldugundan Bayaz
                    bazilari ise ilk defa kullanacagimiz icin Sari olur

                    Bu Feature dosyasini direk calistirmak istersek
                    Bastan baslayarak Beyaz olan adimlari calistirir
                    Ilk sari adima geldiginde, exeption firlatip
                    calistirmayi denedigi ilk sari satir
                    ve geriye jakan sari satirlarin
                    eksik steplerini bize yazdirir

                    Amacimiz Feature dosyasini calistirmak degil,
                    sadece eksik step'lere ait kodlari olusturmak ise
                    Runner Class'da dryRun = true yapip
                    Runner Class'i calistiririz

                    dryRun = true    dendiginde
                    Cucumber testleri calistirmaz, sadece eksik adim var mi diye kontrol eder
                    eksik adim yoksa Test PASSED yazar

                    dryRun = false
                    default degerdir ve Testleri normal olarak calistirmamizi saglar


     */
    
}
