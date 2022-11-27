package n2exercici1;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;
import org.junit.Test;

public class UsarHamcrest {

	
	@Test
	public void ControlarElLargoDeMordor() {
	    assertThat("Mordor", length(is(8)));
	}
	public static  Matcher<String> length(Matcher<? super Integer> matcher) {
	    return new FeatureMatcher<String, Integer>(matcher, "Una cadena de un largo de: ", "largo") {
	        @Override
	        protected Integer featureValueOf(String actual) {
	          return actual.length();
	        }
	    };
	}
	
	
	
	
	
	
}
