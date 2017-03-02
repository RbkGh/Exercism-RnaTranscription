package strategies;

import extra.DnaStrand;
import main.DnaStrategy;

/**
 * when input is {@link DnaStrand#THYMINE} ,this strategy will be used
 * @author Ace Programmer Rbk
 *         <Rodney Kwabena Boachie at [rodney@swiftpot.com,rbk.unlimited@gmail.com]> on
 *         02-Mar-17 @ 11:04 AM
 */
public class ThymineStrategy implements DnaStrategy {
    @Override
    public String getRnaTranscription(String dnaStrandInput) {
        return DnaStrand.ADENINE;
    }
}
