public class Theater {
    private Seat[][] seats;
    private int rowCount, colCount;

    public Theater(int rowCount, int colCount) {
        if (rowCount > 26) {
            rowCount = 26;
        }
        seats = new Seat[rowCount][colCount];


        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                seats[i][j] = new Seat();
            }
        }
        this.rowCount = rowCount;
        this.colCount = colCount;

    }

    public boolean reserve(String name, char rowChar, int col, int numSeat) {
        // 여기에 코드를 작성하세요
        int rowIndex = getRowIndex(rowChar);
        if (seats[rowIndex] == null || seats[rowIndex][col] == null) {
            return false;
        }
        if (rowIndex > rowCount || numSeat > colCount-col+1) {
            return false;
        }
        for (int i = col - 1; i < col+numSeat-1; i++) {
            if (!seats[rowIndex][i].isOccupied()) {
                seats[rowIndex][i].reserve(name);

            }

        }
        return true;


    }

    public int cancel(String name) {
        // 여기에 코드를 작성하세요
        int cancelCount = 0;
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                if (seats[i][j].match(name)) {
                    seats[i][j].cancel();
                    cancelCount++;
                }
            }
        }
        return cancelCount;

    }

    public int cancel(char rowChar, int col, int numSeat) {
        // 여기에 코드를 작성하세요
        int rowIndex = getRowIndex(rowChar);
        int cancelCount = 0;
        if (numSeat > colCount) {
            for (int i = col-1; i <= colCount - col-1; i++) {
                seats[rowIndex][i].cancel();
                cancelCount++;
            }
        }
        for (int i = col - 1; i <= col+numSeat-1; i++) {
            if (seats[rowIndex][i].isOccupied()){
                seats[rowIndex][i].cancel();
                cancelCount++;
            }

        }
        return cancelCount;
    }


    public int getNumberOfReservedSeat() {
        // 여기에 코드를 작성하세요
        int reservedSeats = 0;
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                if (seats[i][j].isOccupied())
                    reservedSeats++;
            }
        }
        return reservedSeats;
    }


    public void printSeatMatrix() {
        System.out.print("  ");
        for (int i = 1; i <= 9; i++) {
            System.out.print("  " + i);
        }
        System.out.println();

        for (int i = 0; i < rowCount; i++) {
            System.out.print((char) ('A' + i) + ": ");
            for (int j = 0; j < colCount; j++) {
                Seat s = seats[i][j];
                if (s.isOccupied()) {
                    System.out.print("[O]");
                } else {
                    System.out.print("[ ]");
                }
            }
            System.out.println();
        }
    }

    private int getRowIndex(char uppercaseChar) {
        return uppercaseChar - 'A';
    }
}
