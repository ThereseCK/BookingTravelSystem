package therese_get;

import java.util.Scanner;

public class Travels {

    public String Info(){

        return " oversikt over dagens reiser \n" +
                "1. oversikt over bussruter \n" +
                "2. oversikt over togruter \n" +
                "3. oversikt over flyruter \n" +
                "4. oversikt over dine bookinger" ;
    }
    public Byte scan(){
        Scanner scanner = new Scanner(System.in);
        byte input = scanner.nextByte();
        return input;
    }
}
