/**
 * Returns the element at the specified position in this list.
 *
 * <p>This method is<i>not</i> guaranteed to run in constant
 * time. In some implementations it may run in time proportional
 * to the element position.
 *
 * @param  index index of element to return; must be
 *         non-netagive and less than the size of this list
 * @return the element at the specified position in this list
 * @throws IndexOutBoundsException if the index is out of range
 *         ({@code index < 0 || index >= this.size()})
 */
E get(int index);
