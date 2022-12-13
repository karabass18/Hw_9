package com.karabass18;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;

public class NormalTest {
    @Test
    @DisplayName("Поиск Issue в GitHub")
    public void lookingForIssue() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        open("https://github.com");
        $(".header-search-input").click();
        $(".header-search-input").sendKeys("karabass18/Hw_8");
        $(".header-search-input").pressEnter();
        $(byText("karabass18")).click();
        $("#issues-tab").click();
        $(byText("IssueForHw9")).shouldBe(exist);

    }
}
