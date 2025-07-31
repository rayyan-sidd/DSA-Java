package DSA.Strings;

public class StringBuild {
    public static void main(String[] args) {
     
        //Approach 1 - Without using StringBuilder
        String series1 = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            series1 = series1 + ch;
        }
        System.out.println(series1);
        
        
        //Approach 2 - Using StringBuilder
        StringBuilder series2 = new StringBuilder();

        for(int i=0; i<26; i++){
            char ch = (char)('a' + i);
            series2.append(ch);
        }
        System.out.println(series2.toString());
    }
}


//The issue here with approach 1 is that every time we have to append a new letter to the string (series1), we have to create a new object since strings are immutable (O(N*N)).
//Hence to solve issue like this, we use StringBuilder class.