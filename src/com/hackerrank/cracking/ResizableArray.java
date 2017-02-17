package com.hackerrank.cracking;

public class ResizableArray {
	private int capacity = 10;
	private int[] items = new int[capacity];
	private int size = 0;
	
	public void add(int element){
		ensureExtraCapacity();
		items[size] = element;
		size++;
	}
	
	public void remove(int index){
		
	}
	
	public int size(){
		return size;
	}
	
	public void set(int index, int element){
		if(!(index >= 0 && index < size)){
			throw new ArrayIndexOutOfBoundsException(index);
		}
		items[index] = element;
		
	}
	
	public void append(int element){
		ensureExtraCapacity();
		items[size] = element;
		size++;

	}
	
	public Boolean isEmpty(){
		return size == 0;
	}
	
	public void setCapacity(int cap){
		this.capacity = cap;
	}
	
	public int get(int index){
		if(!(index >= 0 && index < size)){
			throw new ArrayIndexOutOfBoundsException(index);
		}
		return items[index];
	}
	
	private void ensureExtraCapacity(){
		if(size == capacity){
			int[] temp = new int[capacity * 2];
			System.arraycopy(items, 0, temp, 0, size);
			items = temp;
		}	
	}
	
	

}
