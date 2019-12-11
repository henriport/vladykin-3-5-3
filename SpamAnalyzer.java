public class SpamAnalyzer extends KeywordAnalyzer implements TextAnalyzer {
    private String[] keywords;

    SpamAnalyzer(String[] kwords) {
        keywords = new String[kwords.length];
        for (int i = 0; i < kwords.length; i++) {
            keywords[i] = kwords[i];
        }
    }

    @Override
    protected String[] getKeywords() {
        return keywords;
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
