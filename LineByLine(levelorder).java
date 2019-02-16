//level order traversal line by line using queue
class Main
{
    void levelOrder_LineByLine(Node node) 
    {
        Queue<Node> q = new LinkedList<Node>();
        q.add(node);
        while(true){
            int count = q.size();
            if(count == 0)
                break;
            while(count > 0){
                Node temp = q.poll();
                System.out.print(temp.data+" ");
                if(temp.left != null)
                    q.add(temp.left);
                if(temp.right != null)
                    q.add(temp.right);
                    count--;
            }
            System.out.print("$"+" ");
        }
    }
}
