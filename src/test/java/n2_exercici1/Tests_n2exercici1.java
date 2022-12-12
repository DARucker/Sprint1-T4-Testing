package n2_exercici1;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;
import org.junit.Test;

import n2exercici1.TestConHamcrest;

public class Tests_n2exercici1 {

	TestConHamcrest tch = new TestConHamcrest();

	@Test
	public void ControlarElLargoDelString() {
		assertThat(tch.retornaString(), longitudString(is(8)));
	}
	
	@Test
	public void ControlarElLargoDelString2() {
		assertThat(tch.retornaStringComparacion(), longitudString(is(8)));
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
