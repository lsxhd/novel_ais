package com.only.novel.common;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

/**
 * @Auther:lsxh
 * @Date:2019/4/23 10:38
 * @Description:
 */
public class NovelTest {

    @Test
    public void separateNovel() {
        String path = "D:\\novel\\chapter\\21\\all.text";

        String txt = "第001章 陨落的天才\n" +
                "“斗之力，三段！”\n" +
                "\n" +
                "望着测验魔石碑上面闪亮得甚至有些刺眼的五个大字，少年面无表情，唇角有着一抹自嘲，紧握的手掌，因为大力，而导致略微尖锐的指甲深深的刺进了掌心之中，带来一阵阵钻心的疼痛。\n" +
                "\n" +
                "\n" +
                "\n" +
                "跑出，少女刚刚出场，附近的议论声便是小了许多，一双双略微火热的目光，牢牢的锁定着少女的脸颊。\n" +
                "\n" +
                "少女年龄不过十四左右，虽然并算不上绝色，不过那张稚气未脱的小脸，却是蕴含着淡淡的妩媚，清纯与妩媚，矛盾的集合，让得她成功的成为了全场瞩目的焦点。\n" +
                "\n" +
                "少女快步上前，小手轻车熟路的触摸着漆黑的魔石碑，然后缓缓闭上眼睛……\n" +
                "\n" +
                "在少女闭眼片刻之后，漆黑的魔石碑之上再次亮起了光芒。第002章 斗气大陆\n" +
                "\n" +
                "月如银盘，漫天繁星。\n" +
                "\n" +
                "山崖之颠，萧炎斜躺在草地之上，嘴中叼中一根青草，微微嚼动，任由那淡淡的苦涩在嘴中弥漫开来。\n" +
                "\n" +
                "举起有些白皙的手掌，挡在眼前，目光透过手指缝隙，遥望着天空上那轮巨大的银月。\n" +
                "\n" +
                "“唉……”想起下午的测试，萧炎轻叹了一口气，懒懒地抽回手掌，双手枕着脑袋，眼神有些恍惚。\n" +
                "\n" +
                "“十五年了呢……”低低的自喃声，忽然毫无边际的从少年嘴中轻吐了出来。第003章 客人\n" +
                "\n" +
                "床榻之上，少年闭目盘腿而坐，双手在身前摆出奇异的手印，胸膛轻微起伏，一呼一吸间，形成完美的循环，而在气息循环间，有着淡淡的白色气流顺着口鼻，钻入了体内，温养着骨骼与肉体。\n" +
                "\n" +
                "在少年闭目修炼之时，手指上那古朴的黑色戒指，再次诡异的微微发光，旋即沉寂……\n" +
                "\n" +
                "“呼……”缓缓地吐出一口浊气，少年双眼乍然睁开，一抹淡淡的白芒在漆黑的眼中闪过，那是刚刚被吸收，而又未被完全炼化的斗之气。\n" +
                "\n" +
                "“好不容易修炼而来的斗之气，又在消失……我，我操！”沉神感应了一下体内，少年脸庞猛然的愤怒了起来，声音有些尖锐地骂道。";

        String test = "778";
        String reg = "[0-9]";


        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(txt);
        int i=0;
        while (matcher.find()){
            System.out.println(matcher.group());
        }

//        String[] arr1 = txt.split(reg);
//        for (int i =0 ; i<arr1.length ;i++){
//            System.out.println(arr1[i]);
//            System.out.println("************************");
//        }


    }
}