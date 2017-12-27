package ernstYoung;

public class Main {

    public static void main(String[] args) {


        String text = "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo conse" +
                "quat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint" +
                " occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

        WordFormatter wordFormatter = new WordFormatter();

        String str = wordFormatter.textFitColumn(text, 30);

        System.out.println(str); //left alignment by default

        System.out.println(wordFormatter.textRightAlign(str)); //right alignment

        System.out.println(wordFormatter.textCenterAlign(str)); //centered

    }

}


