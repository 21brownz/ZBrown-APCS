package FreeResponse;

public class RouteCipher {

    private String[][] letterBlock;
    private int numRows;
    private int numCols;

    public RouteCipher(int rows, int columns) {
        this.numRows = rows;
        this.numCols = columns;
        this.letterBlock = new String[rows][columns];
    }

    public String[][] getBlock() {
        return letterBlock;
    }

    public void fillBlock(String str) {
        int cell = 0;
        for (int r = 0; r < numRows; r++) {
            for (int c = 0; c < numCols; c++) {
                String letter;
                letter = cell < str.length() ? str.charAt(cell) + "" : "A";
                cell++;
                letterBlock[r][c] = letter;
            }
        }
    }

    private String encryptBlock() {
        StringBuilder encrypted = new StringBuilder();
        for (int c = 0; c < numCols; c++) {
            for (int r = 0; r < numRows; r++) {
                encrypted.append(letterBlock[r][c]);
            }
        }
        return encrypted.toString();
    }

    public String encryptMessage(String message) {

        String trim = message.trim();
        if ( trim.equals("") ) return "";

        int size = numRows * numCols;
        int blocks = (int) Math.ceil( (double) trim.length() / size );

        int processed = 0;
        StringBuilder encrypted = new StringBuilder();
        while ( processed < blocks ) {
            int start = processed * size, end;
            end = Math.min(((processed + 1) * size), trim.length());
            fillBlock( trim.substring( start, end ) );
            encrypted.append(encryptBlock());
            processed++;
        }

        return encrypted.toString();

    }

}