package shopApp;
public class Views {

    String a = "hello";
    


    public String f(String text, int charLen){
        int leftovers = charLen - text.length();
        for (int i =0 ; i < leftovers ; i++){
            text += " ";
            
        }

        return text;
    }

    // Method Overloading if both are int paramaters

    public String f(int text, int charLen){
        String str = "";
        str += text;
        
        int leftovers = charLen - str.length();
        for (int i =0 ; i < leftovers ; i++){
            str += " ";
            
        }

        return str;
    }

}