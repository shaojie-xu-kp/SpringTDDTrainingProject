package www.shaojie.xu;

import static org.mockito.Matchers.anyInt;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;

import www.shaojie.xu.config.DefaultTestConfig;


@DefaultTestConfig
public class RectangleTest {
	
	@Mock
	Math mathObj;

	@InjectMocks
	@Autowired
	Rectangle rec;
	
	
	@Before
	public void init(){
		MockitoAnnotations.initMocks(this);
		
		// mock the behavior of multipy so that any two int mulipication is 10
		Mockito.when(mathObj.multiply(anyInt(), anyInt())).thenReturn(10);  
	}
	
	@Test
	public void whenGetAreaWithTwoIntReturnIs10(){
		rec.setLength(10);
		rec.setWitdh(0);
		Assert.assertThat(rec.getArea(), Matchers.equalTo(10));
	}
	

}
