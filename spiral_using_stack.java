class Main
{
      void printSpiral(Node node) 
      {
          
        if(node == null)
            return ;
        Stack<Node> s1 = new Stack<Node>();
        Stack<Node> s2 = new Stack<Node>();
        
        s1.push(node);
        
        while(!s1.empty() || !s2.empty()){
            
            while(!s1.empty()){
                Node temp = s1.pop();
                System.out.print(temp.data+" ");
                if(temp.right != null)
                    s2.push(temp.right);
                if(temp.left != null)
                    s2.push(temp.left);
            }
            
            while(!s2.empty()){
                Node temp1 = s2.pop();
                System.out.print(temp1.data+" ");
                if(temp1.left != null)
                    s1.push(temp1.left);
                if(temp1.right != null)
                    s1.push(temp1.right);
            }
        }
        
      }
}
