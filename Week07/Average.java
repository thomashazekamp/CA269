public class Average {
    /* Author: Thomas Hazekamp
    * Date : 23/02/2022
    * Description: Taking an array of Shapes and returning the average area
    */

    public static double averageArea(Shape [] shapes) {
        double average = 0;
        int count = 0

        for(Shape shape: shapes) {
            average += shape.area();
            count++;
        }
        return average / count;
    }
}