package daily;
import java.util.*;

public class daily_19 {
    public String decryptCaesarCipher(String str, int secret) {
        //정철님 코드
        final int ALPHABET_COUNT = 26;
        if(secret == ALPHABET_COUNT) return str;
        if(secret > ALPHABET_COUNT)secret %= ALPHABET_COUNT;

        String result = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            if(letter == ' ') {
                result = result + ' ';
                continue;
            }
            int index = alphabet.indexOf(letter);
            index -= secret;
            if(index < 0) index += ALPHABET_COUNT;
            result = result + alphabet.charAt(index);
        }
        return result;
    }
}