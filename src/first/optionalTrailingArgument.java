package first;

public class optionalTrailingArgument {
static void f(int required, String... trailing) {
System.out.print("required: " + required + " ");
for(String s : trailing)
System.out.print(s + " ");
System.out.println();
}
static void f(int i){}//
public static void main(String[] args) {
f(1, "one");
f(2, "two", "three", "tree", "fuck");
f(0);
}
} 