import java.util.*;
public class Main
{
  static int pindex = 0;
  int[] res = new int[6];

  void printPost (int[]in, int[]pre)
  {
    int len = in.length;
    int result[] = new int[len];
    int j = 0;
      HashMap < Integer, Integer > map = new HashMap < Integer, Integer > ();
    for (int i = 0; i < len; i++)
        map.put (in[i], i);

      int x = printPostUtil(in, pre, 0, len - 1, map,result,0);
      for(j=0;j<len;j++)
        System.out.print(result[j] + " ");
  }

  int printPostUtil (int[]in, int[]pre, int s, int e, HashMap <Integer,Integer> map,int[] res,int i)
  {
    if (s > e)
      return i;
    else
      {
	int index = map.get (pre[pindex++]);
	i=printPostUtil (in, pre, s, index - 1, map,res,i);
	i=printPostUtil (in, pre, index + 1, e, map,res,i);
	res[i++] = in[index];
      }
    return i;
  }

  public static void main (String ars[])
  {
    int in[] = { 4, 2, 5, 1, 3, 6 };
    int pre[] = { 1, 2, 4, 5, 3, 6 };
    Main tree = new Main ();
    tree.printPost (in, pre);
  }
}
