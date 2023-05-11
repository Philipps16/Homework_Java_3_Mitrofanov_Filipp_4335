package Homework_Java_3_Mitrofanov_Filipp_4335;
public class Task03 {
    public static void main(String[] args) {
    int array[] = new int[]{5, 10, 15, 45, 87, 96};
    int max = getMax(array);
    System.out.println("Масимальное значение: "+max);
    int min = getMin(array);
    System.out.println("Минимальное значение: "+min);
    int mid = getMid(array);
    System.out.println("Среднее значение: "+mid);
  }
 
  
  public static int getMax(int[] inputArray){ 
    int maxValue = inputArray[0]; 
    for(int i=1;i < inputArray.length;i++){
        if(inputArray[i] > maxValue){ 
        maxValue = inputArray[i]; 
      } 
    } 
    return maxValue; 
  }

  public static int getMin(int[] inputArray){ 
    int minValue = inputArray[0]; 
    for(int i=1;i<inputArray.length;i++){ 
      if(inputArray[i] < minValue){ 
        minValue = inputArray[i]; 
      } 
    } 
    return minValue; 
  } 
  public static int getMid(int[] inputArray){ 
    int midValue = 1;
    int sum = 0;
    for(int i=0; i < inputArray.length;i++){
        sum += inputArray[i];
      }
    midValue = sum/inputArray.length;
    return midValue; 
    }
    
  }
