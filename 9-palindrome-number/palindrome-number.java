class Solution {
    public boolean isPalindrome(int x) {
      String orig=Integer.toString(x);
      String rev=new StringBuilder(orig).reverse().toString();
      return orig.equals(rev);  
    }
}