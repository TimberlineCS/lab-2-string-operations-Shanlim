/*
Shan Lim
AP CSA
8/31/2020
*/

public class StringOperations{
  public static void main(String args[]){
    /*
    Challenge 1:
    It rearranges whatever word is placed within the string "word"
    */
    String word = "Popcorn";      //rearranges in the string "word"
    int length = word.length();
    int ScrmblLength = length/2;
    String scrambled1 = word.substring(0, ScrmblLength);
    String scrambled2 = word.substring(ScrmblLength);
    System.out.print(scrambled2 + scrambled1);


  
    System.out.println("\n           __\n      (___()'`;\n      /,    /`\n     /)----/)");
    /*
    Challenge 2:
    Prints an Ascii art of a dog in one line of code
    */
  }

}