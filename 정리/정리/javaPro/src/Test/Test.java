package Test;

import java.io.IOException;

public class Test {
    private static int x = 10; // 커서의 초기 x 좌표
    private static int y = 5;  // 커서의 초기 y 좌표
    private static final int WIDTH = 20; // 화면 가로 크기
    private static final int HEIGHT = 10; // 화면 세로 크기

    public static void main(String[] args) {
        System.out.println("방향키로 커서를 움직이세요.");
        try {
            while (true) {
                // 방향키 입력을 처리
                int key = System.in.read();
                if (key == 27) { // 방향키는 27(ESC)으로 시작
                    System.in.read(); // 대기 문자 (대개 '[')
                    int direction = System.in.read(); // 실제 방향키 값
                    
                    switch (direction) {
                        case 'A': // 위 방향키
                            if (y > 0) y--;
                            break;
                        case 'B': // 아래 방향키
                            if (y < HEIGHT - 1) y++;
                            break;
                        case 'C': // 오른쪽 방향키
                            if (x < WIDTH - 1) x++;
                            break;
                        case 'D': // 왼쪽 방향키
                            if (x > 0) x--;
                            break;
                    }
                }

                // 화면을 갱신하여 커서를 이동시킴
                printScreen();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 화면을 출력하는 함수
    private static void printScreen() {
        // 콘솔 화면을 지우는 코드 (터미널에서 화면을 지웁니다)
        System.out.print("\033[H\033[2J"); // ANSI Escape Code로 화면 지우기
        System.out.flush(); // 화면에 출력

        // 화면 그리기
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                if (i == y && j == x) {
                    System.out.print("*");  // 커서
                } else {
                    System.out.print(" ");  // 공백
                }
            }
            System.out.println();
        }
    }
}
