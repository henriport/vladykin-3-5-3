public class Stepik {
    public static void main(String[] args) {
        // инициализация анализаторов для проверки в порядке данного набора анализаторов
        String[] spamKeywords = {"spam", "bad"};
        int commentMaxLength = 10;
        /*TextAnalyzer[] textAnalyzers1 = {
                new SpamAnalyzer(spamKeywords),
                new NegativeTextAnalyzer(),
                new TooLongTextAnalyzer(commentMaxLength)
        };
        TextAnalyzer[] textAnalyzers2 = {
                new SpamAnalyzer(spamKeywords),
                new TooLongTextAnalyzer(commentMaxLength),
                new NegativeTextAnalyzer()
        };
        TextAnalyzer[] textAnalyzers3 = {
                new TooLongTextAnalyzer(commentMaxLength),
                new SpamAnalyzer(spamKeywords),
                new NegativeTextAnalyzer()
        };
        TextAnalyzer[] textAnalyzers4 = {
                new TooLongTextAnalyzer(commentMaxLength),
                new NegativeTextAnalyzer(),
                new SpamAnalyzer(spamKeywords)
        };
        TextAnalyzer[] textAnalyzers5 = {
                new NegativeTextAnalyzer(),
                new SpamAnalyzer(spamKeywords),
                new TooLongTextAnalyzer(commentMaxLength)
        };
        TextAnalyzer[] textAnalyzers6 = {
                new NegativeTextAnalyzer(),
                new TooLongTextAnalyzer(commentMaxLength),
                new SpamAnalyzer(spamKeywords)
        };*/
        TextAnalyzer[] textAnalyzers0 = {
                new SpamAnalyzer(spamKeywords),
                new NegativeTextAnalyzer(),
                new TooLongTextAnalyzer(commentMaxLength)
        };
        // тестовые комментарии
        String[] tests = new String[10];
        tests[0] = "This comment is so good.";                              // OK
        tests[1] = "This comment is so Loooooooooooooooooooooooooooong.";   // TOO_LONG
        tests[2] = "Very negative comment !!!!=(!!!!;";                     // NEGATIVE_TEXT
        tests[3] = "Very BAAAAAAAAAAAAAAAAAAAAAAAAD comment with :|;";      // NEGATIVE_TEXT + TOO_LONG
        tests[4] = "This comment is so bad....";                            // SPAM
        tests[5] = "The comment is a spam, maybeeeeeeeeeeeeeeeeeeeeee!";    // SPAM + TOO_LONG
        tests[6] = "Negative bad :( spam.";                                 // SPAM + NEGATIVE_TEXT
        tests[7] = "Very bad, very neg =(, very ..................";        // SPAM + NEGATIVE_TEXT + TOO_LONG
        tests[8] = "this is sad :(";                                        // NEGATIVE_TEXT
        tests[9] = "Это весело";                                            // OK
        //TextAnalyzer[][] textAnalyzers = {textAnalyzers1, textAnalyzers2, textAnalyzers3,
        //        textAnalyzers4, textAnalyzers5, textAnalyzers6};
        Stepik testObject = new Stepik();
        for (int i = 0; i < tests.length; i++) {
            System.out.println(i + ".check:" + tests[i]);
            System.out.println(testObject.checkLabels(textAnalyzers0, tests[i]));
        }
        /*int numberOfAnalyzer; // номер анализатора, указанный в идентификаторе textAnalyzers{№}
        int numberOfTest = 0; // номер теста, который соответствует индексу тестовых комментариев
        for (String test : tests) {
            numberOfAnalyzer = 1;
            System.out.print("test #" + numberOfTest + ": ");
            System.out.println(test);
            for (TextAnalyzer[] analyzers : textAnalyzers) {
                System.out.print(numberOfAnalyzer + ": ");
                System.out.println(testObject.checkLabels(analyzers, test));
                numberOfAnalyzer++;
            }
            numberOfTest++;
        }*/
    }

    public Label checkLabels(TextAnalyzer[] analyzers, String text) {
        Label tmpLabel = Label.OK;

        for (int i = 0; i < analyzers.length; i++) {
            tmpLabel = analyzers[i].processText(text);
            //System.out.println("tmpLabel=" + tmpLabel);
            if (tmpLabel != Label.OK) {
                //System.out.println("tmpLabel =" + tmpLabel);
                return tmpLabel;
            }
        }
        return tmpLabel;
    }
}