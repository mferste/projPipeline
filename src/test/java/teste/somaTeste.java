package teste;

import org.junit.Test;

import aplicacao.soma;
import junit.framework.Assert;

public class somaTeste {
	
	@Test
	public void testeSoma() {
		double result;
		
		soma conta = new soma();
		result = conta.soma(10.0, 5.0);
		
		Assert.assertEquals(15.0, result, 0);
	}
}
