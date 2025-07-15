class Solution {
    public boolean isValid(String word) {
        if (word.length() < 3) {
            return false;
        }

        int vowels = 0;
        int consonants = 0;

        for (char c : word.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                return false; // invalid character
            }

            if (Character.isLetter(c)) {
                char lower = Character.toLowerCase(c);
                if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        return vowels > 0 && consonants > 0;
    }
}
