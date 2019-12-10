public class TooLongTextAnalyzer implements TextAnalyzer {
    private int maxLength;

    TooLongTextAnalyzer(int max) {
        maxLength = max;
    }

    @Override
    public Label processText(String text) {
        if (text.length() >= maxLength) {
            return Label.TOO_LONG;
        } else {
            return Label.OK;
        }
    }
}
