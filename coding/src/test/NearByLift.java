package test;

public class NearByLift {
    protected static void main(String[] args) {
        int currentFloor = 5;
        int numOfLifts = 5;
        int NearestLift = 0;
        int[] liftFloors = {1,2,3,4,5};
        int[] lifts = new int[numOfLifts];
        int minDis = Math.abs(currentFloor-lifts[0]);
        for(int i = 1;i<numOfLifts;i++){
            int dis = Math.abs(currentFloor-lifts[0]);
//            if(dis<)

        }

    }
}
//there are n number of floors in an apparment
//i am in 5th floor
//i have 5 lifts options near me