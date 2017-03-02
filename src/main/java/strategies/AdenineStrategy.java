package strategies;

import extra.DnaStrand;
import extra.RnaStrand;
import main.DnaStrategy;

/**
 * When input is {@link DnaStrand#ADENINE} ,this strategy will be used
 * @author Ace Programmer Rbk
 *         <Rodney Kwabena Boachie at [rodney@swiftpot.com,rbk.unlimited@gmail.com]> on
 *         02-Mar-17 @ 11:12 AM
 */
public class AdenineStrategy implements DnaStrategy {
    @Override
    public String getRnaTranscription(String dnaStrandInput) {
        return RnaStrand.URACIL;
    }
}
