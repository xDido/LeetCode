class Solution {
    public int search(int[] nums, int target) {
        List<Integer> list=new ArrayList<>();
        for(int n:nums)
            list.add(n);
        if(list.contains(target))
        {
            System.gc();
            return list.indexOf(target);
        }
        System.gc();
        return -1;
    }
}