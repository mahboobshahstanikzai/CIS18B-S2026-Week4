package edu.norcocollege.cis18b.weekx.mini10;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
        AlertValidatorTest.class,
        AlertServiceTest.class
})
public class AllTests {
}