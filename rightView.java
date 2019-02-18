class Main{
    int max  = 0;
    void printUtil(TreeNode node , int l){
        if(node ==  null)
            return ;
        if(max < l){
            System.out.print(node.data + " ");
            max  = l;
        }
        printUtil(node.right , l+1);
        printUtil(node.left , l+1);
    }
void rightView(TreeNode node) {
    printUtil(node , 1);
}
}