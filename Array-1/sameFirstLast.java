public boolean sameFirstLast(int[] nums) {
  int n=nums.length;
  if(n>0 && nums[0] == nums[n-1])
  {
    return true;
  }
  else
  {
    return false;
  }
}
