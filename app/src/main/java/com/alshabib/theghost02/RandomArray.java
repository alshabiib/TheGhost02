package com.alshabib.theghost02;

import android.media.MediaPlayer;
import android.support.v4.content.res.TypedArrayUtils;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;

import java.util.Random;

public class RandomArray extends AppCompatActivity {

    //The Questions
    String q2 = "كم عدد آيات القرآن الكريم?";
    String q3 = "كم عدد سور القرآن الكريم ؟";
    String q4 = "كم جزء في القرآن الكريم؟";
    String q5 = "كم حزب في القرآن الكريم؟";
    String q6 = "كم آية في سورة البقرة؟";
    String q7 = "ماهي أقصر سورة في القرآن الكريم؟";
    String q8 = "ماهي أطول آية في القرآن الكريم؟";
    String q9 = "من الآيات التي تجمع كل حروف الهجاء آية؟";
    String q10 = "كم عدد علامات الوقف في القرآن الكريم؟";
    String q11 = "كم عدد السور التي تحمل أسماء الأنبياء في القرآن ؟";
    String q12 = "كم يبلغ عدد السور المكية في القرآن الكريم؟";
    String q13 = "كم يبلغ عدد السور المدنية في القرآن الكريم؟";
    String q14 = "ماهي آخر سورة في القرآن الكريم؟";
    String q15 = "ماهي السورة التي لا تبدأ بالبسملة؟";
    String q16 = "أطول كلمة في القرآن الكريم عدد حروفها؟";
    String q17 = "كم مرة ورد لفظ الجلالة الله في القرآن الكريم؟";
    String q18 = "كم مرة وردت كلمة صلوات في القرآن الكريم?";
    String q19 = "كم مرة وردت كلمة رمضان في القرآن الكريم؟";
    String q20 = "في أي شهر نزل القرآن الكريم؟";
    String q21 = "ماهي اول سورة نزلت في القرآن الكريم؟";
    String q22 = "ماهي اخر سورة نزلت في القرآن الكريم؟";
    String q23 = "من أول من قال السلام عليكم ورحمة الله وبركاته؟"; //ادم
    String q24 = "من أول من ركب الخيل ؟"; //نبي الله اسماعيل عليه السلام
    String q25 = "من أول من خط بالقلم ؟"; // نبي الله ادريس عليه السلام
    String q26 = "من هو أطول الناس عمرا ؟"; // نبي الله نوح عليه السلام
    String q27 = "من هو أول من شاب ؟"; //نبي الله ابراهيم عليه السلام
    String q28 = "من هو أول من خيط الثياب ؟"; //النبي ادريس
    String q29 = "من أول من بنى سفينة ؟"; //النبي نوح
    String q30 = "من الذي سخر له الله الجبال لتسبح معه ؟"; //النبي داوود
    String q31 = "كم عاش نبي الله آدم عليه السلام ؟"; //1000 سنة
    String q32 = "كم عاش نبي الله إدريس عليه السلام ؟"; //865 سنة
    String q33 = "في أي يوم دخل آدم الجنة ؟"; //الجمعه
    String q34 = "هل ورد اسم حواء في القران الكريم ؟"; //لا
    String q35 = "من أول من أعطاه الله ملكا وأنعم عليه فكفر ؟"; //ابليس
    String q36 = "من هو أول من صام ؟"; //ادم
    String q37 = "من أي شئ خلقت حواء ؟"; //ضلع ادم الايسر
    String q38 = "في أي يوم كان خروج آدم من الجنة ؟"; //الجمعه
    String q39 = "مالذي هدى قابيل الى طريقة دفن أخيه هابيل ؟"; //الغراب
    String q40 = "من هو أول أولاد آدم ؟"; //قابيل
    String q41 = "نبي كان ابنه كافر فمن هو ؟"; //النبي نوح عليه السلام
    String q42 = "من هو أكبر أبناء نوح عليه السلام ؟"; //سام
    String q43 = "نبيان إمرأة كل واحد منهما كافره فمن هما ؟"; //نوح ولوط عليهما السلام
    String q44 = "مانوع العذاب الذي عذب به الله قوم نوح ؟"; //الغرق
    String q45 = "الى من أرسل هود عليه السلام ؟"; //قوم عاد
    String q46 = "الى من أرسل نبي الله صالح عليه السلام ؟"; //قوم ثمود
    String q47 = "ماهي معجزة صالح عليه السلام ؟"; //ناقة صالح
    String q48 = "الى من أرسل لوط عليه السلام ؟"; //الى أهل الشام
    String q49 = "ما اسم القرية التي ارسل اليها لوط ؟"; //قرية سدوم
    String q50 = "نبي ذكره الله تعالى في القران في خمس وعشرين سورة ؟"; //ابراهيم الخليل عليه السلام
    String q51 = "من أول من نادى بالحج الى بيت الله الحرام ؟"; //ابراهيم
    String q52 = "كيف أعجز إبراهيم النمرود عن التمادي في الكفر ؟"; //أمره أن يأتي بالشمس من المغرب
    String q53 = "كيف أراد النمرود أن يعذب سيدنا إبراهيم (ص) ؟"; //أراد حرقه بالنارم
    String q54 = "كم مكث إبراهيم عليه السلام في النار التي ألقي بها ؟";//7 ايام
    String q55 = "كم عدد طيور ابراهيم عليه السلام ؟"; //4
    String q56 = "أين ترك سيدنا إبراهيم زوجته هاجر وولدها ؟"; //مكة المكرمة
    String q57 = "من الذي سمي بالذبيح ؟"; //اسماعيل
    String q58 = "بم كان يأمر إسماعيل أهله ؟"; //الصلاة والزكاة م
    String q59 = "الى من أرسل إسماعيل عليه السلام ؟"; //العرب م
    String q60 = "كم عدد أخوة يوسف ؟"; //11
    String q61 = "ما اسم أبو يوسف ؟"; //يعقوب
    String q62 = "الى أين ذهب يوسف بعدما خرج من البئر ؟"; //مصر
    String q63 = "كم لبث يوسف في البئر ؟"; //3 ايام
    String q64 = "كم لبث يوسف في السجن ؟"; //7 سنوات
    String q65 = "من أصحاب الأيكة ؟"; //قوم شعيب
    String q66 = "من هو خطيب الأنبياء عليهم السلام ؟"; //شعيب
    String q67 = "الى من أرسل شعيب عليه السلام ؟"; //اهل مدين
    String q68 = "من أول من مات موسى أم هارون ؟"; //هارون
    String q69 = "من النبي الذي طمع في رؤية ربه ؟"; //موسى
    String q70 = "الى أين ذهب موسى عليه السلام بعد خروجه من مصر ؟"; //مدين
    String q71 = "من من طلب سيدنا موسى العلم ؟"; //الخضر عليه السلام
    String q72 = "من هو الرسول الذي يسمى الكليم ؟"; //موسى
    String q73 = "على من أنزلت التوراة ؟"; //موسى
    String q74 = "بمن تزوج يوسف عليه السلام ؟"; //زليخه
    String q75 = "هل كان إخوة يوسف أنبياء ؟"; //لا
    String q76 = "لماذا أمر يعقوب أبناءه أن يدخلوا من أبواب متفرقة ؟"; //خشية عليهم من العين
    String q77 = "لماذا كانت عداوة أولاد يعقوب لأخيهم يوسف ؟"; //غيرة وحسد
    String q78 = "قميص من ذكر في القران ؟"; //يوسف
    String q79 = "الحيوان الذي خاف منه يعقوب على ابنه يوسف ؟"; //الذئب
    String q80 = "نبي كان في السماء الثالثة في ليلة المعراج الى السماء ؟"; //يوسف
    String q81 = "أين كلم الله موسى ؟"; //الطور
    String q82 = "من أكثر الأنبياء ذكرا في القران الكريم باسمه الصريح ؟"; //موسى
    String q83 = "كم رجلا اختار موسى من قومه ليعتذروا الى ربهم ؟"; //70 رجل
    String q84 = "ما اسم وزير فرعون ؟"; //هامان
    String q85 = "في أي سورة توجد قصة موسى مع العبد الصالح ؟"; //الكهف
    String q86 = "الى من ارسل موسى عليه السلام ؟"; //بني اسرائيل
    String q87 = "هل كانت بنت شعيب زوجة موسى بنت شعيب الكبرى أم الصغرى ؟"; //الصغرى
    String q88 = "كم عدد عيون الماء التي فجرتها عصا موسى عليه السلام ؟"; //11
    String q89 = "من هي المرأة التي أوحى الله اليها في القران ؟"; //ام موسى
    String q90 = "كم عدد الرسل المذكورين في القران الكريم ؟"; //25
    String q91 = "كيف عذب الله النمرود قبل وفاته ؟"; //دخلت رأسه بعوضه
    String q92 = "من هو الطاغية الذي خسف الله به وبداره الأرض ؟"; //قارون
    String q93 = "ما هي معجزة داوود ؟"; //ألان الله له الحديد
    String q94 = "من هو النبي المعروف بالصبر ؟"; //ايوب
    String q95 = "ورد اسم ذي الكفل عليه السلام في سورتين فما هما ؟"; //الأنبياء --- ص
    String q96 = "على من نزلت الزبور ؟"; //على داوود عليه السلام
    String q97 = "الى من أرسل زكريا ؟"; //بني اسرائيل
    String q98 = "كيف عرف الناس بموت سليمان عليه السلام ؟"; //عندما تاكلت عصاه
    String q99 = "من أول من صنع الدروع؟ ويأكل من عمل يده ؟"; //داوود
    String q100 = "من قتل جالوت ؟"; //داوود


    //The Method For Random
    public static void shuffle(int[] array) {
        int JassArr = array.length;

        for (int i = 0; i < JassArr; i++) {
            int s = i + (int) (Math.random() * (JassArr - i));

            int temp = array[s];
            array[s] = array[i];
            array[i] = temp;
        }
    }


    public static void shuffle(int mediaPlayer)
    {

    }
}