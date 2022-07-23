public boolean firstLast6(int[] nums) {
  int n=nums.length;
  if(nums[0]==6 ||  nums[n-1]==6)
  {
    return true;
  }
  else
  {
    return false;
  }
}
