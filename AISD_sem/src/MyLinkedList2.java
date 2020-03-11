//TODO решить проблему с дивайдом
//TODO сделать метод нью лист

public class MyLinkedList2 {
    Element head;

    public MyLinkedList2() {
        head = null;
    }

    private void add(int k) {
        Element nElem = new Element(k, null, head);
        head = nElem;
    }

    public MyLinkedList2(MyLinkedList2 mll) {
        if (!mll.isEmpty()) {
            Element cur = mll.head;
            insert(cur.getData());
            while (cur.hasNext()) {
                cur = cur.getNext();
                insert(cur.getData());
            }
        } else new MyLinkedList2();
    }

    private void arrayMerge(int[] array, int left, int mid, int right) {
        int lengthLeft = mid - left + 1;
        int lengthRight = right - mid;
        int leftArray[] = new int [lengthLeft];
        int rightArray[] = new int [lengthRight];
        for (int i = 0; i < lengthLeft; i++)
            leftArray[i] = array[left+i];
        for (int i = 0; i < lengthRight; i++)
            rightArray[i] = array[mid+i+1];
        int leftIndex = 0;
        int rightIndex = 0;
        for (int i = left; i < right + 1; i++) {
            if (leftIndex < lengthLeft && rightIndex < lengthRight) {
                if (leftArray[leftIndex] < rightArray[rightIndex]) {
                    array[i] = leftArray[leftIndex];
                    leftIndex++;
                }
                else {
                    array[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            }
            else if (leftIndex < lengthLeft) {
                array[i] = leftArray[leftIndex];
                leftIndex++;
            }
            else if (rightIndex < lengthRight) {
                array[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }
    }

    private void mergeSort(int [] array, int left, int right) {
        if (right <= left) return;
        int mid = (left + right) / 2;
        mergeSort(array, left, mid);
        mergeSort(array, mid+1, right);
        arrayMerge(array, left, mid, right);
    }

    public MyLinkedList2(int[] arr) {
        mergeSort(arr, 0, arr.length-1);
        for (int i = arr.length-1; i >= 0; i--) {
            add(arr[i]);
        }
    }

    public void print() {
        if (head == null) {
            System.out.print("[]");
        } else {
            System.out.print("[" + head.getData());
            Element elem = head;
            while (elem.hasNext()) {
                elem = elem.getNext();
                System.out.print("," + elem.getData());
            }
            System.out.print("]");
        }
    }

    public void println() {
        print();
        System.out.println("");
    }

    public boolean isEmpty() {
        if (head == null) return true;
        else return false;
    }

    public void insert(int k) {
        if (!isEmpty()) {
            if (head.getData() >= k) {
                add(k);
            } else {
                Element cur = head;
                while (cur.hasNext() && cur.getNext().getData() < k) {
                    cur = cur.getNext();
                }
                if (cur.hasNext()) {
                    Element cur2 = cur.getNext();
                    Element nElem = new Element(k, cur, cur2);
                    cur.setNext(nElem);
                    cur2.setPrev(nElem);
                } else {
                    cur.setNext(new Element(k, cur, null));
                }
            }
        } else {
            add(k);
        }
    }

    public void delete(int k) {
        if (!isEmpty()) {
            if (head.getData() == k) {
                if (head.hasNext()) {
                    head = head.getNext();
                } else {
                    head = null;
                }
            } else if (head.getData() > k) {
                System.out.println("Not found");
            } else if(!head.hasNext()) {
                System.out.println("Not found");
            } else {
                Element cur = head.getNext();
                boolean pred = true;
                while (cur.hasNext() && pred) {
                    if (cur.getData() == k) {
                            if (cur.hasNext()) {
                                cur = cur.getPrev();
                                cur.setNext(cur.getNext().getNext());
                                pred = false;
                            } else {
                                cur = cur.getPrev();
                                cur.setNext(null);
                                pred = false;
                            }
                    } else if (cur.getData() > k) {
                        break;
                    }
                    cur = cur.getNext();
                }
                if (cur.getData() == k) {
                    cur = cur.getPrev();
                    cur.setNext(null);
                } else
                System.out.println("Not found");
            }
        }
    }

    public MyLinkedList2 merge(MyLinkedList2 mll) {
            MyLinkedList2 nList = new MyLinkedList2(mll);
            Element cur = head;
            nList.insert(cur.getData());
            while (cur.hasNext()) {
                cur = cur.getNext();
                nList.insert(cur.getData());
            }
        return nList;
    }

    public int maxNum() {
        if (head != null) {
            Element cur = head;
            int curValue = head.getData();
            int count = 1;
            int max = 1;
            while (cur.hasNext()) {
                cur = cur.getNext();
                if (cur.getData()==curValue) {
                    count++;
                    if (count > max) {
                        max = count;
                    }
                } else {
                    curValue = cur.getData();
                    count = 1;
                }
            }
            return max;
        } else return 0;
    }

    public MyLinkedList2[] divide() {
        if (isEmpty()) {
            MyLinkedList2[] mas = {null, null};
            return mas;
        } else {
            Element cur = head;
            MyLinkedList2[] mas = new MyLinkedList2[2];
            mas[0] = new MyLinkedList2();
            mas[1] = new MyLinkedList2();
            if ((cur.getData() % 3) == 0) {
                mas[0].insert(cur.getData());
            } else {
                mas[1].insert(cur.getData());
            }
            while (cur.hasNext()) {
                cur = cur.getNext();
                if ((cur.getData() % 3) == 0) {
                    mas[0].insert(cur.getData());
                } else {
                    mas[1].insert(cur.getData());
                }
            }
            return mas;
        }
    }

    public Element getLast() {
        if (!isEmpty()) {
            Element cur = head;
            while (cur.hasNext()) {
                cur = cur.getNext();
            }
            return cur;
        } else return null;
    }

    public int length() {
        if (isEmpty()) {
            return 0;
        } else {
            Element cur = head;
            int length = 1;
            while (cur.hasNext()) {
                length++;
                cur = cur.getNext();
            }
            return length;
        }
    }

    public MyLinkedList2 newList() {
        if (isEmpty()) {
            return new MyLinkedList2();
        } else {
            MyLinkedList2 nList = new MyLinkedList2();
            Element cur = getLast();
            Element cur2 = head;
            nList.insert(cur2.getData()*cur.getData());
            while (cur.hasPrev()) {
                cur = cur.getPrev();
                cur2 = cur2.getNext();
                nList.insert(cur2.getData()*cur.getData());
            }
            return nList;
        }
    }

    public MyLinkedList2 newList2() {
        if (isEmpty()) {
            return new MyLinkedList2();
        } else {
            MyLinkedList2 nList = new MyLinkedList2();
            Element cur = getLast();
            Element cur2 = head;
            nList.insert(cur2.getData()*cur.getData());
            for (int i = 0; i < (length()-1)/2; i++) {
                cur = cur.getPrev();
                cur2 = cur2.getNext();
                nList.insert(cur2.getData()*cur.getData());
            }
            return nList;
        }
    }
}
