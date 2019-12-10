public class NegativeTextAnalyzer extends KeywordAnalyzer implements TextAnalyzer {
    private Label negativeLabel;

    @Override
    protected String[] getKeywords() {
        return new String[0];
    }

    @Override
    protected Label getLabel() {
        return negativeLabel;
    }

    @Override
    public Label processText(String text) {
        return null;
    }
}
