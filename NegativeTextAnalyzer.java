public class NegativeTextAnalyzer extends KeywordAnalyzer implements TextAnalyzer {
    private Label label;

    NegativeTextAnalyzer() {

    }

    @Override
    protected String[] getKeywords() {
        return new String[0];
    }

    @Override
    protected Label getLabel() {
        return label;
    }

    @Override
    public Label processText(String text) {
        if (text.contains(":(") || text.contains("=(") || text.contains(":|")) {
            //System.out.println("\tnegative");
            return Label.NEGATIVE_TEXT;
        }
        return Label.OK;
    }
}
