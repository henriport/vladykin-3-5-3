public class TooLongTextAnalyzer implements TextAnalyzer {
    private int maxLength;
    private Label label;

    public TooLongTextAnalyzer(int max) {
        maxLength = max;
    }

    @Override
    public Label processText(String text) {
        if (text.length() > maxLength) {
            //System.out.println("\ttoo_long");
            return Label.TOO_LONG;
        } else {
            return Label.OK;
        }
    }
}
