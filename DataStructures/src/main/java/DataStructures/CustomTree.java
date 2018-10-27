package DataStructures;

import java.util.ArrayList;
import java.util.List;

public class CustomTree<T> {
    private List<CustomTree<T>> children = new ArrayList<CustomTree<T>>();
    private CustomTree<T> parent = null;
    private T treasure = null;

    public CustomTree(T treasure) {
        this.treasure = treasure;
    }

    public CustomTree(T treasure, CustomTree<T> parent) {
        this.treasure = treasure;
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

    public T getTreasure() {
        return this.treasure;
    }

    public void setTreasure(T treasure) {
        this.treasure = treasure;
    }

    public boolean isRoot() {
        return (this.parent == null);
    }

    public boolean isLeaf() {
        return this.children.isEmpty();
    }

    public void removeParent() {
        this.parent = null;
    }

}
