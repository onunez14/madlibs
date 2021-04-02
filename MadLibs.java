/*
* Pre-Lab 7
* Description:Mad Libs
* Omar Nunez
* ID: 921572389
* Class: CSC 211-02
* Semester: Spring 2021
*/
import java.io.*;
public class MadLibs {
    private static void intro()
        {
            String msg = "This is a Mad-Lib game. I will ask " +
                    "you for five words.\n";

            System.out.print(msg);
        }
        private static String getInput(String msg) throws IOException
        {
            BufferedReader stdin;
            stdin = new BufferedReader(new InputStreamReader(System.in));
            System.out.print(msg);
            return stdin.readLine();
        }
        private static void printOutput (String adj, String noun, String place, String adj2, String noun2)
        {
            String output = "\n The " + adj + " " + noun + " went to the " + place +
                    " and asked them for a " + adj2 + " " + noun2 +". ";
            System.out.println(output);
        }


        public static void main(String[] args) throws IOException
        {
            intro();
            String adj = getInput("Enter a adjective : ");
            String noun = getInput("Enter a noun : ");
            String place = getInput("Enter a place : ");
            String adj2 = getInput("Enter a second adjective : ");
            String noun2 = getInput("Enter a second noun : ");
            printOutput(adj, noun, place, adj2, noun2);
        }
}
