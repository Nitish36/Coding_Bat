public String atFirst(String str) {
  if(str.equals(""))
    return "@@";
  if(str.length()==1)
    return str+"@";
  if(str.length()==2)
    return str;
  
  return str.substring(0,2);
}
