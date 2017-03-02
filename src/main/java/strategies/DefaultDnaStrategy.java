package strategies;

import com.sun.istack.internal.Nullable;
import main.DnaStrategy;
import main.RnaTranscriptProcessor;

import java.util.Objects;

/**
 * when input is empty,null or dnaStrandInput length is more than 1,this strategy will be used
 *
 * @author Ace Programmer Rbk
 *         <Rodney Kwabena Boachie at [rodney@swiftpot.com,rbk.unlimited@gmail.com]> on
 *         02-Mar-17 @ 10:24 AM
 */
public class DefaultDnaStrategy implements DnaStrategy {
    final static String EMPTY_STRING = "";

    @Override
    public String getRnaTranscription(@Nullable String dnaStrandInput) {
        if (Objects.isNull(dnaStrandInput)) {
            return EMPTY_STRING;
        } else if (dnaStrandInput.length() > 1) {
            return this.getRnaTranscriptionWhenDnaStrandInputLengthIsGreaterThanOne(dnaStrandInput);
        } else
            return EMPTY_STRING;
    }

    protected String getRnaTranscriptionWhenDnaStrandInputLengthIsGreaterThanOne(String dnaStrandInput) {
        String finalRnaTranscription = "";
        char[] characters = dnaStrandInput.toCharArray();
        for (char character : characters) {
            String characterString = String.valueOf(character);
            RnaTranscriptProcessor rnaTranscriptProcessor = new RnaTranscriptProcessor();
            finalRnaTranscription += rnaTranscriptProcessor.getRnaTranscript(characterString);
        }
        return finalRnaTranscription;
    }
}
