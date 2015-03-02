/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.fizzbuzz2.FizzBuzzer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Toooooomi
 */
public class FizzBuzzerTest {
    
  private FizzBuzzer fizzBuzzer = new FizzBuzzer();

   
@Test
    public void executeShouldReturnBuzzIfTheNumberDividable7() {
        assertEquals("Wizz", fizzBuzzer.execute(406));
        assertEquals("Wizz", fizzBuzzer.execute(7));
    }

    @Test
    public void executeShouldReturnBuzzIfTheNumberContains3() {
        assertEquals("Fizz", fizzBuzzer.execute(333));
        assertEquals("Fizz", fizzBuzzer.execute(3));
    }

    @Test
    public void executeShouldReturnBuzzIfTheNumberContains5() {
        assertEquals("Buzz", fizzBuzzer.execute(505));
        assertEquals("Buzz", fizzBuzzer.execute(5));
    }
    
    @Test
    public void executeShouldReturnBuzzIfTheNumberContains7() {
        assertEquals("Wizz", fizzBuzzer.execute(707));
        assertEquals("Wizz", fizzBuzzer.execute(7));
    }
    
    @Test
    public void executeShouldReturnTheSameNumberIfNoOtherRequirementIsFulfilled() {
        assertEquals("1", fizzBuzzer.execute(1));
        assertEquals("2", fizzBuzzer.execute(2));
        assertEquals("4", fizzBuzzer.execute(4));
        
    }
}
