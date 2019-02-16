//diagonal traversal of a binary tree
class Main
{
    public void printUtil(TreeNode root , int x , HashMap<Integer , ArrayList<Integer>> map){
        if(root == null)
            return ;
        ArrayList<Integer> y = map.get(x);
        if(y == null){
            y = new ArrayList<>();
            y.add(root.data);
        }
        else{
            y.add(root.data);
        }
        map.put(x,y);
        printUtil(root.left,x+1,map);
        printUtil(root.right,x,map);
    }
     public void diagonalPrint(TreeNode root)
      {
           HashMap<Integer , ArrayList<Integer>> map = new HashMap<>();
           printUtil(root , 0 , map);
          for(int i=0;i<map.size();i++){
              for(int j =0;j<map.get(i).size();j++)
              System.out.print(map.get(i).get(j)+" ");
          }
      }
}