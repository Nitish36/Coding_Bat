public boolean frontAgain(String str) {
  if(str.equals("")|| str.length()==1)
    return false;
  String sub = str.substring(0,2);
  
  
  if(str.startsWith(sub) == true && str.endsWith(sub) == true)
    return true;
  
  return false;
}
