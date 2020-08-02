import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dwarf = new int[9];
        int sum = 0;
        for (int i=0;i<9;i++) {
            dwarf[i] = sc.nextInt();
            sum += dwarf[i];
        }
        Arrays.sort(dwarf);
        // 브루트 포스
        // 모든 경우의 수 : 9명 중에서 7명 뽑는 경우의 수 = 9C7 = 9C2 = 9*8/2 = 36
        // 36가지의 경우의 수 고려하면 됨.
        for (int i=0;i<9;i++) {
            for (int j=i+1;j<9;j++) {
                if (sum - dwarf[i] - dwarf[j] == 100) {
                    for (int k=0;k<9;k++) {
                        if (k == i || k == j) continue;
                        System.out.println(dwarf[k]);
                    }
                    System.exit(0); // 결과를 찾으면 추가 연산 시간을 줄이기 위해 강제 종료
                }
            }
        }
    }
}
