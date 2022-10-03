public String withouEnd2(String str) {
  if(str.length()==1 || str.equals(""))
  {
    return "";
  }
    return str.substring(1,str.length()-1);
}
