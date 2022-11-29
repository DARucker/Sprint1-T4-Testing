package n2exercici1;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;
import org.junit.Test;

public class UsarHamcrest {

	
	@Test
	public void ControlarElLargoDeMordor() {
	    assertThat("Mordor", longitudString(is(8)));
	}
	
	public static  Matcher<String> longitudString(Matcher<? super Integer> matcher) {
	    return new FeatureMatcher<String, Integer>(matcher, "Una cadena de un largo de: ", "largo") {
	        @Override
	        protected Integer featureValueOf(String stringParaTestear) {
	          return stringParaTestear.length();
	        }
	    };
	}
	
	
	
	
	
	
}
