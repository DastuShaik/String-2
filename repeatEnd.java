
public String repeatEnd(String str, int n) {
  int k=str.length();
  String s="";
  String ss=str.substring(k-n);
 
    while(n>0)
    {
      s=s+ss;
      n--;
    }
  return s;
}
