public String without2(String str) {
  if(str.length()==1)
    return str;
  if(str.length()==2 || str.equals(""))
    return "";
  
  String sub = str.substring(0,2);
  
  if(str.startsWith(sub)==true && str.endsWith(sub) == true)
    return str.substring(2,str.length());
  
  return str;
}
