import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchTests {//Заголовок нашего скрипта /*не рекомендуется больше 50 тестов*/

    static {
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    void successfulSearchTest(){    //Успешный поиск в браузере Google Chrome
        //Configuration.holdBrowserOpen = true; //не дает закрыть тесту браузер

        open("https://www.google.com/");    /*Открывает гугл*/
        $("[name=q]").setValue("selenide").pressEnter();    /*Вводит в поисковую строку selenide*/
        $("html").shouldHave(text("https://ru.selenide.org")); /*Проверяет, что selenide появился в рез-тах поиска [id=search] или html*/
    }
}
