import java.util.*;

class Solution {
    public long solution(int cap, int n, int[] deliveries, int[] pickups) {
        long answer = 0;

        int deliveryLeft = n - 1;
        int pickupLeft = n - 1;
        
        while (deliveryLeft >= 0 || pickupLeft >= 0) {
            int distance = 0;
            while (deliveryLeft >= 0 && deliveries[deliveryLeft] == 0) {
                deliveryLeft--;
            }
            while (pickupLeft >= 0 && pickups[pickupLeft] == 0) {
                pickupLeft--;
            }
            distance = Math.max(deliveryLeft, pickupLeft) + 1;

            answer += distance * 2;

            int remainingCap = cap;

            while (deliveryLeft >= 0 && remainingCap > 0) {
                if (deliveries[deliveryLeft] <= remainingCap) {
                    remainingCap -= deliveries[deliveryLeft];
                    deliveries[deliveryLeft] = 0;
                    deliveryLeft--;
                } else {
                    deliveries[deliveryLeft] -= remainingCap;
                    remainingCap = 0;
                }
            }

            remainingCap = cap;
            while (pickupLeft >= 0 && remainingCap > 0) {
                if (pickups[pickupLeft] <= remainingCap) {
                    remainingCap -= pickups[pickupLeft];
                    pickups[pickupLeft] = 0;
                    pickupLeft--;
                } else {
                    pickups[pickupLeft] -= remainingCap;
                    remainingCap = 0;
                }
            }
        }
        
        return answer;
    }
}