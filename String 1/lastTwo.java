public String lastTwo(String str) {
  if(str.length()==1)
    return str;
  if(str.equals(""))
    return "";
  String sub = str.substring(str.length()-2,str.length());
  String swapsub="";
  char ch[] = sub.toCharArray();
  for(int i=sub.length()-1;i>=0;i--)
  {
      swapsub = swapsub+ch[i];
  }
  
  if(str.endsWith(sub)==true)
    return str.substring(0,str.length()-2)+swapsub;
  
  return str;
}
