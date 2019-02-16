//reverse level order
class Main
{
	void reversePrintOf_LevelOrder(Node node) 
    {
        Stack<Node> s = new Stack<Node>();
        Queue<Node> q = new LinkedList<Node>();
        q.add(node);
    
    while(!q.isEmpty()){
        node = q.peek();
        q.remove();
        s.push(node);
        if(node.right != null)
            q.add(node.right);
        if(node.left != null)
            q.add(node.left);
        
    }
    while(!s.empty()){
        node = s.pop();
        System.out.print(node.data+" ");
        }
    }
}