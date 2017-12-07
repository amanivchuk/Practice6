package ua.nure.manivchuk.Practice6.Part5;

/**
 * Created by nec on 06.12.17.
 */
public class Tree<E extends Comparable> {

    private Node<E> root;

    public Tree() {
        this.root = null;
    }

    public boolean add(E element){
        Node<E> newNode = new Node<E>();
        newNode.value = element;

        if(root == null){
            root = newNode;
            return true;
        }

        Node<E> current = root;
        Node<E> parent = null;

        while(true){
            parent = current;
            if(element.compareTo(current.value) == -1){
                current = current.left;
                if(current == null){
                    parent.left = newNode;
                    return true;
                }
            }else if(element.compareTo(current.value) == 1){
                current = current.right;
                if(current == null){
                    parent.right = newNode;
                    return true;
                }
            }else {
                return false;
            }
        }
    }

    public void add(E[] elements){
        for(E e : elements){
            add(e);
        }
    }

    public boolean remove(E element){
        if(root == null){
            throw new IllegalArgumentException("Tree is empty.");
        }

        Node<E> current = root;
        Node<E> parent = root;
        boolean isLeftChild = true;

        while (current.value.compareTo(element) != 0){
            parent = current;
            if(element.compareTo(current.value) == -1){
                isLeftChild = true;
                current = current.left;
            }else{
                isLeftChild = false;
                current = current.right;
            }
            if(current == null){
                return false;
            }
        }

        if(current.left == null && current.right == null){
            if(current.value == root.value){
                root = null;
            }else if(isLeftChild){
                parent.left = null;
            }else{
                parent.right = null;
            }
        }else if(current.right == null){
            if(current.value == root.value){
                root = current.left;
            }else if(isLeftChild){
                parent.left = current.left;
            }else{
                parent.right = current.left;
            }
        }else if(current.left == null){
            if(current.value == root.value){
                root = current.right;
            }else if (isLeftChild){
                parent.left = current.right;
            }else{
                parent.right = current.right;
            }
        }else{
            Node<E> successor = getSuccessor(current);
            if(current.value == root.value){
                root = successor;
            }else if(isLeftChild){
                parent.left = successor;
            }else {
                parent.right = successor;
            }
            successor.left = current.left;
        }
        return true;
    }

    private Node<E> getSuccessor(Node<E> node){
        Node<E> successorParent = node;
        Node<E> successor = node;
        Node<E> current = node.right;

        while (current != null){
            successorParent = successor;
            successor = current;
            current = current.left;
        }
        if(successor.value != node.right.value){
            successorParent.left = successor.right;
            successor.right = node.right;
        }
        return successor;
    }

    public void print(){
        printOrder(root);
    }

    private void printOrder(Node<E> node) {
        if(node != null){
            printOrder(node.left);
            printNode(node);
            printOrder(node.right);
        }
    }

    private void printNode(Node<E> node) {
        if(node.value == root.value){
            System.out.println(node.value);
            return;
        }else{
            System.out.print(" ");
        }
        System.out.print("  ");

        if(node.left != null || node.right != null){
            System.out.println(node.value);
            return;
        }else{
            System.out.print(" ");
        }
        System.out.print("  ");
        System.out.println(node.value);
    }


    public static class Node<E extends Comparable>{
        private E value;
        private Node<E> left;
        private Node<E> right;



        @Override
        public String toString() {
            return String.valueOf(value);
        }

        /*public boolean add(Node node){
            if(node.value.compareTo(value) > 0 && right == null){
                right = node;
                return true;
            } else if(node.value.compareTo(value) > 0 && right != null){
                return right.add(node);
            } else if(node.value.compareTo(value) < 0 && left == null){
                left = node;
                return false;
            } else {
                return left.add(node);
            }
        }*/
    }
}
