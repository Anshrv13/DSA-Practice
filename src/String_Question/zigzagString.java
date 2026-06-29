package String_Question;

public class zigzagString {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows)
            return s;

        StringBuilder[] rows = new StringBuilder[numRows];

        for (int i = 0; i < numRows; i++)
            rows[i] = new StringBuilder();

        int curRow = 0;
        boolean goingDown = true;

        for (char c : s.toCharArray()) {
            rows[curRow].append(c);

            if (curRow == 0)
                goingDown = true;
            else if (curRow == numRows - 1)
                goingDown = false;

            curRow += goingDown ? 1 : -1;
        }

        StringBuilder ans = new StringBuilder();

        for (StringBuilder row : rows)
            ans.append(row);

        return ans.toString();
    }
}
