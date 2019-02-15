
class Main
{
    int height(Node node){
        if(node == null)
            return 0;
        else {
            int lh = height(node.left);
            int rh = height(node.right);
        if(lh > rh)
            return lh + 1;
        else
            return rh+1;
        }
    }
    
    void printLevel(Node node , int l , boolean itr){
        if(node == null)
            return;
        if(l == 1)
            System.out.print(node.data + " ");
        else if(l > 1){
            if(itr != false){
                printLevel(node.left , l-1 , itr);
                printLevel(node.right , l-1 ,itr);
            }
            else{
                printLevel(node.right , l-1 , itr);
                printLevel(node.left , l-1 , itr);
            }
        }
    }
    void printSpiral(Node node) 
      {
           // Your code here
           int h = height(node);
           boolean itr = false;
           
           for(int i=1;i<=h;i++){
               printLevel(node , i , itr);
               itr = !itr;
           }
      }
}
