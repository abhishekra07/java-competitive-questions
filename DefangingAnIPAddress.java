public class DefangingAnIPAddress {
    public static void main(String[] args) {
        System.out.println(defangIPaddr("1.1.1.1"));
    }

    public static String defangIPaddr(String address) {
        String res = "";
        for(char ch : address.toCharArray()) {
            if(ch == '.') {
                res += "[.]";
            } else {
                res += ch;
            }
        }
        return res;
    }
}
