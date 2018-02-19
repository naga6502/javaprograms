package practice;

import java.util.Arrays;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class BubbleSort {

	public static void main(String[] args) {
		int array[] = {9,2,5,4,3,6};
		bubbleSort(array);
		for(Integer i : array){
			System.out.println(i);
		}
	}

	private static void bubbleSort(int[] array) {
		int temp;
		for(int i=0;i<array.length;i++){
			for(int j=1;j<array.length;j++){
				if(array[j-1]>array[j]){
					temp = array[j-1];
					array[j-1]=array[j];
					array[j]=temp;
 				}
			}
		}
		for(Integer i : array){
			System.out.println(i+"\n");
		}
	}

}
