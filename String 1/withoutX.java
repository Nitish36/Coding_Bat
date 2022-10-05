public String withoutX(String str) {
  if(str.length()==1 && str.equals("x"))
    return "";
  if(str.startsWith("x")==true && str.endsWith("x")==true)
    return str.substring(1,str.length()-1);
  if(str.startsWith("x") == true)
    return str.substring(1,str.length());
  
  if(str.endsWith("x") == true)
    return str.substring(0,str.length()-1);
  
  
  return str;
  
}
