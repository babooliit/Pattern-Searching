/**
 * Created by Hemant on 22-10-2016.
 */
public class Naive_pattern_searching {
    public static void main(String[] args){
        String txt = "AABAACAADAABAAABAA";
        String pat = "AABA";
        search(txt, pat);
    }

    static void search(String txt, String pat){
        int m = txt.length();
        int n = pat.length();
        for(int i=0;i<m-n+1;i++){
            int j;
            for(j=0;j<n;j++){
                if(txt.charAt(i+j) != pat.charAt(j)){
                    break;
                }
            }
            if(j == n){
                System.out.println("Pattern found at index "+i);
            }
        }
    }
}
