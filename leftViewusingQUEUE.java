//left view using queue
class Main
{
    void printUtil(Node root , Queue<Node> q){
        if(root == null)
            return ;
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node temp = q.peek();
            if(temp != null){
                System.out.print(temp.data+" ");
                while(q.peek()!=null){
                    if(temp.left != null)
                        q.add(temp.left);
                    if(temp.right != null)
                        q.add(temp.right);
                    q.poll();
                    temp = q.peek();
                }
                q.add(null);
            }
            q.poll();
        }
    }
    void leftView(Node root)
    {
      
      Queue<Node> q = new LinkedList<Node>();
      printUtil(root , q);
    }
}