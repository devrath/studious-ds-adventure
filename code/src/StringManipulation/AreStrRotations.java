package StringManipulation;

public class AreStrRotations {


    public boolean initiate( String str1 , String str2 ) {
        if(str1.length()!=str2.length()){
            return false;
        }
        String appendedStr = str1+str1;

        if(appendedStr.contains(str2) ){
            return true;
        }else{
            return false;
        }
    }

}
