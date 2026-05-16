class Solution {
    public int calPoints(String[] operations) {

        int[] record = new int[operations.length];
        int marker = 0;
        int sum = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("+")) {
                record[marker] = record[marker - 1] + record[marker - 2];
                marker++;
            } else if (operations[i].equals("D")) {
                record[marker] = record[marker - 1] * 2;
                marker++;
            } else if (operations[i].equals("C")) {
                record[marker - 1] = 0;
                marker--;
            } else {
                record[marker] = Integer.parseInt(operations[i]);
                marker++;
            }
        }
        for (int j = 0; j < marker; j++) {
            sum += record[j];
        }
        return sum;
    }
}