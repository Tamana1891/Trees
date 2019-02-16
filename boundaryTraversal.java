//Boundary Traversal

class Main
{
    void printLeave(Node node){
        if(node != null){
            printLeave(node.left);
            
            if(node.left == null && node.right == null)
                System.out.print(node.data+" ");
                
            printLeave(node.right);
        }
    }
    void boundaryRight(Node node){
        if(node == null)
            return;
        else {
            if(node.right != null){
                boundaryRight(node.right);
                System.out.print(node.data+" ");
            }
            else if(node.left != null){
                boundaryRight(node.left);
                System.out.print(node.data+" ");
            }
        }
    }
    void boundaryLeft(Node node){
        if(node == null)
            return;
        else{
            if(node.left != null){
                System.out.print(node.data+" ");
                boundaryLeft(node.left);
            }
            else if(node.right != null){
                System.out.print(node.data+" ");
                boundaryLeft(node.right);
            }
        }
    }
    
	void printBoundary(Node node)
	{
        if(node == null)
            return;
        else {
            System.out.print(node.data+" ");
            boundaryLeft(node.left);
            printLeave(node.left);
            printLeave(node.right);
            boundaryRight(node.right);
        }
            
	}
}