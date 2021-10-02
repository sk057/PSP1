public class PasswordChecker {

    public int passwordLenght(String password){
        int minLength = 7;
        return (password.length() >= minLength) ? password.length() : -1;
    }

    public boolean hasUppercase(String password){
        for(int i=0;i < password.length();i++) {
            if (Character.isUpperCase(password.charAt(i))){
                    return true;
                }
        }
        return false;
    }

    public boolean hasSpecialSymbols(String password){
        String specialSymbols = " !\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";
        for(int i=0;i < password.length();i++){
            for(int j=0;j < password.length();j++){
                if (password.charAt(i) == specialSymbols.charAt(j)){
                    return true;
                }
            }
        }
        return false;
    }
}
