import java.util.*;
import java.util.regex.*;

class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        // Define valid business categories
        Set<String> validBusinessLines = new HashSet<>(Arrays.asList("electronics", "grocery", "pharmacy", "restaurant"));
        
        // Define businessLine sorting order
        Map<String, Integer> businessOrder = new HashMap<>();
        businessOrder.put("electronics", 0);
        businessOrder.put("grocery", 1);
        businessOrder.put("pharmacy", 2);
        businessOrder.put("restaurant", 3);

        // Pattern to check valid codes (alphanumeric and underscores only)
        Pattern pattern = Pattern.compile("^\\w+$");

        // List to hold valid coupons
        List<Coupon> validCoupons = new ArrayList<>();

        for (int i = 0; i < code.length; i++) {
            if (
                code[i] != null && !code[i].isEmpty() &&
                pattern.matcher(code[i]).matches() &&
                validBusinessLines.contains(businessLine[i]) &&
                isActive[i]
            ) {
                validCoupons.add(new Coupon(code[i], businessLine[i]));
            }
        }

        // Sort by businessLine order and then lexicographically by code
        validCoupons.sort((a, b) -> {
            int orderCompare = Integer.compare(businessOrder.get(a.businessLine), businessOrder.get(b.businessLine));
            return orderCompare != 0 ? orderCompare : a.code.compareTo(b.code);
        });

        // Extract just the codes
        List<String> result = new ArrayList<>();
        for (Coupon c : validCoupons) {
            result.add(c.code);
        }

        return result;
    }

    // Helper class to store coupon details
    static class Coupon {
        String code;
        String businessLine;

        Coupon(String code, String businessLine) {
            this.code = code;
            this.businessLine = businessLine;
        }
    }
}
