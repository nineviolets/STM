open eclipse
open new project and save it by com.vogella.JUnit.Basic
again open open file new --> java class and give file name as Addition and write code in it
  
  package com.vogella.JUnit.Basic
  public class Addition {
  public int addnumber(int a, int b)
  {
  int sum = a+b;
  return sum:
  }
  }
  
now right click on the com.vogella.JUnint.com (which is to the left)
  got to new seach for junit and click on JUnit
  and give the  file name AdditionTest
  
package com.vogella.JUnit.Basic;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection; 
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class AdditionTest
{
private int expected;
private int first;
private int second; 
public AdditionTest(int expectedResult, int firstNumber,
int secondNumber) {
this.expected = expectedResult;
this.first = firstNumber;
this.second = secondNumber;
    } 
@Parameters
public static Collection<Integer[]> addedNumbers() {
return Arrays.asList(new Integer[][] { { 10, 6, 4 }, { 6, 3, 3 },
                { 20, 15, 5 }, { 13, 9, 4 },{2,1,1} });
}	@Test
	public void test() 
		  {
			Addition add = new Addition();
			System.out.println("Addition with parameters : " + first + " and "+ second);
assertEquals(expected,add.addNumbers(first, second));
	}
}
 and run the code
