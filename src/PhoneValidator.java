import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class PhoneValidator {

    Map<String, String> prefixRules  = new HashMap<String, String>() {{
        put("lt", "86");
        put("lv", "87");
    }};

    private  <K, V> K getKey(Map<K, V> map, V value) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (entry.getValue().equals(value)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public boolean hasOnlyNumbers(String number){
        boolean isPlus = false;
        if (number.charAt(0) == '+'){
            isPlus = true;
        }
        for(int i=0;i < number.length();i++) {
            if(!(i == 0 && isPlus)) {
                if (!Character.isDigit(number.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    public String changeToLithuanianPrefix(String number){
        String LTNumber = "8";
        for(int i=0;i < number.length();i++){
            if (i>3){
                LTNumber+=number.charAt(i);
            }
        }
        return LTNumber;
    }

    public String addNewPhoneRules(int prefix){
        //???
        String prefixString = String.valueOf(prefix);
        return getKey(prefixRules, prefixString);
    }
}
