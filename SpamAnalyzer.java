public class SpamAnalyzer extends KeywordAnalyzer implements TextAnalyzer {
    private String[] keywords;

    SpamAnalyzer(String[] kwords) {
        keywords = new String[kwords.length];
    }

    @Override
    protected String[] getKeywords() {
        return new String[0];
    }

    @Override
    protected Label getLabel() {
        return null;
    }

    @Override
    public Label processText(String text) {
        return null;
    }
}
