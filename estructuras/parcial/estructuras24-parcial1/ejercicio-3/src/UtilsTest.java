package src;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.LinkedList;
import java.util.List;


public class UtilsTest
{
  @Test
  public void test0() {
      LinkedList<Integer> input = new LinkedList<Integer>();
      List<Integer> list0 = Utils.reverse(input);
      assertTrue(list0.toString().equals("[]"));
  }
    
  @Test
  public void test1() {
      LinkedList<Integer> input = new LinkedList<Integer>();
      input.add(0);
      input.add(1);
      input.add(2);
      List<Integer> list0 = Utils.reverse(input);
      assertTrue(list0.toString().equals("[2, 1, 0]"));
  }
  
@Test
  public void test2() {
      LinkedList<Integer> input = new LinkedList<Integer>();
      input.add(0);
      input.add(1);
      input.add(2);
      input.add(3);
      input.add(4);
      input.add(5);
      List<Integer> list0 = Utils.reverse(input);
      assertTrue(list0.toString().equals("[5, 4, 3, 2, 1, 0]"));
  }
  
  @Test
  public void test3() {
      LinkedList<Integer> input = new LinkedList<Integer>();
      input.add(0);
      input.add(1);
      input.add(2);
      input.add(0);
      input.add(1);
      input.add(2);
      List<Integer> list0 = Utils.reverse(input);
      assertTrue(list0.toString().equals("[2, 1, 0, 2, 1, 0]"));
  }
  
  @Test
  public void test4() {
      LinkedList<Integer> input = new LinkedList<Integer>();
    input.add(0);
      List<Integer> list0 = Utils.reverse(input);
      assertTrue(list0.toString().equals("[0]"));
  }
  
}
