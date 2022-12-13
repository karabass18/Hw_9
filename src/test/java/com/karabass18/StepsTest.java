package com.karabass18;

import org.junit.jupiter.api.Test;

public class StepsTest {

    private static final String REPONAME = "karabass18/Hw_8";

    @Test
    public void stepTestWithAnnotations () {
        StepsForStepsTests mySteps = new StepsForStepsTests();
        mySteps.openGithub();
        mySteps.lookingForRepo(REPONAME);
        mySteps.openRepo(REPONAME);
        mySteps.openIssueTab();
        mySteps.shouldSeeIssue("IssueForHw9");
    }
}
