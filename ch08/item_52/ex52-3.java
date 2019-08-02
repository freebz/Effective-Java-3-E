for (int i = 0; i < 3; i++) {
    set.remove(i);
    list.remove((Integer) i); // 혹은 revmoe(Integer.valueOf(i))
}
