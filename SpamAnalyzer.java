public class SpamAnalyzer extends KeywordAnalyzer implements TextAnalyzer {
    private String[] keywords;
    private Label label;

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
        return label;
    }

    @Override
    public Label processText(String text) {
        for (int i = 0; i < getKeywords().length; i++) {
            if (text.contains(keywords[i])) {
                //System.out.println("\tspam");
                return Label.SPAM;
            }
        }
        return Label.OK;
    }
}
