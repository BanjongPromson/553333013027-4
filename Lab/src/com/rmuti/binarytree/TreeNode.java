package com.rmuti.binarytree;

public class TreeNode {

    protected int item;
    protected TreeNode lChild;
    protected TreeNode rChild;

    TreeNode() {  
    }

    TreeNode(int newItem) {
        item = newItem;
        lChild = null;
        rChild = null;
    }

    public TreeNode(final int newItem, final TreeNode newlChild, final TreeNode newrChild) {
        item = newItem;
        lChild = newlChild;
        rChild = newrChild;
    }
}

