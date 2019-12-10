public class TooLongTextAnalyzer implements TextAnalyzer {
    private int maxLength;

    TooLongTextAnalyzer(int max) {
        maxLength = max;
    }

    @Override
    public Label processText(String text) {
        if (text.length() >= maxLength) {
            System.out.println("too_long");
            return Label.TOO_LONG;
        } else {
            System.out.println("long_ok");
            return Label.OK;
        }
    }
}
