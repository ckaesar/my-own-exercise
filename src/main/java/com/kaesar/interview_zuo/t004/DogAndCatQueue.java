package com.kaesar.interview_zuo.t004;

/**
 * 自己的
 */
public class DogAndCatQueue {

  private DogAndCatNode dogAndCatNode;
  private int allCounts;
  private int dogCounts;
  private int catCounts;

  public DogAndCatQueue() {
    dogAndCatNode = new DogAndCatNode(null);
  }

  public void add(Pet pet) {
    if ("dog".equals(pet.getPetType())) {
      dogCounts++;
    } else if ("cat".equals(pet.getPetType())) {
      catCounts++;
    }
    allCounts++;

    if (dogAndCatNode.getFirst() == null) {
      dogAndCatNode.setFirst(pet);
    } else {
      DogAndCatNode cur = dogAndCatNode;
      while (cur.getNext() != null) {
        cur = cur.getNext();
      }
      cur.setNext(new DogAndCatNode(pet));
    }
  }

  public Pet pollAll() {
    if (dogAndCatNode.getFirst() == null) {
      throw new RuntimeException("没有猫或狗");
    }
    Pet first = dogAndCatNode.getFirst();
    allCounts--;
    if ("dog".equals(first.getPetType())) {
      dogCounts--;
    } else if ("cat".equals(first.getPetType())) {
      catCounts--;
    }
    dogAndCatNode.setFirst(dogAndCatNode.getNext().getFirst());
    dogAndCatNode.setNext(dogAndCatNode.getNext().getNext());
    return first;
  }

  public Pet pollDog() {
    if (allCounts == 0 || dogCounts == 0) {
      throw new RuntimeException("没有狗狗");
    }
    allCounts--;
    dogCounts--;
    DogAndCatNode curNode = dogAndCatNode;
    while (curNode != null) {
      Pet cur = curNode.getFirst();
      if ("dog".equals(cur.getPetType())) {
        curNode.setFirst(curNode.getNext().getFirst());
        curNode.setNext(curNode.getNext().getNext());
        break;
      } else {
        curNode = curNode.getNext();
      }
    }
    return new Pet("dog");
  }

  public Pet pollCat() {
    if (allCounts == 0 || catCounts == 0) {
      throw new RuntimeException("没有猫猫");
    }
    allCounts--;
    catCounts--;
    DogAndCatNode curNode = dogAndCatNode;
    while (curNode != null) {
      Pet cur = curNode.getFirst();
      if ("cat".equals(cur.getPetType())) {
        curNode.setFirst(curNode.getNext().getFirst());
        curNode.setNext(curNode.getNext().getNext());
        break;
      } else {
        curNode = curNode.getNext();
      }
    }
    return new Pet("cat");
  }

  public boolean isEmpty() {
    return allCounts == 0;
  }

  public boolean isDogEmpty() {
    return dogCounts == 0;
  }

  public boolean isCatEmpty() {
    return catCounts == 0;
  }

  public static void main(String[] args) {
    DogAndCatQueue queue = new DogAndCatQueue();
    queue.add(new Dog());
    queue.add(new Cat());
    queue.add(new Cat());
    queue.add(new Dog());
    queue.add(new Cat());
    queue.add(new Cat());
    System.out.println(queue.isEmpty());
    System.out.println(queue.isDogEmpty());
    System.out.println(queue.isCatEmpty());
    System.out.println("pollAll-" + queue.pollAll().getPetType());
    System.out.println("pollCat-" + queue.pollCat().getPetType());
    System.out.println("pollDog-" + queue.pollDog().getPetType());

    System.out.println(queue.isEmpty());
    System.out.println(queue.isDogEmpty());
    System.out.println(queue.isCatEmpty());
  }

}
