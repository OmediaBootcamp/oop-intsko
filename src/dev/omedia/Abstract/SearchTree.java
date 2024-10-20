package dev.omedia.Abstract;

public class SearchTree implements NodeList {

    private ListItem root = null;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    public ListItem getRoot() {
        return this.root;
    }

    public boolean addItem(ListItem newItem) {
        if (this.root == null) {
            this.root = newItem;
            return true;
        }

        ListItem currentItem = this.root;
        while (true) {
            int comparison = currentItem.compareTo(newItem);
            if (comparison < 0) {
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    currentItem.setNext(newItem);
                    return true;
                }
            } else if (comparison > 0) {
                if (currentItem.previous() != null) {
                    currentItem = currentItem.previous();
                } else {
                    currentItem.setPrevious(newItem);
                    return true;
                }
            } else {
                return false;
            }
        }
    }

    public boolean removeItem(ListItem item) {
        if (item != null) {
            System.out.println("Deleting item " + item.getValue());
            ListItem currentItem = this.root;
            ListItem parentItem = currentItem;

            while (currentItem != null) {
                int comparison = currentItem.compareTo(item);
                if (comparison < 0) {
                    parentItem = currentItem;
                    currentItem = currentItem.next();
                } else if (comparison > 0) {
                    parentItem = currentItem;
                    currentItem = currentItem.previous();
                } else {
                    performRemoval(currentItem, parentItem);
                    return true;
                }
            }
        }
        return false;
    }

    private void performRemoval(ListItem item, ListItem parent) {
        // Case 1: No children
        if (item.next() == null && item.previous() == null) {
            if (parent.next() == item) {
                parent.setNext(null);
            } else if (parent.previous() == item) {
                parent.setPrevious(null);
            } else {
                this.root = null;
            }
        }
        // Case 2: One child
        else if (item.next() == null) {
            if (parent.next() == item) {
                parent.setNext(item.previous());
            } else if (parent.previous() == item) {
                parent.setPrevious(item.previous());
            } else {
                this.root = item.previous();
            }
        } else if (item.previous() == null) {
            if (parent.next() == item) {
                parent.setNext(item.next());
            } else if (parent.previous() == item) {
                parent.setPrevious(item.next());
            } else {
                this.root = item.next();
            }
        }
        // Case 3: Two children
        else {
            ListItem currentItem = item.next();
            while (currentItem.previous() != null) {
                currentItem = currentItem.previous();
            }
            item.setValue(currentItem.getValue());
            performRemoval(currentItem, item);
        }
    }

    @Override
    public void traverse(ListItem root) {
        if (root != null) {
            traverse(root.previous());
            System.out.println(root.getValue());
            traverse(root.next());
        }
    }
}
