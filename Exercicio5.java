/*

Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]

* */


package estudos.java.introducao.exercicios;

public class Exercicio5 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        moveZeroes(nums);
    }

    static public void moveZeroes(int[] nums) {
        if(nums.length==0){}
        int posicaoFrente = 0;
        for(int posicaoAtual = 0; posicaoAtual <nums.length; posicaoAtual++){
            if(nums[posicaoAtual] !=0){
                   int numerodaFrente=nums[posicaoFrente];
                   nums[posicaoFrente]=nums[posicaoAtual];
                   nums[posicaoAtual]=numerodaFrente;
                   posicaoFrente++;
            }
        }
    }
}