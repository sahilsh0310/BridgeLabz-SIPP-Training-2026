class countOperations {
    public int countOperations(int num1, int num2) {
        if(num1 == 0 || num2 == 0)return 0;
        if(num1 == num2)return 1;
        int n = 0;
        while(num1!=num2){
            while(num1>num2){
                num1-=num2;
                n++;
            }
            while(num2>num1){
                num2-=num1;
                n+=1;
            }
        }
        return n+1;
    }
}