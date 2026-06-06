class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] result = new int[rows*cols][2];
        int r = rStart, c = cStart;
        int[] dirLeft = {0,1,0,-1}; 
        int[] dirRight = {1,0,-1,0};

        int count = 0;
        result[count++] = new int[]{r,c};

        int step = 0;
        int d = 0;

        while(count < rows*cols){
            
            if(d == 0 || d ==2){
                step++;
            }
            for(int i = 0; i < step; i++){
                r += dirLeft[d];
                c += dirRight[d];
            
                if(r >= 0 && r < rows && c >= 0 && c < cols){
                    result[count++] = new int[]{r,c};
                    if(count == rows*cols)
                        return result;
                    }
            }
            d = (d + 1) % 4;

        }
    return result;
    }
}