public String doubleChar(String str) {
String s1="";
int n=str.length();
for(int i=0;i<n;i++)
{
  s1=s1+str.charAt(i)+str.charAt(i);
}
return s1;
}
