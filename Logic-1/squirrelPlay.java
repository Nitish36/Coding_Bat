public boolean squirrelPlay(int temp, boolean isSummer) {
  if(temp>=60 && temp<=90 && isSummer==false)
  {return true;}
  if(temp>=60 && temp<=90 && isSummer==true)
  {return true;}
  if(temp>100 && isSummer==false)
  {return false;}
  if(temp>90 && temp<=100 && isSummer==true)
  {return true;}
  return false;
}
