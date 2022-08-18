public class Main {
    public static void main(String[] args) {
        int a;
        int b;
        a = 20;
        b = a + 5;
        System.out.println(a);
        System.out.println(b);

        //エスケープシーケンス
        System.out.println("\"です");

        System.out.println(3 + 5);
        System.out.println(10 - 3);
        System.out.println(3 * 2);
        System.out.println(3.2 / 1.6);
        System.out.println(9 / 2);
        System.out.println(9 % 2);
        System.out.println("こん" + "にちは");
        System.out.println("ベスト" + "3");

        int c;
        c = 10;
        c += 2;
//        c -= 2;
//        c *= 2;
//        c /= 2;
//        c %= 2;
//        c += "風";

        int d;
        d = 100;
        d ++;
        System.out.println(d);

        int e =10;
        int f = 10;
        System.out.println(++e + 50);
        System.out.println(f++ + 50);

        float g = 3;
        double h = g;
        System.out.println(g);
        System.out.println(h);

//        int i = 3.2; //エラーになる　型が違う。

        int age = (int)3.2; //強制的にint型にしている。
        System.out.println(age);

        double i = 8.5 / 2;
        long j = 5 + 2L;
        System.out.println(i);
        System.out.println(j);

        String msg = "私の年齢は" + 23;
        System.out.println(msg);

//        改行あり。
        String name = "すがわら";
        String message;
        message = name + "さん、こんにちは";
        System.out.println(message);
        System.out.println(message);

//        改行なし。
        System.out.print("私の名前は");
        System.out.print(name);
        System.out.print("です。");

        int k = 5;
        int l = 3;
        int m = Math.max(k , l);
        System.out.println("比較実験：" +
                k + "と" + l + "とで大きい方は..." + m);

        String age1 = "31";
        int n = Integer.parseInt(age1);
        System.out.println("あなたは来年、" + (n +1) + "歳になりますね。");

        int r = new java.util.Random().nextInt(100);
        System.out.println("あなたは多分・・・" + r + "歳ですね？");

//        System.out.println("あなたの名前を入力してください。");
//        String s = new java.util.Scanner(System.in).nextLine();
//        System.out.println("あなたの年齢を入力してください。");
//        int input = new java.util.Scanner(System.in).nextInt();
//        System.out.println("ようこそ" + input + "歳の" + s + "さん。");

        int xx =5;
        int yy = 10;
        String ans = "xx + yy は" + (xx + yy) ;
        System.out.println(ans);
//
//        int zz = 3 + 5.0; // 少数が入らない。整数のみ。
//        double dd = 2.0F;
//        int number = "5"; //　文字列になっている。
//        String ss = 2 + "人目";
//        byte bb = 1;
//        double ddd = true; //真偽を判断するものでない。
//        short sss = (byte)2; //強制的にbyteにしている。

        System.out.println("ようこそ占いの館へ");
        System.out.println("あなたの名前を入力してください。");
        String name1 = new java.util.Scanner(System.in).nextLine();
        System.out.println("あなたの年齢を入力してください。");
        String ageString = new java.util.Scanner(System.in).nextLine();
        int age2 = Integer.parseInt(ageString);
        int fortune = new java.util.Random().nextInt(4);
        ++ fortune;
        System.out.println("占いの結果が出ました！");
        System.out.println(ageString + "歳の" + name1 + "さんの運気は" + fortune + "です。");
        System.out.println("1:大吉　2:中吉　3:吉　4:凶");

    }
}
