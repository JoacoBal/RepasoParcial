package src;

import java.util.List;
import java.util.ArrayList;

public class Utils
{
 
    /**
     * @post Retorna una lista con los elementos de list en orden inverso.
     *       Por ejemplo: reverse([3,5,7]) = [7,5,3]
     */
    public static <T> List<T> reverse(List<T> list) {
        Stack<T> stack = new LinkedStack<>();
        for (T elem: list)
           stack.push(elem);
        List<T> res = new ArrayList();
        
        while (!stack.isEmpty()) {
            T elem = stack.pop();
            res.add(elem);
        }      
        return res;
    }
    
    
}
