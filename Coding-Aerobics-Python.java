class StringChange{
    public static void main(String[] args){
        
        String text = "Python";
        String lastThree = text.substring(text.length()-3);
        System.out.println(lastThree + text + lastThree);
        

        int odds = 0;
        int evens = 0;
        
        int[] nums = {5,7,2,4,9};

        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                evens++;
            }
            else
                odds++;
        }

        System.out.println("Evens: " + evens);
        System.out.println("Odds: " + odds);

    }
}