package Test;

public class Test5 {

    public static int minimumMoves(String s) {
        char[] arr = s.toCharArray();
        int moves = 0;
        int xCount = 0;
        for (int i = 0; i <arr.length ; i++) {

            if(arr[i] == 'X'){

                xCount++;
            }
            else if(arr[i] == 'O'){
                if(xCount>0 && xCount<4){
                    moves++;
                    xCount =0;
                }
                else {
                    moves = moves + (xCount - 3);
                    xCount=0;
                }

            }

        }
        if(xCount>0 && xCount<4){
            moves = moves+1;
        }
        else{
            moves = moves + (xCount - 3);

        }

        return moves;
    }

    public static void main(String[] args) {
        String s = "XXX";
        int result = minimumMoves(s);
        System.out.println("Result :"+result);
    }

}
