public String lastChars(String a, String b) {
  if(a.length()==0 && b.length()==0)
    return "@@";
  if(b.equals(""))
    return a.substring(0,1)+"@";
  if(a.equals(""))
    return "@"+b.substring(b.length()-1,b.length());
  
  
  String c = a+b;
  return c.substring(0,1)+c.substring(c.length()-1,c.length());
}
