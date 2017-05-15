package eu.sig.training.ch03.binarytree;

public class BinaryTreeSearch {

    // tag::calculateDepth[]
    public static int calculateDepth(BinaryTreeNode<Integer> node, int nodeValue) {
        int depth = 0;
        if (node.getValue() == nodeValue) {
            return depth;
        } else {
            if (nodeValue < node.getValue()) {
                BinaryTreeNode<Integer> left = node.getLeft();
//                if (left == null) {
//                    throw new TreeException("Value not found in tree!");
//                } else {
//                    return 1 + calculateDepth(left, nodeValue);
//                }
                return calculate(left, nodeValue);
            } else {
                BinaryTreeNode<Integer> right = node.getRight();
//                if (right == null) {
//                    throw new TreeException("Value not found in tree!");
//                } else {
//                    return 1 + calculateDepth(right, nodeValue);
//                }
                return calculate(right, nodeValue);
            }
        }
    }
    // end::calculateDepth[]
    public static int calculate(BinaryTreeNode<Integer> node, int nodeValue) throws TreeException{
    	if(node == null){
    		throw new TreeException("Value not found in tree!");
    	} else {
    		return 1 + calculateDepth(node, nodeValue);
    	}
    }
}