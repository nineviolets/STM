open eclipse
open new project and save it by com.vogella.JUnit.Basic
again open open file new --> java class and give file name as prime and write code in it
  
package com.vogella.JUnit.Prime;
public class Prime 
{
public int isPrime(int n)
{
	int c=0;
	for(int i=1;i<n;i=i+1)
	{
		if(n%i==0)
			c=c+1;
		if(c>1)
			return 0;
	}
	if(c==1)
		return 1;
	return 0;
}
}



now right click on the com.vogella.JUnint.com (which is to the left)
got to new seach for junit and click on JUnit
and give the  file name Prime1

package com.vogella.JUnit.Prime;
import static org.junit.Assert.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Prime1 {
	private int expected;
	private int first;
	public Prime1(int expectedResult,int first)
	{
		this.first=first;
		this.expected=expectedResult;
	}
	@Parameters
public static Collection<Integer[]>PrimeNumber(){
		return Arrays.asList(new Integer[][]{{1,7},{1,4},{1,3}});
	}
	@Test
	public void testIsPrime() {
		Prime pr=new Prime();
		System.out.println("Prime with parameters:"+first);
		assertEquals(expected,pr.isPrime(first));
	}
}

run the code


stage(1-5)     teststep(one valied interger value)	Testdata(6,13,29,15,9)  expected result(0,1,1,0,0)  
actual result(0,1,1,0,1)  status(pass(1-4),fail-5)   remarks(nil)
	
	
	
	
	
