package ernstYoung;

public class WordFormatter {


    public String textFitColumn(String textToBeFormated, int columns) {

        char[] charArray = textToBeFormated.toCharArray();

        for (int i = columns - 1; i < charArray.length; i = i + columns) {


            if (charArray[i] == ' ') {
                charArray[i] = '\n';

            } else {
                while (!(charArray[i] == ' ')) {
                    i--;
                }
                charArray[i] = '\n';
            }
        }

        return new String(charArray);
    }


    public String textCenterAlign(String textToBeCentered) {

        int lineMaxWidth = countLineMaxWidth(textToBeCentered) - 1;
        String[] linesArray = textToBeCentered.split("\n");
        char[] bufferLine;
        String result = "";
        boolean flag;

        for (int i = 0; i < linesArray.length; i++) {

            bufferLine = new char[lineMaxWidth];
            flag = false;
            int dif = lineMaxWidth - linesArray[i].length(); //number of 'spaces' in that line
            int j = 0;
            int k = bufferLine.length - 1;


            while (dif != 0) { //will insert into array ' ' alternately into the beguining and end of the array

                if (flag) {
                    bufferLine[j] = ' ';
                    flag = false;
                    j++;
                } else {
                    bufferLine[k] = ' ';
                    flag = true;
                    k--;
                }
                dif--;
            }

            for (int l = 0; l <= k - j; l++) { //insert the info in betweem the 'spaces'

                bufferLine[l + j] = linesArray[i].charAt(l);
            }
            result = result + "\n" + new String(bufferLine);

        }
        //System.out.println(result);
        return result;
    }


    public String textRightAlign(String textToBeAlign) {

        int lineMaxWidth = countLineMaxWidth(textToBeAlign) - 1; //-1 to take out '\n'
        String[] linesArray = textToBeAlign.split("\n"); //every line into an array index

        char[] bufferLine;
        String result = "";


        for (int i = 0; i < linesArray.length; i++) {

            bufferLine = new char[lineMaxWidth];

            int dif = lineMaxWidth - linesArray[i].length();

            for (int j = 0; dif != 0; j++) {

                bufferLine[j] = ' ';
                dif--;
            }

            result = result + "\n" + new String(bufferLine) + linesArray[i];
        }

        // System.out.println(result);
        return result;
    }


    public int countLineMaxWidth(String text) {
        int count = 0;
        int linesCount = 1;
        int maxWidth = 0;

        for (int i = 0; i < text.length(); i++) {

            count++;

            if (text.charAt(i) == '\n') {
                linesCount++;
                if (maxWidth <= count) {
                    maxWidth = count;
                }

                count = 0;
            }
        }
        //System.out.println("lines: " + linesCount + "\n" +"maxWidth: " + maxWidth + "\n");

        return maxWidth;
    }
}