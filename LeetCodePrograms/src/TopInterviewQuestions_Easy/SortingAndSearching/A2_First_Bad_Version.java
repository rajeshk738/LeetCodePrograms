package TopInterviewQuestions_Easy.SortingAndSearching;


/* The isBadVersion API is defined in the parent class VersionControl.
boolean isBadVersion(int version); */


class VersionControl{
	// isBadVersion method
}

class Solution2 extends VersionControl {
public int firstBadVersion(int n) {

int low = 1, high = n;

while(low < high){
    int mid = low + (high - low) / 2;
            
    if(isBadVersion(mid)){
        high = mid;
    }
    else{
        low = mid + 1;
    }
    
}


return low;
}

private boolean isBadVersion(int mid) {
	// TODO Auto-generated method stub
	return false;
}
}


public class A2_First_Bad_Version {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
