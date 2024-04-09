package common_dsa_questions;

import java.util.ArrayList;
import java.util.List;

public class FullJustify {

	public static void main(String[] args) {
		
		String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
		
		int maxWidth = 16;
		List<String> result = fullJustify(words, maxWidth);
		for (String line : result) {
		    System.out.println(line);
		}
		
	}
	
	public static List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int index = 0;
        
        while (index < words.length) {
            int lineLength = words[index].length();
            int lastWordIndex = index + 1;
            
             while (lastWordIndex < words.length && (lineLength + words[lastWordIndex].length() + 1) <= maxWidth) {
                lineLength += words[lastWordIndex].length() + 1;
                lastWordIndex++;
            }
            
            StringBuilder line = new StringBuilder();
            int numOfWords = lastWordIndex - index;
            if (numOfWords == 1 || lastWordIndex == words.length) {
                for (int i = index; i < lastWordIndex; i++) {
                    line.append(words[i]);
                    if (i < lastWordIndex - 1) {
                        line.append(" ");
                    }
                }
                while (line.length() < maxWidth) {
                    line.append(" ");
                }
            } else {
               
                int totalSpaces = maxWidth - lineLength + numOfWords - 1;
                int spacesBetweenWords = totalSpaces / (numOfWords - 1);
                int extraSpaces = totalSpaces % (numOfWords - 1);
                for (int i = index; i < lastWordIndex; i++) {
                    line.append(words[i]);
                    if (i < lastWordIndex - 1) {
                        for (int j = 0; j < spacesBetweenWords; j++) {
                            line.append(" ");
                        }
                        if (extraSpaces > 0) {
                            line.append(" ");
                            extraSpaces--;
                        }
                    }
                }
            }
            result.add(line.toString());
            index = lastWordIndex;
        }
        
        return result;
    }

}
