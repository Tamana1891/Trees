//vertical order traversal
class Main
{
    public void printUtil(Node root , int hd , TreeMap<Integer , ArrayList<Integer>> map){
        if(root == null)
            return ;
        ArrayList<Integer> arr = map.get(hd);
        if(arr == null){
            arr = new ArrayList<>();
            arr.add(root.data);
        }
        else
            arr.add(root.data);
        map.put(hd , arr);
        printUtil(root.left , hd-1 , map);
        printUtil(root.right , hd+1 , map);
    }
    public void verticalOrder(Node root)
    {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        TreeMap<Integer , ArrayList<Integer>> map =  new TreeMap<>();
        int hd  = 0;
        printUtil(root , hd , map);
        for (Entry<Integer, ArrayList<Integer>> entry : map.entrySet()) 
        { 
          res.add(entry.getValue(); 
        } 
        for(int i=0;i<res.size();i++)
            for(int j=0;j<res.get(i).size();j++)
                System.out.print(res.get(i).get(j)+" ");
    }
}
