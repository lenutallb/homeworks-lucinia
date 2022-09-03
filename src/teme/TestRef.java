package teme;

public class TestRef {

        private int x;

        public static void main(String[ ] args) {

            TestRef a = new TestRef();

            a.x = 5;

            TestRef b = new TestRef();

            b.x = 5;

            System.out.println(a == b);

            int s1 = a.x;
            int s2 = b.x;

            System.out.println(s1==s2);
            System.out.println(a.x == b.x);

        }

    }
