package org.thoughtworks.lean.identity;

import com.thoughtworks.gauge.BeforeStep;
import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import org.junit.Ignore;

import static org.junit.Assert.assertEquals;

public class UserSpecTest {

    @Step("Sample Step")
    public void assureThereIsNOTestUser() throws InterruptedException {
        Thread.sleep(50);
    }

    @Step("Complex Step")
    public void takeSomeTime() throws InterruptedException {
        Thread.sleep(1000);
    }

    @Step("Failed Step")
    public void fallStep(){
        assertEquals(2,2);
    }

}
