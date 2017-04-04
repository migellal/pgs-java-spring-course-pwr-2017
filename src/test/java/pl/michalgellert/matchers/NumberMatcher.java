package pl.michalgellert.matchers;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeDiagnosingMatcher;

/**
 * Created by micha on 28.03.2017.
 */
public class NumberMatcher {

    public static TypeSafeDiagnosingMatcher isEven() {
        return new TypeSafeDiagnosingMatcher<Long>() {
            @Override
            protected boolean matchesSafely(Long item, Description mismatchDescription) {
                return false;
            }

            @Override
            public void describeTo(Description description) {

            }
        };
    }

}
