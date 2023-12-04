class Solution {
  public String largestGoodInteger(String num) {
    for (var i=9; i>=0; i--) {
      var sub = String.format("%d%d%d", i, i, i);

      if (num.contains(sub)) return sub;
    }
    return "";
  }
}
