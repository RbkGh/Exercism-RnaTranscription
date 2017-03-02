package strategies;

import extra.DnaStrand;
import main.DnaStrategy;

/**
 * when input is {@link DnaStrand#GUANINE} ,this strategy will be used
 * @author Ace Programmer Rbk
 *         <Rodney Kwabena Boachie at [rodney@swiftpot.com,rbk.unlimited@gmail.com]> on
 *         02-Mar-17 @ 10:37 AM
 */
public class GuanineDnaStrategy implements DnaStrategy {
    @Override
    public String getRnaTranscription(String dnaStrandInput) {
        return DnaStrand.CYTOSINE;
    }
}
