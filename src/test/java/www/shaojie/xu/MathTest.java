package www.shaojie.xu;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.eq;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import www.shaojie.xu.config.DefaultTestConfig;

@DefaultTestConfig
public class MathTest {
	
	@Mock
	Math mathObj;
		
	@Before
	public void init(){
		MockitoAnnotations.initMocks(this);
		Mockito.when(mathObj.add(1, 2)).thenReturn(3);
		Mockito.when(mathObj.substract(3, 1)).thenReturn(2);
		Mockito.when(mathObj.multiply(anyInt(), eq(0))).thenReturn(0);
		Mockito.when(mathObj.divide(anyInt(),eq(0))).thenThrow(new ArithmeticException());
	}
	
	@Test
	public void whenAddUsedThenReturnValueIsTheirSum(){
		Assert.assertThat(mathObj.add(1, 2), Matchers.equalTo(3));
		Mockito.verify(mathObj).add(1, 2);
		Mockito.verify(mathObj, Mockito.times(1)).add(eq(1),eq(2));
	}
	
	@Test
	public void whenSubtractUsedThenReturnValueIsTheirMinus(){
		Assert.assertThat(mathObj.substract(3, 1), Matchers.equalTo(2));
	}
	
	@Test(expected = ArithmeticException.class)
	public void whenDividedByZeroThenThrowRuntimeException(){
		mathObj.divide(2, 0);
	}
	
	@Test
	public void whenMultiplyByZeroThenReturnValueIsZero(){
		Assert.assertThat(mathObj.multiply(2, 0), Matchers.equalTo(0));
	}

	

}
