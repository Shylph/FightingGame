import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by window8 on 2015-04-24.
 */
public class SimpleTest {
    @Test
    public void addTest(){
        assertThat(2+3,is(5));
        assertThat("a"+"b",is("ab"));
    }
}
