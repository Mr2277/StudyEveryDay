package liu;

public class 航班 {
    public static int[] corpFlightBookings(int[][] bookings, int n) {
        int[] result = new int[n]; //为每一个航班初始化计数

        for (int[] booking : bookings) { //遍历航班bookings
            int start = booking[0]; //航班（from）
            int end = booking[1]; //航班（to）
            int count = booking[2]; //航班预订数
            while (start <= end) {
                result[start - 1] += count; //由于航班是从1开始，而结果数组下标是从0开始，所以下标减1
                start++;
            }
        }
        return result;
    }
    public static void main(String[] args){
        int[][] bookings=new int [][] {{1,2,10},{2,3,20},{2,5,25}};
        for(int[] booking:bookings){

        }
    }
}
