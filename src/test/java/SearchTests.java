import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchTests {//Заголовок нашего скрипта /*не рекомендуется больше 50 тестов*/

    private static String msg = "Mail";
    static {
        Configuration.pageLoadStrategy = "eager";
    }

    private static String getMessage(){
        return "QA_guru";
    }
    @Test
    void successfulSearchTest(){    //Успешный поиск в браузере Google Chrome
        //Configuration.holdBrowserOpen = true; //не дает закрыть тесту браузер

        open("https://www.google.com/");    /*Открывает гугл*/
        $("[name=q]").setValue("msg").pressEnter();    /*Вводит в поисковую строку selenide*/
        $("[id=search]").shouldHave(text("https://ru.selenide.org")); /*Проверяет, что selenide появился в рез-тах поиска [id=search] или html*/
    }
}
