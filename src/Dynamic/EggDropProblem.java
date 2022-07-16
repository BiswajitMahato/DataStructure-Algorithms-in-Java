package Dynamic;

//There are n number of eggs and building which has k floors.
// Write an algorithm to find the minimum number of drops is required to know the floor from which if egg is dropped, it will break.
public class EggDropProblem {

    public int getDrops(int eggs, int floors){
        //base case 1:
        //if floors = 0 then no drops are required OR floors = 1 then 1 drop is required
        if(floors==0 || floors==1)
            return floors;

        //base case 2:
        //if only one egg is there then drops = floors
        if(eggs==1)
            return floors;

        int minimumDrops=Integer.MAX_VALUE, tempResult;
        //check dropping from all the floors 1 to floors and pick the minimum among those.
        //for every drop there are 2 scenarios - a) either egg will break b) egg will not break
        for (int i = 1; i <=floors ; i++) {
            //for the worst case pick the maximum among a) and b)
            tempResult = Math.max(getDrops(eggs-1,i-1), getDrops(eggs, floors-i));
            minimumDrops = Math.min(tempResult,minimumDrops);
        }
        return minimumDrops + 1;
    }

    public static void main(String[] args) {
        EggDropProblem eggDropRecursion = new EggDropProblem();
        int eggs = 2;
        int floors = 10;
        System.out.printf("(Recursion) Minimum number of drops required in worst case with eggs: " + eggs + " and floors:" + floors + " is: " + eggDropRecursion.getDrops(eggs,floors));
    }


}
