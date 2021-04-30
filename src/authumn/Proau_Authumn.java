/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package authumn;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author WYNXTYN PROAUTOTYPE
 */
public class Proau_Authumn {    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        printYearAndDays_1(80900);        
//        ReadFile(CreateFile());
//        printEqual_9(1, 1, 1);
//        printEqual_9(1, 1, 2);
//        printEqual_9(1, 3, 2);
//
//        System.out.println("isPlaying " + isCatPlaying_10(false, 27));;
//        System.out.println("isPlaying " + isCatPlaying_10(true, 100));;
//        System.out.println("isPlaying " + isCatPlaying_10(true, 43));;
//        System.out.println("isPlaying " + toMilesPerHour_1(1211));;
//        System.out.println("isPlaying " + toMilesPerHour_1(22));;
//        System.out.println("isPlaying " + toMilesPerHour_1(75.114));;
//        printMegaBytesAndKilobytes(1211);
//        printMegaBytesAndKilobytes(10444);
//        printMegaBytesAndKilobytes(1074 * 3);
//        System.out.println("isBarking: " + shouldWakeUp(true, 2));
//        System.out.println("isBarking: " + shouldWakeUp(true, 23));
//        System.out.println("isBarking: " + shouldWakeUp(true, 9));
//        
//        System.out.println(areEquallyByThreeDecimalPlaces(-12.8821, 12.8821));
//        System.out.println(areEquallyByThreeDecimalPlaces(12.8821, 12.8821));
//        System.out.println(hasEqualSum(1, 1, 1));
//        System.out.println(hasEqualSum(1, 1, 2));
//        System.out.println(hasEqualSum(1, -1, 0));
//        System.out.println(hasTeen(14, 15, 13));
//        System.out.println(hasTeen(14, 14, 20));
//        System.out.println(hasTeen(14, 14, 20));
    }

    public static void printYearAndDays_1(long minutes) {
		 final long HOUR = 60;//minutes
		 final long DAY = 24;//hours
		 final long YEAR = 365;//days
        long min, hour, day, daysRemainer, year = 0;
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            min = minutes;
            hour = min / HOUR;
            day = hour / DAY;
            year = day / YEAR;
            daysRemainer = min % DAY;

            System.out.println("hour -> " + hour + " day -> " + day + " year -> " + year + " days remainder -> " + daysRemainer);
        }
    }

    public static void printEqual_9(int a, int b, int c) {
        if (!(a < 0 || b < 0 || c < 0)) {
            System.out.println(a + " " + b + " " + c);
            if (a == b & a == c & b == c) {
                System.out.println("All numbers are equal");
            } else if (a == b | a == c | b == c) {
                System.out.println("different");
            } else {
                System.out.println("All numbers are different");
            }
        } else {
            System.out.println("Invalid value");
        }
    }

    static boolean isCatPlaying_10(boolean summer, double temp) {
        boolean isPlaying = false;
        if (!summer) {
            if (temp >= 25 && temp <= 35) {
                isPlaying = true;
            } else {
                isPlaying = false;
            }
        } else {
            if (temp >= 25 && temp <= 45) {
                isPlaying = true;
            } else {
                isPlaying = false;
            }
        }
        return isPlaying;
    }

    static int toMilesPerHour_1(double kilom_perH) {
        final double MPH_VAL = 0.621371;
        if (!(kilom_perH < 0)) {
            return (int) Math.ceil(MPH_VAL * kilom_perH);
        } else {
            return -1;
        }
    }

    public static void printMegaBytesAndKilobytes(int kiloBytes) {
        final int KILO_BENCH = 1024;
        int kilo, mega = 0;
        if (!(kiloBytes < 0)) {
            mega = kiloBytes / KILO_BENCH;
            kilo = kiloBytes % KILO_BENCH;
            System.out.println("Kilobytes In " + kiloBytes + " = " + "MegaBytes " + mega + " " + "Remainder " + kilo + " ");
        }
    }

    static boolean shouldWakeUp(boolean isBarking, int hourOfDay) {
        if (isBarking && (hourOfDay >= 0 && hourOfDay <= 23)) {
            if ((hourOfDay < 8 || hourOfDay > 22)) {
                System.out.println("1 hour " + hourOfDay + " ");
                return true;
            } else {
                System.out.println("2 hour " + hourOfDay + " ");
                return false;
            }
        } else {
            System.out.println("3 hour " + hourOfDay + " ");
            return false;
        }
    }

    static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (((year % 4) == 0)) {
                if (((year % 100) == 0)) {
                    if (((year % 400) == 0)) {
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    static boolean areEquallyByThreeDecimalPlaces(double val, double val2) {
        if (String.valueOf(val).length() == String.valueOf(val2).length()) {
            if (Double.parseDouble(String.format("%1.3f", val)) == Double.parseDouble(String.format("%1.3f", val2))) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    static boolean hasEqualSum(int a, int b, int c) {
        return (a + b) == c;
    }

    static boolean hasTeen(int a, int b, int c) {
        return ((a >= 13 && a <= 19) && (b >= 13 && b <= 19) && (c >= 13 && c <= 19));
    }

    public static File CreateFile() {
        File file = new File("cj.txt");
        try {
            FileWriter fw = new FileWriter(file);
            fw.append("hello my name is cj");
            fw.flush();
        } catch (Exception e) {
            System.out.println(e);
        }
        return file;
    }

    static void ReadFile(File file) {
        try {
            file = new File("cj.txt");
            StringBuilder sb = new StringBuilder();
            FileReader fr = new FileReader(file);
            for (int i = 0; (i = fr.read()) != -1; i++) {
                sb.append((char) i);
            }
            System.out.println(sb.toString());
        } catch (Exception e) {
        }
    }

}
