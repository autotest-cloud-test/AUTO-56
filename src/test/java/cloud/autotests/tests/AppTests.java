package cloud.autotests.tests;

import io.qameta.allure.Description;
import org.junit.jupiter.api.*;

import static cloud.autotests.helpers.DriverHelper.getConsoleLogs;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class AppTests extends TestBase {
    @Test
    @Description("Soon to be implemented by QA.GURU engineers")
    @DisplayName("Ну может кто-то сможет")
    void generatedTest() {
        step("open https://pixelscan.net/", () -> {
            // todo
        });

        step("Добиться надписи Your browser fingerprints are Good consistent используюя хромдрайвер", () -> {
            // todo
        });
    }

    @Test
    @Description("Autogenerated, because test steps contain text 'http...' and the page has 'title' tag")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url 'https://pixelscan.net/'", () ->
            open("https://pixelscan.net/"));

        step("Page title should have text 'Pixelscan'", () -> {
            String expectedTitle = "Pixelscan";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Autogenerated, because test steps contain text 'http...'")
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://pixelscan.net/'", () ->
            open("https://pixelscan.net/"));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}