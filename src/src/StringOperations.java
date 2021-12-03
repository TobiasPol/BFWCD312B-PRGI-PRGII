public class StringOperations {
    static String replaceChar(String s, int index){
        if (s.equalsIgnoreCase(""))
            return s;
        else
        return s.substring(0,index)+ s.substring(index+1);
    }
}
