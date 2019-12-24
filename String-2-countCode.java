public int countCode(String str) {
  int n=str.length();
  int c=0;
  for(int i=0;i<n-3;i++)
  {
    if(str.charAt(i)=='c' && str.charAt(i+1)=='o' && str.charAt(i+3)=='e')
    {
      c++;
    }
  }
  return c;
}
