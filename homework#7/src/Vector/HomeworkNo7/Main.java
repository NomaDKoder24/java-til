package Vector.HomeworkNo7;


import java.util.Arrays;

/**
 * 아래 테스트 코드가 정상 동작하도록 클래스들을 완성하시오.
 *
 * getArea(): 사각형의 넓이를 반환한다.
 * getCenterOfMass(): 사각형의 질량중심을 반환한다.
 * GetAllPoints(): 사각형의 네 점을 배열로 반환한다.
 * rot90(): Pivot을 기준으로 사각형을 90도 회전시킨다.
 */

/**
 * Class와 Method, 객체에 대한 개념과 그리고 명령어들에 대한 숙련도 및 이해도가
 * 아직 낮으 제한시간내에 해결 할 능력이 갖춰지지 않은 관계로며 이 문제와 #6문제 코딩을 할 수 없습니다.
 * 포기하지는 않겠습니다. 다만, 저는 숙련도와 이해도 수준이 올라간 후에 다시 도전해보겠습니다.
 */

class Vector2D {
    public float x, y;

    public Vector2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        // write codes here
        return "VECTOR2D";
    }
}

class RectCore {
    protected Vector2D pos;
    protected float w, h;

    public RectCore(float x, float y, float w, float h) {
        this.pos = new Vector2D(x, y);
        this.w = w;
        this.h = h;
    }

    public String toString() {
        // write codes here
        return "RECTCORE";
    }
}

public class Rect extends RectCore {
    public Rect(float x, float y, float w, float h) {
        super(x, y, w, h);
    }

    public float getArea() {
        // write codes here
        return 0.0f;
    }

    public Vector2D getCenterOfMass() {
        // write codes here
        return new Vector2D(0.0f, 0.0f);
    }

    public Vector2D [] getAllPoints() {
        // write codes here
        return new Vector2D[4];
    }

    public void rot90(Vector2D pivot) {
        // write codes here
    }

    public String toString() {
        // write codes here
        return "RECT";
    }
}

class RectTest {
    public static void main(String[] args) {
        Rect rect = new Rect(0.5f, 0.7f, 1.5f, 2.3f);
        System.out.println("Area: " + rect.getArea());
        System.out.println("CoM: " + rect.getCenterOfMass());
        System.out.println("All Points: " + Arrays.toString(rect.getAllPoints()));

        rect.rot90(new Vector2D(0.4f, 0.2f));
        System.out.println("Rotated rect: " + rect);
    }
}

