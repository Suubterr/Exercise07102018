package DataStructures;

import java.util.ArrayList;
import java.util.List;

public class CustomTree<T> {
    private List<CustomTree<T>> children = new ArrayList<CustomTree<T>>();
    private CustomTree<T> parent = null;
    private T data = null;

    public CustomTree(T data) {
        this.data = data;
    }

    public CustomTree(T data, CustomTree<T> parent) {
        this.data = data;
        this.parent = parent;
    }

    public List<CustomTree<T>> getChildren() {
        return children;
    }

    public void setParent(CustomTree<T> parent) {
        parent.addChild(this);
        this.parent = parent;
    }

    public void addChild(T data) {
        CustomTree<T> child = new CustomTree<T>(data);
        child.setParent(this);
        this.children.add(child);
    }

    public void addChild(CustomTree<T> child) {
        child.setParent(this);
        this.children.add(child);
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isRoot() {
        return (this.parent == null);
    }

    public boolean isLeaf() {
        return this.children.size == 0;
    }

    public void removeParent() {
        this.parent = null;
    }
}