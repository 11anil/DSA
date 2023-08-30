package Basics.StringAndStringBuilders;

    public class DefangIPAddress {
        public static void main(String[] args) {
            String address1 = "1.1.1.1";
            String address2 = "255.100.50.0";
    
            String defanged1 = defangIP(address1);
            String defanged2 = defangIP(address2);
    
            System.out.println(defanged1);  // Output: "1[.]1[.]1[.]1"
            System.out.println(defanged2);  // Output: "255[.]100[.]50[.]0"
        }
    
        public static String defangIP(String address) {
            StringBuilder defangedAddress = new StringBuilder();
            for (char c : address.toCharArray()) {
                if (c == '.') {
                    defangedAddress.append("[.]");
                } else {
                    defangedAddress.append(c);
                }
            }
            return defangedAddress.toString();
        }
    }
    
