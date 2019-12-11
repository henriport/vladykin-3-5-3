public class NegativeTextAnalyzer extends KeywordAnalyzer implements TextAnalyzer {

    NegativeTextAnalyzer() {

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
        if (text.contains(":(") || text.contains("=(") || text.contains(":|")) {
            System.out.println("negative");
            return Label.NEGATIVE_TEXT;
        }
        System.out.println("positive");
        return Label.OK;
    }
}
