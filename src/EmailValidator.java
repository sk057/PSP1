public class EmailValidator {

    public boolean hasEtaSymbol(String email){
        return  email.contains("@");
    }

    public boolean hasOnlyRightSymbols(String email){
        String localPart;
        localPart = email.substring(0, email.indexOf("@"));
        String illegalSymbols = "\"(),:;<>@[\\]";

        for(int i=0;i < localPart.length();i++){
            for(int j=0;j < illegalSymbols.length();j++){
                if (localPart.charAt(i) == illegalSymbols.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean hasRightDomain(String email){
        String illegalSymbols = " _!@#$%^&*();:,?/\\=+<>";
        String domainPart;
        domainPart = email.substring(email.indexOf('@')+1, email.length()-1) + email.charAt(email.length()-1);

        for(int i=0;i < domainPart.length();i++){
            for(int j=0;j < illegalSymbols.length();j++){
                if (domainPart.charAt(i) == illegalSymbols.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }
}
