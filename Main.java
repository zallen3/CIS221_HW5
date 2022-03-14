/* 
Zachery Allen
CIS221 
T & Th 2:10pm 
*/

class OuterClass{
    int x = 10;
    //Private inner method with value
    private class InnerClass{
        String innerMessage = "This is a private message from the inner class.";
    }
    //Displays the value of the inner method
    void displayInner(){
        //Create inner object of InnerClass to access the variable
        InnerClass inner = new InnerClass();
        //Print the number in the inner class
        System.out.println(inner.innerMessage);
    }
}

public class Main {
    
    public static void main(String[] args){
        //Object of outer class to call the method displaying the inner string
        OuterClass outer = new OuterClass();  
        outer.displayInner();
    }
}