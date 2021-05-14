/*
https://github.com/ArinaJur/CodingPracticeLessons

 */

import org.junit.Assert;
import org.junit.Test;

public class AscendingSequenceTest {

        @Test
        public void testAscendingSequenceHappyPass() {

            int startNumber = 0;
            int endNumber = 5;
            int[] expectedResult = {1, 2, 3, 4, 5};

        AscendingSequence ascendingSequence = new AscendingSequence();
        int[] actualResult = ascendingSequence.buildAscendingSequence(1, 5);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingArrayZeroCase() {

        int startNumber = 0;
        int endNumber = 10;
        int[] expectedResult = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        AscendingSequence ascendingSequence = new AscendingSequence();
        int[] actualResult = ascendingSequence.buildAscendingSequence(0, 10);

        Assert.assertArrayEquals(expectedResult,actualResult);

    }

    @Test

    public void testAscendingSequenceNegativeNumbersCase() {
        int startNumber = -8;
        int endNumber = -4;
        int[] expectedResult = {-8, -7, -6, -5, -4};

        AscendingSequence ascendingSequence = new AscendingSequence();
        int[] actualResult = ascendingSequence.buildAscendingSequence(-8, -4);

        Assert.assertArrayEquals(expectedResult, actualResult);

    }

    public void testAscendingSequenceNegativePositiveCase(){

            int startNumber = -5;
            int endNumber = 5;

            int[] expectedResult = {-5,-4,-3,-2,-1,0,1,2,3,4,5};

            AscendingSequence ascendingSequence = new AscendingSequence();
            int[] actualResult = ascendingSequence.buildAscendingSequence(-5,5);
            Assert.assertArrayEquals(expectedResult,actualResult);

    }
}






