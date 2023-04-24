package Object0424;

// クラス宣言
public class User {
    // フィールド
    String name; // 名前
    int age;     // 年齢

    // コンストラクタ
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // メソッド staticは付けない！
    public void greed() {
        System.out.println(name);
    }

}