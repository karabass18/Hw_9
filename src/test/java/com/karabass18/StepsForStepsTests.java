package com.karabass18;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class StepsForStepsTests {

    @Step("Открываем Github")
    public void openGithub() {
        open("https://github.com");
    }

    @Step("Ищем репозиторий {repo}")
    public void lookingForRepo(String repo) {
        $(".header-search-input").click();
        $(".header-search-input").sendKeys(repo);
        $(".header-search-input").pressEnter();
    }

    @Step("Кликаем по первой ссылке")
    public void openRepo(String repo) {
        $(By.linkText(repo)).click();
    }

    @Step("Открывем вкладку Issues")
    public void openIssueTab() {
        $("#issues-tab").click();

    }

    @Step("Проверяем наличие {testIssue}")
    public void shouldSeeIssue(String testIssue) {
        $(byText(testIssue)).shouldBe(exist);
    }

}
