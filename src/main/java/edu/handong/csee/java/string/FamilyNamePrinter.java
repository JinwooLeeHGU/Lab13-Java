package edu.handong.csee.java.string;

public class FamilyNamePrinter{
    private String[] stringNames;  
    private String[] familyNames; 
    //String[] names= new String[StringNames.length];

    public static void main(String[] args){
        FamilyNamePrinter fnp = new FamilyNamePrinter(args[0]);
        fnp.printFamilyNames();                                                // why w/o fnp it does not work?
    }
    /*public int GetFamilyNames(){
        return familyNames;
    }*/
    public FamilyNamePrinter(String names){
        
        stringNames = names.split(",");                   //stringNames[0]= Num of names  // a single letter can also be a string. 
        familyNames = new String[stringNames.length];    // stringNames.length== The size of the array is assigned. 
        for(int i=0; i<stringNames.length; i++){
            //int space = stringNames[i].indexof(" ");
            familyNames[i] = stringNames[i].trim().split(" ")[1];  // The size is assigned and then each index of the String Array is accessed.
        }
    }
    public void printFamilyNames(){
        for(String surnames: familyNames){
            System.out.println(surnames);
        }
    }

}