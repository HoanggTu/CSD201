/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Binary;

/**
 *
 * @author rechiee
 */
public class Binary {

    /**
     * @param args the command line arguments
     */
    
    public String binary(int num){
        return Integer.toBinaryString(num);
    }
    
    
    public static void main(String[] args) {
        
        Binary bi = new Binary()   ;
        System.out.println(bi.binary(12));
        // TODO code application logic here
    }
    
    /*
    public String binary(int num){
        if(num==0) return"0";
        String result ="";
        
        while( num >0){
            int reminder = num %2;
            if(reminder ==0){
               return = "0" + result;
            }else{ 
               return = "1"+ result;
    
            }
            num = num /2;
    
    
        }
    return result;
    
    }
    */
    
}
