package Recursion.Easy;

public class Skip_Characters {
    static void main(String[] args) {
//        skipA("","baccbbaacb");
//        System.out.println(skipA("baccbaacb"));
//        System.out.println(skipApple("bacappleacgdf"));
        System.out.println(skipAppNotApple("badsaappapplesd"));
    }

//    Write a code to display a string after removing 'a' character.
    static void skipA(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            skipA(p,up.substring(1));

        }
        else{
            skipA(p+ch,up.substring(1));

        }
    }

    // Skip 'a' from a given string and return it in the same order.
    static String skipA(String up){
        if(up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            return skipA(up.substring(1));
        }else{
            return ch + skipA(up.substring(1));
        }

    }

    // Write a code to skip a string "apple" from given string.
    static String skipApple(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("apple")){
            return skipA(up.substring(5));
        }
        else{
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }

//    Write a code which remove string "app" from the string it does not contain "apple"
    static String skipAppNotApple(String up){
        if(up.isEmpty()) return "";
        if(up.startsWith("app") & !up.startsWith("apple")){
            return skipAppNotApple(up.substring(3));
        }
        return up.charAt(0) + skipAppNotApple(up.substring(1));
    }
}
