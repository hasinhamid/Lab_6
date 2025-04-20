// Complete the subtractSummation method
public class Task5 {

    //===================================TASK#5===================================
    // This method takes only 1 parameter which is root of the given tree
    // This method returns an Integer
    // At times you may need to typeCast root.elem to Integer
    // You can use extra helper private static methods with extra params as per need
    public static Integer subtractSummation( BTNode root ){
        return  sum(root.left)- sum(root.right);
    }
    private static int sum(BTNode rt){
        if(rt==null){
            return 0;
        }
        return (int)rt.elem+(int)sum(rt.left)+(int)sum(rt.right);
    }
    //============================================================================

}