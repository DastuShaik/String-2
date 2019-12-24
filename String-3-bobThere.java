public boolean bobThere(String str) {
  int n=str.length();
  int c=0;
  for(int i=0;i<n-2;i++)
  
  {
    if(str.charAt(i)=='b' && str.charAt(i+2)=='b')
    {
      c+=1;
    }
  }
if(c>0)
{
  return true;
}
else
{
  return false;
}
}
