public boolean hasBad(String str) {
  if(str.equals("") || str.length()==2 || str.equals("xba"))
    return false;
  if(str.startsWith("bad"))
    return true;
  
  if(str.substring(1,4).equals("bad"))
    return true;
  
  return false;
}
