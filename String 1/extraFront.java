public String extraFront(String str) {
  if(str.length()==0)
    return "";
  if(str.length()==1 || str.length()==2)
    return str+str+str;
  
  return str.substring(0,2)+str.substring(0,2)+str.substring(0,2);
}
