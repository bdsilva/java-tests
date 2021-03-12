package com.madakethealth.example.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.madakethealth.example.Application;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
@ActiveProfiles("test")
public class CountingValleysTest {

	/**
     * A path consists of a string of 'Down (D)' and 'Up (U)' characters concatenated together.
     * The path starts at Sea Level.
     * A 'U' takes the person one step up.
     * A 'D' takes the person one step down.
     * 
     * Question: Complete the 'countingValleys' function below, such that given a 'path'
     * the method returns the number of times the person took the '1st' step below the 
     * Sea Level
     * 
     * Examples: 
     *     DDUDUUDDU  ===> 2
     *     DDUDUUDDU  ===> 2
     *     
	 * @param path
	 * @return
	 */
    public static int countingValleys(String path) {
    	
    	// complete this method
    	
        return 0;
    }
    
    /**
     * Use examples:
     *    'DDUDUUDDU'  --> expected result: 2
     *    'UDDUUDDDUUDU' --> expected result: 3
     *  
     */
    @Test
    public void testCountingValleys() {
    	
    	String example1 = "DDUDUUDDU";
    	String example2 = "UDDUUDDDUUDU";
    	
    	int result1 = CountingValleysTest.countingValleys(example1);
    	int result2 = CountingValleysTest.countingValleys(example2);
    	
    	Assert.assertEquals(2, result1);
    	Assert.assertEquals(3, result2);
    }
}
