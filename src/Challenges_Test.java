import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Challenges_Test {
    @Test
    public void countTrue_1() {
        assertEquals(Challenges.countTrueFalse(new boolean[] { true, false, false, true, false }), (2));
    }

    @Test
    public void countTrue_test2() {
        assertEquals(Challenges.countTrueFalse(new boolean[] { false, false, false, false }), (0));
    }

    @Test
    public void countTrue_test3() {
        assertEquals(Challenges.countTrueFalse(new boolean[] {}), (0));
    }

    @Test
    public void countTrue_test4() {
        assertEquals(Challenges.countTrueFalse(new boolean[] { false, false, true, true, false, false, false, true, true, true,
                true, false, true, true, false }), (8));
    }

    @Test
    public void countTrue_test5() {
        assertEquals(Challenges.countTrueFalse(new boolean[] { true, false, true, true, false, false, false, false, false }),
                (3));
    }

    @Test
    public void countTrue_test6() {
        assertEquals(Challenges.countTrueFalse(new boolean[] { false, true, true, false, true, true, false, true, false, true,
                false, true, false, true, false }), (8));
    }

    @Test
    public void countTrue_test7() {
        assertEquals(
                Challenges.countTrueFalse(new boolean[] { true, false, true, true, true, false, true, true, false, false }),
                (6));
    }

    @Test
    public void countTrue_test8() {
        assertEquals(
                Challenges.countTrueFalse(
                        new boolean[] { false, false, false, false, true, false, true, false, true, false, false }),
                (3));
    }

    @Test
    public void countTrue_test9() {
        assertEquals(
                Challenges.countTrueFalse(
                        new boolean[] { true, false, false, false, true, false, false, true, false, false, false }),
                (3));
    }

    @Test
    public void countTrue_test10() {
        assertEquals(
                Challenges.countTrueFalse(new boolean[] { true, true, false, true, false, false, false, false, true, false }),
                (4));
    }

    @Test
    public void countTrue_test11() {
        assertEquals(Challenges.countTrueFalse(new boolean[] { true, false, true, true, false, true, true, true, true, false,
                true, false, true, false }), (9));
    }

    @Test
    public void countTrue_test12() {
        assertEquals(Challenges.countTrueFalse(new boolean[] { true, false, true, true, true, true, false, true, true, false,
                true, false, false, false, false }), (8));
    }

    @Test
    public void countTrue_test13() {
        assertEquals(
                Challenges.countTrueFalse(
                        new boolean[] { true, true, false, false, false, false, true, false, true, true, false, true }),
                (6));
    }

    @Test
    public void diffMinMax_test1(){
        assertEquals(Challenges.differenceMinMax(new int[]{3, 0, 9, 99, -2}),101 );
    }
    @Test
    public void diffMinMax_test2(){
        assertEquals(Challenges.differenceMinMax(new int[]{ 200, 89, -23, 40, 77, 43}),223 );
    }

    @Test
    public void diffMinMax_test3(){
        assertEquals(Challenges.differenceMinMax(new int[]{98, 777, 45, 22 }),755);
    }

    @Test
    public void diffMinMax_test4(){
        assertEquals(Challenges.differenceMinMax(new int[]{-200, -40, -23, -66, -77 }),177);
    }
    @Test
    public void diffMinMax_test5(){
        assertEquals(Challenges.differenceMinMax(new int[]{10, 4, 1, 4, -10, -50, 32, 21}), 82);
    }

    @Test
    public void diffMinMax_test6(){
        assertEquals(Challenges.differenceMinMax(new int[]{44, 32, 86, 19}), 67);
    }

    @Test
    public void reverser_test1() {
        assertEquals("DLROw OLLEh", Challenges.reverser("Hello World"));
    }

    @Test
    public void reverser_test2() {
        assertEquals("eSrEvEr", Challenges.reverser("ReVeRsE"));
    }

    @Test
    public void reverser_test3() {
        assertEquals("RELIPMOC AVAj", Challenges.reverser("Java compiler"));
    }

    String[] strVector = new String[] {
            "There is a bOmB.", "Hey, did you think there is a BOMB?", "This goes boom!!!",
            "Commotion in the third, a bomb found!", "Hey, did you find it?", "Hey, did you find the BoMb?"
    };
    String[] resVector = new String[] {
            "DUCK!", "DUCK!", "Relax, there's no bomb.", "DUCK!", "Relax, there's no bomb.", "DUCK!"
    };

    @Test
    public void duckTheBomb_test01() {
        assertEquals(resVector[0], Challenges.duckTheBomb(strVector[0]));
    }

    @Test
    public void duckTheBomb_test02() {
        assertEquals(resVector[1], Challenges.duckTheBomb(strVector[1]));
    }

    @Test
    public void duckTheBomb_test03() {
        assertEquals(resVector[2], Challenges.duckTheBomb(strVector[2]));
    }

    @Test
    public void duckTheBomb_test04() {
        assertEquals(resVector[3], Challenges.duckTheBomb(strVector[3]));
    }

    @Test
    public void duckTheBomb_test05() {
        assertEquals(resVector[4], Challenges.duckTheBomb(strVector[4]));
    }

    @Test
    public void duckTheBomb_test06() {
        assertEquals(resVector[5], Challenges.duckTheBomb(strVector[5]));
    }

    @Test
    public void stutter_test01() {
        assertEquals("in... in... increasing?", Challenges.stutter("increasing"));
    }

    @Test
    public void stutter_test02() {
        assertEquals("ad... ad... adventures?", Challenges.stutter("adventures"));
    }

    @Test
    public void stutter_test03() {
        assertEquals("en... en... enticing?", Challenges.stutter("enticing"));
    }

    @Test
    public void stutter_test04() {
        assertEquals("un... un... unacceptable?", Challenges.stutter("unacceptable"));
    }

    @Test
    public void stutter_test05() {
        assertEquals("ac... ac... accountable?", Challenges.stutter("accountable"));
    }

    @Test
    public void stutter_test06() {
        assertEquals("in... in... incredible?", Challenges.stutter("incredible"));
    }

    @Test
    public void stutter_test07() {
        assertEquals("ex... ex... exquisite?", Challenges.stutter("exquisite"));
    }

    @Test
    public void stutter_test08() {
        assertEquals("am... am... am?", Challenges.stutter("am"));
    }

    @Test
    public void stutter_test09() {
        assertEquals("en... en... enduring?", Challenges.stutter("enduring"));
    }

    @Test
    public void stutter_test10() {
        assertEquals("ou... ou... outstanding?", Challenges.stutter("outstanding"));
    }

    @Test
    public void stutter_test11() {
        assertEquals("as... as... astonishing?", Challenges.stutter("astonishing"));
    }

    @Test
    public void stutter_test12() {
        assertEquals("as... as... astounding?", Challenges.stutter("astounding"));
    }

    @Test
    public void stutter_test13() {
        assertEquals("im... im... impressive?", Challenges.stutter("impressive"));
    }

    @Test
    public void stutter_test14() {
        assertEquals("re... re... revolutionize?", Challenges.stutter("revolutionize"));
    }

    @Test
    public void stutter_test15() {
        assertEquals("re... re... recurring?", Challenges.stutter("recurring"));
    }

    @Test
    public void stutter_test16() {
        assertEquals("re... re... recollection?", Challenges.stutter("recollection"));
    }

    @Test
    public void stutter_test17() {
        assertEquals("so... so... so?", Challenges.stutter("so"));
    }

    @Test
    public void stutter_test18() {
        assertEquals("go... go... gorgeous?", Challenges.stutter("gorgeous"));
    }

    @Test
    public void stutter_test19() {
        assertEquals("ca... ca... captivating?", Challenges.stutter("captivating"));
    }

    @Test
    public void secondLargestNumber_test01() {
        assertEquals(40, Challenges.secondLargestNumber(new int[] {10,40,30,20,50}));
    }

    @Test
    public void secondLargestNumber_test02() {
        assertEquals(105, Challenges.secondLargestNumber(new int[] {25,143,89,13,105}));
    }

    @Test
    public void secondLargestNumber_test03() {
        assertEquals(23, Challenges.secondLargestNumber(new int[] {54,23,11,17,10}));
    }

    @Test
    public void secondLargestNumber_test04() {
        assertEquals(417, Challenges.secondLargestNumber(new int[] {513,211,131,417,11}));
    }

    @Test
    public void secondLargestNumber_test05() {
        assertEquals(65, Challenges.secondLargestNumber(new int[] {63,44,11,22,33,66,65}));
    }

    @Test
    public void secondLargestNumber_test06() {
        assertEquals(-17, Challenges.secondLargestNumber(new int[] {-24,-29,-92,-11,-17}));
    }

    @Test
    public void fizzBuzz_test1() {
        assertEquals(Challenges.fizzBuzz(3), "Fizz");
    }
    @Test
    public void fizzBuzz_test2() {
        assertEquals(Challenges.fizzBuzz(5), "Buzz");
    }
    @Test
    public void fizzBuzz_test3() {
        assertEquals(Challenges.fizzBuzz(15), "FizzBuzz");
    }
    @Test
    public void fizzBuzz_test4() {
        assertEquals(Challenges.fizzBuzz(10), "Buzz");
    }
    @Test
    public void fizzBuzz_test5() {
        assertEquals(Challenges.fizzBuzz(98), "98");
    }

    @Test
    public void skipCount_test1(){
        assertEquals(Challenges.skipCount(4, 13, 3), "4.. 7.. 10.. 13");
    }

    @Test
    public void skipCount_test2(){
        assertEquals(Challenges.skipCount(0, 21, 7), "0.. 7.. 14.. 21");
    }

    @Test
    public void skipCount_test3(){
        assertEquals(Challenges.skipCount(1, 10, 5), "1.. 6");
    }

    @Test
    public void skipCount_test4(){
        assertEquals(Challenges.skipCount(10, 100, 5), "10.. 15.. 20.. 25.. 30.. 35.. 40.. 45.. 50.. 55.. 60.. 65.. 70.. 75.. 80.. 85.. 90.. 95.. 100");
    }

    @Test
    public void skipCount_test5(){
        assertEquals(Challenges.skipCount(10, 5, 2), "Try again with better numbers!");
    }

    @Test
    public void removeDups_test1() {
        assertEquals(Challenges.removeDups(new String[]{"John", "Taylor", "John"}), (new String[]{"John", "Taylor"}));
    }

    @Test
    public void removeDups_test2() {
        assertEquals(Challenges.removeDups(new String[]{"John", "Taylor", "John", "john"}), (new String[]{"John", "Taylor", "john"}));
    }

    @Test
    public void removeDups_test3() {
        assertEquals(Challenges.removeDups(new String[]{"javascript", "python", "python", "ruby", "javascript", "c", "ruby"}), (new String[]{"javascript", "python", "ruby", "c"}));
    }

    @Test
    public void removeDups_test5() {
        assertEquals(Challenges.removeDups(new String[]{"#", "#", "%", "&", "#", "$", "&"}), (new String[]{"#", "%", "&", "$"}));
    }


}
