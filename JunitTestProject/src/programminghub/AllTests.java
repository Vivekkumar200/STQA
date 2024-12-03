package programminghub;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ AddTest.class, SubTest.class })
public class AllTests {

}
