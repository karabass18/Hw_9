package com.karabass18;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class LambdaTest {
    private static final String REPONAME = "karabass18/Hw_8";

    @Test
    @DisplayName("Тест с Лябда шагами")
    public void lambdaStepsTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        step("Открываем Github", () -> {
            open("https://github.com");
        });
        step("Ищем репозиторий" + REPONAME, () -> {
            $(".header-search-input").click();
            $(".header-search-input").sendKeys(REPONAME);
            $(".header-search-input").pressEnter();
        });
        step("Кликаем по первой ссылке", () -> {
            $(byText("karabass18")).click();
        });
        step("Открывем вкладку Issues", () -> {
            $("#issues-tab").click();
        });
        step("Проверяем наличие IssueForHw9", () -> {
            $(byText("IssueForHw9")).shouldBe(exist);
        });

    }

}
