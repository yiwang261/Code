package com.wang;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {
        //TIP 当文本光标位于高亮显示的文本处时按 <shortcut actionId="ShowIntentionActions"/>
        // 查看 IntelliJ IDEA 建议如何修正。

            int sum = 0;
            int j;
            for(int i = 1;i < 100;i ++){
                for(j = 2; j < i; j++){
                    if(i%j == 0){
                        break;
                    }
                }
                if(i==j)
                    sum+=i;
            }
            System.out.println(sum);
    }
}