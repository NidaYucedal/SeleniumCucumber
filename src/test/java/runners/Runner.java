package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target/cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml" },
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags = "@gp5", // iki tag'ı aynı anda çalıştırmak isterseniz "@gp1 or @gp2"
        dryRun = false
)

public class Runner {

    //Runner Class'ı TestNG'deki XMl mantığı ile çalışır. Çalıştırmak istediğimiz senartolara tag belirtiriz
    //ve belirttiğimiz tag'ları çalıştırır. XMl deki gibi istediğimiz testleri çalıştırmak için kullanırız.
    //Runner class body'si boştur ve runner class'ını ekleyeceğimiz notasyonlar aktive eder.

    //Bir framework'de bir tek Runner class'i yeterli olabilir
    //Runner class'inda class body'sinde hic bir sey olmaz
    //Runner class'imizi onemli yapan 2 adet annotaion vardir
    //@RunWith(Cucumber.class) notasyonu Runner class'ina calisma ozelligi katar
    //Bu notasyon oldugu icin Cucumber framework'umuzde JUnit kullanmayi tercih ediyoruz
    //features : Runner dosyasinin feature dosyalarini nereden bulacagini gosterir
    //glue : step definitions dosyalarini nerede bulacagini gosterir
    //tags : hangi tag'i calistirmak istiyorsak onu yazarız
    //dryRun=true yaptigimizda testimizi calistirmadan sadece eksik adimlari bize verir
    //dryRun=false yaptigimizda testlerimizi calistirir

}