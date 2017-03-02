package main;

import com.sun.istack.internal.Nullable;

/**
 * @author Ace Programmer Rbk
 *         <Rodney Kwabena Boachie at [rodney@swiftpot.com,rbk.unlimited@gmail.com]> on
 *         02-Mar-17 @ 10:16 AM
 */
public class RnaTranscriptProcessor {

    public String getRnaTranscript(@Nullable String dnaStrandInput) {
        DnaStrategyContext dnaStrategyContext = this.getDnaStrategyContext(dnaStrandInput);
        return dnaStrategyContext.getRnaTranscription();
    }

    private DnaStrategyContext getDnaStrategyContext(String dnaStrandInput) {
        return new DnaStrategyContext(dnaStrandInput);
    }


}
