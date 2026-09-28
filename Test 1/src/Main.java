//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner scanner = new Scanner(System.in);

    int[][] Sales = {{1000, 2000, 3000}, {2000, 3000, 4000}, {1500, 1100, 1200}};
    String[] gameConsoles = {"PS5", "XBOX", "SWITCH"};
    String[] Cities = {"Cape Town", "Port Elizabeth", "Pretoria"};

    int[] total = new int[3];

    System.out.println("-----------------------------------------------------------");
    System.out.println("GAMING CONSOLE REPORT");
    System.out.println("-----------------------------------------------------------");

    System.out.printf("%-20s %-16s %-16s \n", "PS5", "XBOX", "SWITCH");

    for (int i = 0; i < Sales.length; i++) {
        System.out.printf("%-20s", Cities[i]);
        for (int j = 0; j < Sales[i].length; j++) {
            System.out.printf("%-17d", Sales[i][j]);
        }
        System.out.printf("\n");
    }
    System.out.println("-----------------------------------------------------------");
    System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
    System.out.println("-----------------------------------------------------------");
    for(int i=0;i<Sales.length;i++){
        for(int j=0;j<Sales[i].length;j++){
            total[i]+=Sales[i][j];
        }
    }
    System.out.println("Cape Tow: " + total[0]);
    System.out.println("Port Elizabeth: "+total[1]);
    System.out.println( "Pretoria: "+total[2]);
    System.out.println("-----------------------------------------------------------");
}

