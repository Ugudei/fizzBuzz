

package hello;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

  private FizzBuzz fizzbuzz = new FizzBuzz();

 
  @Test
  public void testContainLucky() {
    // assertThat(greeter.sayHello(), containsString("Hello"));
    String result = fizzbuzz.getResult(20);
    assertThat(result, containsString("lucky"));
  }
    @Test
  public void testContainFizz() {
    // assertThat(greeter.sayHello(), containsString("Hello"));
    String result = fizzbuzz.getResult(20);
    assertThat(result, containsString("fizz"));
  }
    @Test
  public void testContainFizzBuzz() {
    // assertThat(greeter.sayHello(), containsString("Hello"));
    String result = fizzbuzz.getResult(20);
    assertThat(result, containsString("fizzbuzz"));
  }
  //   @Test
  // public void testContainLucky() {
  //   // assertThat(greeter.sayHello(), containsString("Hello"));
  //   String result = fizzbuzz.getResult(20);
  //   String expectedResult = "1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz fizz : 4 buzz : 3 fizzbuzz : 1 lucky : 2 integer : 10";
  //   assertEquals(result, expectedResult);
  // }

}