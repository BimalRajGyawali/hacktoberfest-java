/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l=1;
        int  r = n,ans=-1;
        while(l<=r){
            int mid = l + (r-l)/2;//to calculate mid
            if(isBadVersion(mid)) {
                ans = mid ;
                r = mid-1;
            }
            else  l = mid + 1;
           
        }
         return ans;
    }
}
