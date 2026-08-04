class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
     List< int[] > sol = new ArrayList<>();

        for (int i = 0; i < firstList.length; i++) {

         for (int j = 0; j < secondList.length; j++) {

             int st = Math.max(firstList[i][0], secondList[j][0]);
             int en = Math.min(firstList[i][1], secondList[j][1]);

            if (st <= en) {
              sol.add(new int[]{st, en});
             }
            }
        }

        return sol.toArray( new int[sol.size()][]);
    }
}