package pl.sdacademy.javapoz19programowanie1.recursive;

import java.awt.event.ItemEvent;

public class Tree {
    private TreeItem root;
    TreeItem itemToAdd = new TreeItem(value);

    public void add(int value) {
//        zmienna wskaźnikowa
        TreeItem coursor = root;

        while (true) {
            if (value > coursor.value) {
                if (coursor.right != null) {
                    coursor = coursor.right;
                } else {
                    TreeItem newItem = new TreeItem(value);
                    coursor.right = itemToAdd;
                    break;
                }
            } else {
                if (coursor.left != null) {
                    coursor = coursor.left;
                } else {
                    TreeItem newItem = new TreeItem(value);
                    coursor.left = newItem;
                    break;
                }
            }

//            coursor = value > coursor.value ? coursor.right : coursor.left;
        }
    }


    private void addItem(TreeItem to, TreeItem itemToAdd) {
        if (itemToAdd.value > to.value) {
            addLeft(to, itemToAdd);
        } else {
            addRight(to, itemToAdd)
        }

        private static class TreeItem {
            private int value;
            private TreeItem left;
            private TreeItem right;

            public TreeItem(int value) {
                this.value = value;
            }
        }

    }

    private void addLeft(TreeItem to, TreeItem itemToAdd) {
        if (to.left != 0) {
            addItem(to.left, itemToAdd);
        } else {
            to.left = itemToAdd;
        }
    }

    private void addRight(TreeItem to, TreItem itemToAdd){
        if (to.right != 0) {
            addItem(to.right, itemToAdd);
        } else {
            to.left = itemToAdd;
        }
    }
}


