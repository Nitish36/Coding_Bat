public String theEnd(String str, boolean front) {
  String ch;
  if(front == true)
  {
    ch = str.substring(0,1);
    return ch;
  }
  else
  {
    ch = str.substring(str.length()-1,str.length());
    return ch;
  }
  
}
