package www.shaojie.xu;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringTddTrainingProjectApplication.class)
public class MathTest {
	
	@Mock
	Math mathObj;
	
	@Mock
	Math mathObj2;
	
	@Before
	public void init(){
		
		MockitoAnnotations.initMocks(this);
		Mockito.when(mathObj.add(1, 2)).thenReturn(3);
		Mockito.when(mathObj2.substract(3, 1)).thenReturn(2);
		
	}
	
	@Test
	public void whenAddUsedThenReturnValueIsTheirSum(){
		Assert.assertThat(3, Matchers.equalTo(mathObj.add(1, 2)));
	}
	
	@Test
	public void whenSubtractUsedThenReturnValueIsTheirMinus(){
		Assert.assertThat(2, Matchers.equalTo(mathObj2.substract(3, 1)));
	}
	

}
