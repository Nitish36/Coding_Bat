public String conCat(String a, String b) {
  if(b.equals(""))
    return a;
  if(a.equals(""))
    return b;
  if(a.charAt(a.length()-1) == b.charAt(0))
    return a+b.substring(1,b.length());
  return a.concat(b);
}
