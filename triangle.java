open eclipse
open new project and save it by com.vogella.JUnit.Basic
again open open file new --> java class and give file name as Triangle and write code in it

packagecom.vogella.JUnit.Basic;

public class Triangle { 

public int fun(int a, int b, int c)
{
if(a==b && b==c)
return 1;
else if(a==b || b==c || a==c)
return 2;
else
return 3;
}
}


  
now right click on the com.vogella.JUnint.com (which is to the left)
  got to new seach for junit and click on JUnit
  and give the  file name TrinagleTest
  
package com.vogella.JUnit.Basic;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TriangleTest {
private int expected;
private int first;
private int second;
private int third;
public TriangleTest(int firstNumber, int secondNumber, int thirdNumber, int expectedResult)
{
this.expected = expectedResult;
this.first = firstNumber;
this.second = secondNumber;
this.third = thirdNumber;
}
@Parameters
public static Collection<Integer[]>addNumbers()
{
returnArrays.asList(new Integer[][]{
{4,4,4,1},{1,2,2,1},{7,2,6,3},{1,1,2,2},{7,8,1,3}}
@Test
public void testSubNumbers() {
//fail("Not yet implemented");
Triangle s= new Triangle();
System.out.println("Prime check with parameter : "+first);
assertEquals(s.fun(first,second,third),expected);
}
}






table write
 
 Test case id: ID_5                                                                    Test Designed by:  
Test Priority: low                                                                    Test Designed Date:
Module Name: Junit Testing                                                             Test Executed by:  
Test Title: Blackbox testing
Test Executed Date:
Description: Test case for problem using Parameterized Testing
Pre-Condition: User should give one input number and one expected output

 
stage(1-5)    teststep(one valid interger)   testdata(4,4,1|2,2,2|2,6,3|1,2,2|8,1,3) expected result(4,1,7,1,7) actual result(4,1,7,1,7)  
status(pass-(1-5) remarks (nill(1-5))

 Post condition: Expected result should match with value returned by function
