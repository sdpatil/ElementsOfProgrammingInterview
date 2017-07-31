package com.eip.chapter7;

import java.math.BigInteger;
import java.util.Random;

/**
 * Created by sunilpatil on 3/13/17.
 */
public class RabinKarpSubString {

    public static class RabinKarp{
        private String pattern;
        private long patHash;
        private int m;
        private long q;
        private int R;
        private long RM;

        public RabinKarp(String pat){
            this.pattern = pattern;
            this.R = 256;
            m = pattern.length();
            q = longRandomPrime();
            RM =1;
            for(int i = 0 ; i <= m-1; i++){
                RM = (R*RM) %q;
            }
            patHash = hash(pattern,m);
        }
        private long hash(String key, int m){
            long h = 0 ;
            for(int j = 0 ; j < m ; j++)
                h = (R * h + key.charAt(j))%q;
            return h;
        }
        private static long longRandomPrime() {
            BigInteger prime = BigInteger.probablePrime(31, new Random());
            return prime.longValue();
        }
        public int search(String txt){
            int n = txt.length();
            if ( n < m)
                return n;
            long txtHash = hash(txt,m);
            if( (patHash == txtHash) && check(txt,0) )
                return 0;

            for(int i = m; i < n ; i++){
                // Remove leading digit, add trailing digit, check for match.
                txtHash = (txtHash + q - RM*txt.charAt(i-m) % q) % q;
                txtHash = (txtHash*R + txt.charAt(i)) % q;

                int offset = i -m +1;
                if ((patHash == txtHash) && check(txt, offset))
                    return offset;
            }
            return n;
        }

        private boolean check(String txt, int i) {
            for (int j = 0; j < m; j++)
                if (pattern.charAt(j) != txt.charAt(i + j))
                    return false;
            return true;
        }
    }

}
