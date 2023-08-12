//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            char[] nuts = new char[n], bolts = new char[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                nuts[i] = (inputLine[i].charAt(0));
            }
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                bolts[i] = (inputLine[i].charAt(0));
            }

            new Solution().matchPairs(nuts, bolts, n);
            for (int i = 0; i < n; i++) {
                System.out.print(nuts[i] + " ");
            }
            System.out.println();
            for (int i = 0; i < n; i++) {
                System.out.print(bolts[i] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java



class Solution {
    void matchPairs(char nuts[], char bolts[], int n) {
        // code here
        // Arrays.sort(nuts);
        // Arrays.sort(bolts);
        char[] order = {'!','#', '$', '%', '&', '*', '@','^','~'};
        HashMap<Character,Integer> hm = new HashMap<>();
        
        for(int i = 0;i<n;i++){
            hm.put(nuts[i],1);
        }
        
        int ind = 0;
        
        for(int i = 0;i<order.length;i++){
            
            if(hm.containsKey(order[i])){
                nuts[ind] = order[i];
                ind++;
            }
            
        }
        
        ind = 0;
        for(int i = 0;i<order.length;i++){
            
            if(hm.containsKey(order[i])){
                bolts[ind] = order[i];
                ind++;
            }
            
        }
        
        
        
    }
    
}