package com.bespalov.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private DopAdapter adapter;
    private List <Dop> dops;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        adapter = new DopAdapter();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        dops = new ArrayList<>();





        Dop dop = new Dop(R.drawable.kovrik,"Ковры в салон (полиуретан)","Высокие борта эффективно защищают багажный отсек от поподания грязи и влаги" +
                "\nТекстура ковра препятствует скольжению");
        Dop dop1 = new Dop(R.drawable.kovrik_b,"Ковры в багажник (полиуретан)","Высокие борта эффективно защищают багажный отсек от поподания грязи и влаги" +
                "\nИдеальная геометрия ковра повторяет поверхность багажногоотсека" +
                "\nСохраняет физические свойства при любых температурныхрежимах эксплуатации");
        Dop dop2 = new Dop(R.drawable.kovri_t,"Ковры текстильные в салон и багажник","Перемычка – дополнительная защита салона заднего ряда сидений автомобиля" +
               "\nИИдеальная геометрия ковра гармонично вписывается в интерьер автомобиля" +
                "\nПлотный и высокий ворс увеличивает срок службы ковра");
        Dop dop3 = new Dop(R.drawable.bruzgovik,"Брызговики","Идеальная геометрия обеспечивает максимальную защитукузова автомобиля" +
                "\nБыстрая установка" +
                "\nИспользуемый материал гарантирует эластичность и неподвержен остаточной деформации");
        Dop dop4 = new Dop(R.drawable.podcrulky,"Подкрылки","Надёжно защищает от пескоструйного эффекта, налипанияснега, грязи" +
                "\nИспользуемый материал долговечен, обладает высокой прочностью" +
                "\nПодкрылок полностью повторяет геометрию колесной арки");
        Dop dop5 = new Dop(R.drawable.podcrulky_s,"Подкрылки с шумоизоляцией","Уникальный шумоизоляционный материал, который" +
                " отталкивает влагу и позволяет сохранить свойства подкрылка на протяжении всего периода эксплуатации" +
                "\nРезультаты тестов на полигоне НАМИ свидетельствуют о том, что подкрылки действительно снижают уровень шума на 50%" +
                "\nНет необходимости сверлить кузов, пластиковые крепежные\n" +
                "элементы устанавливаются в штатные места");
        Dop dop6 = new Dop(R.drawable.zachita,"Защита картера","Рёбра жёсткости увеличивают прочность защиты картера\n" +
                "\nНе нарушает температурного режима работы двигателя и\n" +
                "выхлопной системы" +
                "\nПолиэфирное порошковое покрытие обеспечивает высокую\n" +
                "коррозионную стойкость");
        Dop dop7 = new Dop(R.drawable.deflectora,"Дефлекторы окон и капота","Дефлекторы – декоративное средство защиты от механических\n" +
                "повреждений" +
                "\nИдеальная форма повторяет геометрию кузова" +
                "\nНе уменьшает зону видимости в области вертикальной стойки");

        dops.add(dop);
        dops.add(dop1);
        dops.add(dop2);
        dops.add(dop3);
        dops.add(dop4);
        dops.add(dop5);
        dops.add(dop6);
        dops.add(dop7);

        recyclerView.setAdapter(adapter);
        adapter.setDops(dops);

    }
}