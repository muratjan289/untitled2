package otherProgramms;

import java.nio.CharBuffer;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import org.apache.commons.lang3.RandomStringUtils;


public class RandomLogin {

    public static void main(String[] args) {


        String randomm = RandomStringUtils.randomAlphabetic(8, 9) + "@mail.ru";


        System.out.println(randomm);
    }


//
//    private static Random rand = new Random();
//        private static final char[] capitals =
//                "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
//        private static final char[] lowers =
//                "abcdefghijklmnopqrstuvwxyz".toCharArray();
//        private static final char[] vowels =
//                "aeiou".toCharArray();
//        private int count;
//
//        public RandomLogin(int count) { this.count = count; }
//        public int read(CharBuffer cb) {
//            if(count-- == 0)
//                return -1;
//            cb.append(capitals[rand.nextInt(capitals.length)]);
//            for(int i = 0; i<4; i++) {
//                cb.append(capitals[rand.nextInt(vowels.length)]);
//                cb.append(capitals[rand.nextInt(lowers.length)]);
//            }
//            cb.append(" ");
//            return 10;
//        }



    }
