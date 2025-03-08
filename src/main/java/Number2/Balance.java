package Number2;

public class Balance {
    private int left =0;
    private int right =0;

    public int getLeft() {
        return left;
    }

    public int getRight() {
        return right;
    }

    public void setLeft(int left) {
        this.left += left;
    }

    public void setRight(int right) {
        this.right += right;
    }

    public void result(){
        if (left==right) {
            System.out.println("=");
        }
        else if (left>right)
        {
            System.out.println("L");
        }
        else{
            System.out.println("R");
        }

    }

}
