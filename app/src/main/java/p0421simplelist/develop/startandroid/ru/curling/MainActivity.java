package p0421simplelist.develop.startandroid.ru.curling;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

// Основной класс с реализацией интерфейса "Слушателя нажатий" <-- вот это важная штука
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // Выносим сюда переменные логики
    // Основной счет комманды А
    int scoreTeamA = 0;

    // Основной счет комманды Б
    int scoreTeamB = 0;

    // Номер текущего энда
    int numberOfEnd = 1;

    // Очки команды А текущего энда
    int currentScoreEndA = 0;
    // Очки команды Б текущего энда
    int currentScoreEndB = 0;

    // Общие очки комманды А по всем эндам
    int totalScoreEndA = 0;
    // Общие очки комманды Б по всем эндам
    int totalScoreEndB = 0;

    /*
    Тут мы создаем переменные для хранения TextView
     */
    TextView score_team_a;
    TextView score_team_b;
    TextView total_a;
    TextView total_b;
    TextView one_end_a;
    TextView two_end_a;
    TextView three_end_a;
    TextView four_end_a;
    TextView five_end_a;
    TextView six_end_a;
    TextView seven_end_a;
    TextView eight_end_a;
    TextView nine_end_a;
    TextView ten_end_a;
    TextView extra_end_a;
    TextView one_end_b;
    TextView two_end_b;
    TextView three_end_b;
    TextView four_end_b;
    TextView five_end_b;
    TextView six_end_b;
    TextView seven_end_b;
    TextView eight_end_b;
    TextView nine_end_b;
    TextView ten_end_b;
    TextView extra_end_b;

    /*
    Тут мы создаем переменные для хранения Button
    */
    Button button_next_end;
    Button button_reset;
    Button button_plus_1a;
    Button button_plus_2a;
    Button button_plus_3a;
    Button button_plus_4a;
    Button button_plus_5a;
    Button button_plus_6a;
    Button button_plus_7a;
    Button button_plus_8a;
    Button button_plus_1b;
    Button button_plus_2b;
    Button button_plus_3b;
    Button button_plus_4b;
    Button button_plus_5b;
    Button button_plus_6b;
    Button button_plus_7b;
    Button button_plus_8b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // тут мы инициализируем все наши TextView
        score_team_a = (TextView) findViewById(R.id.score_team_a);
        score_team_b = (TextView) findViewById(R.id.score_team_b);
        total_a = (TextView) findViewById(R.id.total_a);
        total_b = (TextView) findViewById(R.id.total_b);
        one_end_a = (TextView) findViewById(R.id.one_end_a);
        two_end_a = (TextView) findViewById(R.id.two_end_a);
        three_end_a = (TextView) findViewById(R.id.three_end_a);
        four_end_a = (TextView) findViewById(R.id.four_end_a);
        five_end_a = (TextView) findViewById(R.id.five_end_a);
        six_end_a = (TextView) findViewById(R.id.six_end_a);
        seven_end_a = (TextView) findViewById(R.id.seven_end_a);
        eight_end_a = (TextView) findViewById(R.id.eight_end_a);
        nine_end_a = (TextView) findViewById(R.id.nine_end_a);
        ten_end_a = (TextView) findViewById(R.id.ten_end_a);
        extra_end_a = (TextView) findViewById(R.id.extra_end_a);
        one_end_b = (TextView) findViewById(R.id.one_end_b);
        two_end_b = (TextView) findViewById(R.id.two_end_b);
        three_end_b = (TextView) findViewById(R.id.three_end_b);
        four_end_b = (TextView) findViewById(R.id.four_end_b);
        five_end_b = (TextView) findViewById(R.id.five_end_b);
        six_end_b = (TextView) findViewById(R.id.six_end_b);
        seven_end_b = (TextView) findViewById(R.id.seven_end_b);
        eight_end_b = (TextView) findViewById(R.id.eight_end_b);
        nine_end_b = (TextView) findViewById(R.id.nine_end_b);
        ten_end_b = (TextView) findViewById(R.id.ten_end_b);
        extra_end_b = (TextView) findViewById(R.id.extra_end_b);

        // тут мы инициализируем все наши Button
        button_next_end = (Button) findViewById(R.id.button_next_end);
        button_reset = (Button) findViewById(R.id.button_reset);
        button_plus_1a = (Button) findViewById(R.id.button_plus_1a);
        button_plus_2a = (Button) findViewById(R.id.button_plus_2a);
        button_plus_3a = (Button) findViewById(R.id.button_plus_3a);
        button_plus_4a = (Button) findViewById(R.id.button_plus_4a);
        button_plus_5a = (Button) findViewById(R.id.button_plus_5a);
        button_plus_6a = (Button) findViewById(R.id.button_plus_6a);
        button_plus_7a = (Button) findViewById(R.id.button_plus_7a);
        button_plus_8a = (Button) findViewById(R.id.button_plus_8a);
        button_plus_1b = (Button) findViewById(R.id.button_plus_1b);
        button_plus_2b = (Button) findViewById(R.id.button_plus_2b);
        button_plus_3b = (Button) findViewById(R.id.button_plus_3b);
        button_plus_4b = (Button) findViewById(R.id.button_plus_4b);
        button_plus_5b = (Button) findViewById(R.id.button_plus_5b);
        button_plus_6b = (Button) findViewById(R.id.button_plus_6b);
        button_plus_7b = (Button) findViewById(R.id.button_plus_7b);
        button_plus_8b = (Button) findViewById(R.id.button_plus_8b);

        // вот тут мы "цепляем" ко всем кнопкам нашего "слушателя"
        button_next_end.setOnClickListener(this);
        button_reset.setOnClickListener(this);
        button_plus_1a.setOnClickListener(this);
        button_plus_2a.setOnClickListener(this);
        button_plus_3a.setOnClickListener(this);
        button_plus_4a.setOnClickListener(this);
        button_plus_5a.setOnClickListener(this);
        button_plus_6a.setOnClickListener(this);
        button_plus_7a.setOnClickListener(this);
        button_plus_8a.setOnClickListener(this);
        button_plus_1b.setOnClickListener(this);
        button_plus_2b.setOnClickListener(this);
        button_plus_3b.setOnClickListener(this);
        button_plus_4b.setOnClickListener(this);
        button_plus_5b.setOnClickListener(this);
        button_plus_6b.setOnClickListener(this);
        button_plus_7b.setOnClickListener(this);
        button_plus_8b.setOnClickListener(this);
    }

    // это метод, который срабатывает при нажатии на какуб либо закрепленную кнопку
    @Override
    public void onClick(View view) {
        // получаем id нажатой кнопки
        switch (view.getId()) {
            // и если он равен id button_reset
            case R.id.button_reset:
                // выполняем метод reset()
                reset();
                // выполняем метод display()
                display();
                // выходим
                break;
            // если id равен button_next_end
            case R.id.button_next_end:
                // если текущий счет энда команды А больше счета энда команды Б
                if (currentScoreEndA > currentScoreEndB) {
                    // увеличиваем общий счет команды А на 1
                    scoreTeamA++;
                }

                // если текущий счет энда команды Б больше счета энда команды А
                if (currentScoreEndA < currentScoreEndB) {
                    // увеличиваем общий счет команды Б на 1
                    scoreTeamB++;
                }

                // если текущий счет энда команды Б равен счету энда команды А
                if (currentScoreEndA == currentScoreEndB) {
                    // увеличиваем оба счетчика на 1
                    scoreTeamA++;
                    scoreTeamB++;
                }

                // если шаг энда равен 10 и общий счет обеих команд равен
                if (numberOfEnd == 10 && scoreTeamA == scoreTeamB) {
                    // сделать видимым дополнительный текствью А
                    extra_end_a.setVisibility(View.VISIBLE);
                    // сделать видимым дополнительный текствью Б
                    extra_end_b.setVisibility(View.VISIBLE);
                    // выводим сообщение, что у нас дополнительный энд
                    Toast.makeText(getApplicationContext(), "Extra end!", Toast.LENGTH_SHORT).show();
                }

                // если команда А лидирует и шаг энда равен или больше 10
                if (scoreTeamA > scoreTeamB && numberOfEnd >= 10) {
                    // выводим победителя
                    Toast.makeText(getApplicationContext(), "TeamA wins!", Toast.LENGTH_SHORT).show();
                }

                // если команда Б лидирует и шаг энда равен или больше 10
                if (scoreTeamA < scoreTeamB && numberOfEnd >= 10) {
                    // выводим победителя
                    Toast.makeText(getApplicationContext(), "TeamB wins!", Toast.LENGTH_SHORT).show();
                }
                // обновляем отображение на экране
                display();
                // обнуляем текущий счет энда А
                currentScoreEndA = 0;
                // обнуляем текущий счет энда Б
                currentScoreEndB = 0;
                // счетчик энда увеличиваем на 1
                numberOfEnd++;
                // выходим
                break;
            // если нажата кнопка "+1"  <-- далее логика повторяется с разными кнопками
            case R.id.button_plus_1a:
                // текущий счет энда увеличиваем на 1
                currentScoreEndA = currentScoreEndA + 1;
                // прибавляем его к текущему счету
                totalScoreEndA = totalScoreEndA + currentScoreEndA;
                // обновляем изображение
                display();
                // выходим
                break;
            // далее логика повторяется с разными кнопками -->
            case R.id.button_plus_2a:
                currentScoreEndA = currentScoreEndA + 2;
                totalScoreEndA = totalScoreEndA + currentScoreEndA;
                display();
                break;
            case R.id.button_plus_3a:
                currentScoreEndA = currentScoreEndA + 3;
                totalScoreEndA = totalScoreEndA + currentScoreEndA;
                display();
                break;
            case R.id.button_plus_4a:
                currentScoreEndA = currentScoreEndA + 4;
                totalScoreEndA = totalScoreEndA + currentScoreEndA;
                display();
                break;
            case R.id.button_plus_5a:
                currentScoreEndA = currentScoreEndA + 5;
                totalScoreEndA = totalScoreEndA + currentScoreEndA;
                display();
                break;
            case R.id.button_plus_6a:
                currentScoreEndA = currentScoreEndA + 6;
                totalScoreEndA = totalScoreEndA + currentScoreEndA;
                display();
                break;
            case R.id.button_plus_7a:
                currentScoreEndA = currentScoreEndA + 7;
                totalScoreEndA = totalScoreEndA + currentScoreEndA;
                display();
                break;
            case R.id.button_plus_8a:
                currentScoreEndA = currentScoreEndA + 8;
                totalScoreEndA = totalScoreEndA + currentScoreEndA;
                display();
                break;
            case R.id.button_plus_1b:
                currentScoreEndB = currentScoreEndB + 1;
                totalScoreEndB = totalScoreEndB + currentScoreEndB;
                display();
                break;
            case R.id.button_plus_2b:
                currentScoreEndB = currentScoreEndB + 2;
                totalScoreEndB = totalScoreEndB + currentScoreEndB;
                display();
                break;
            case R.id.button_plus_3b:
                currentScoreEndB = currentScoreEndB + 3;
                totalScoreEndB = totalScoreEndB + currentScoreEndB;
                display();
                break;
            case R.id.button_plus_4b:
                currentScoreEndB = currentScoreEndB + 4;
                totalScoreEndB = totalScoreEndB + currentScoreEndB;
                display();
                break;
            case R.id.button_plus_5b:
                currentScoreEndB = currentScoreEndB + 5;
                totalScoreEndB = totalScoreEndB + currentScoreEndB;
                display();
                break;
            case R.id.button_plus_6b:
                currentScoreEndB = currentScoreEndB + 6;
                totalScoreEndB = totalScoreEndB + currentScoreEndB;
                display();
                break;
            case R.id.button_plus_7b:
                currentScoreEndB = currentScoreEndB + 7;
                totalScoreEndB = totalScoreEndB + currentScoreEndB;
                display();
                break;
            case R.id.button_plus_8b:
                currentScoreEndB = currentScoreEndB + 8;
                totalScoreEndB = totalScoreEndB + currentScoreEndB;
                display();
                break;
        }
    }

    // метод отображения информации на экране
    public void display() {
        // полуаем номер текущего шага
        switch (numberOfEnd) {
            // если текущий шаг равен 1
            case 1:
                // Обновляем все вьюшки нашей инфой в "шапке" класса
                score_team_a.setText(String.valueOf(scoreTeamA));
                score_team_b.setText(String.valueOf(scoreTeamB));
                // тут обновляем TextView первого энда команды А
                one_end_a.setText(String.valueOf(currentScoreEndA));
                // тут обновляем TextView первого энда команды Б
                one_end_b.setText(String.valueOf(currentScoreEndB));
                total_a.setText(String.valueOf(totalScoreEndA));
                total_b.setText(String.valueOf(totalScoreEndB));
                // выходим
                break;
            // если текущий шаг равен 1
            case 2:
                score_team_a.setText(String.valueOf(scoreTeamA));
                score_team_b.setText(String.valueOf(scoreTeamB));
                // тут обновляем TextView второго(!!!) энда команды А
                two_end_a.setText(String.valueOf(currentScoreEndA));
                // тут обновляем TextView второго(!!!) энда команды Б
                two_end_b.setText(String.valueOf(currentScoreEndB));
                total_a.setText(String.valueOf(totalScoreEndA));
                total_b.setText(String.valueOf(totalScoreEndB));
                break;
            case 3:
                score_team_a.setText(String.valueOf(scoreTeamA));
                score_team_b.setText(String.valueOf(scoreTeamB));
                three_end_a.setText(String.valueOf(currentScoreEndA));
                three_end_b.setText(String.valueOf(currentScoreEndB));
                total_a.setText(String.valueOf(totalScoreEndA));
                total_b.setText(String.valueOf(totalScoreEndB));
                break;
            case 4:
                score_team_a.setText(String.valueOf(scoreTeamA));
                score_team_b.setText(String.valueOf(scoreTeamB));
                four_end_a.setText(String.valueOf(currentScoreEndA));
                four_end_b.setText(String.valueOf(currentScoreEndB));
                total_a.setText(String.valueOf(totalScoreEndA));
                total_b.setText(String.valueOf(totalScoreEndB));
                break;
            case 5:
                score_team_a.setText(String.valueOf(scoreTeamA));
                score_team_b.setText(String.valueOf(scoreTeamB));
                five_end_a.setText(String.valueOf(currentScoreEndA));
                five_end_b.setText(String.valueOf(currentScoreEndB));
                total_a.setText(String.valueOf(totalScoreEndA));
                total_b.setText(String.valueOf(totalScoreEndB));
                break;
            case 6:
                score_team_a.setText(String.valueOf(scoreTeamA));
                score_team_b.setText(String.valueOf(scoreTeamB));
                six_end_a.setText(String.valueOf(currentScoreEndA));
                six_end_b.setText(String.valueOf(currentScoreEndB));
                total_a.setText(String.valueOf(totalScoreEndA));
                total_b.setText(String.valueOf(totalScoreEndB));
                break;
            case 7:
                score_team_a.setText(String.valueOf(scoreTeamA));
                score_team_b.setText(String.valueOf(scoreTeamB));
                seven_end_a.setText(String.valueOf(currentScoreEndA));
                seven_end_b.setText(String.valueOf(currentScoreEndB));
                total_a.setText(String.valueOf(totalScoreEndA));
                total_b.setText(String.valueOf(totalScoreEndB));
                break;
            case 8:
                score_team_a.setText(String.valueOf(scoreTeamA));
                score_team_b.setText(String.valueOf(scoreTeamB));
                eight_end_a.setText(String.valueOf(currentScoreEndA));
                eight_end_b.setText(String.valueOf(currentScoreEndB));
                total_a.setText(String.valueOf(totalScoreEndA));
                total_b.setText(String.valueOf(totalScoreEndB));
                break;
            case 9:
                score_team_a.setText(String.valueOf(scoreTeamA));
                score_team_b.setText(String.valueOf(scoreTeamB));
                nine_end_a.setText(String.valueOf(currentScoreEndA));
                nine_end_b.setText(String.valueOf(currentScoreEndB));
                total_a.setText(String.valueOf(totalScoreEndA));
                total_b.setText(String.valueOf(totalScoreEndB));
                break;
            case 10:
                score_team_a.setText(String.valueOf(scoreTeamA));
                score_team_b.setText(String.valueOf(scoreTeamB));
                ten_end_a.setText(String.valueOf(currentScoreEndA));
                ten_end_b.setText(String.valueOf(currentScoreEndB));
                total_a.setText(String.valueOf(totalScoreEndA));
                total_b.setText(String.valueOf(totalScoreEndB));
                break;
            case 11:
                score_team_a.setText(String.valueOf(scoreTeamA));
                score_team_b.setText(String.valueOf(scoreTeamB));
                extra_end_a.setText(String.valueOf(currentScoreEndA));
                extra_end_b.setText(String.valueOf(currentScoreEndB));
                total_a.setText(String.valueOf(totalScoreEndA));
                total_b.setText(String.valueOf(totalScoreEndB));
                break;
        }
    }

    // метод сброса. тут мы тупо все обнуляем и выводим об этом сообщение
    public void reset() {
        scoreTeamA = 0;
        scoreTeamB = 0;
        numberOfEnd = 1;
        currentScoreEndA = 0;
        currentScoreEndB = 0;
        totalScoreEndA = 0;
        totalScoreEndB = 0;
        score_team_a.setText("0");
        score_team_b.setText("0");
        total_a.setText("0");
        total_b.setText("0");
        one_end_a.setText("0");
        two_end_a.setText("0");
        three_end_a.setText("0");
        four_end_a.setText("0");
        five_end_a.setText("0");
        six_end_a.setText("0");
        seven_end_a.setText("0");
        eight_end_a.setText("0");
        nine_end_a.setText("0");
        ten_end_a.setText("0");
        extra_end_a.setText("0");
        one_end_b.setText("0");
        two_end_b.setText("0");
        three_end_b.setText("0");
        four_end_b.setText("0");
        five_end_b.setText("0");
        six_end_b.setText("0");
        seven_end_b.setText("0");
        eight_end_b.setText("0");
        nine_end_b.setText("0");
        ten_end_b.setText("0");
        extra_end_b.setText("0");
        extra_end_a.setVisibility(View.INVISIBLE);
        extra_end_b.setVisibility(View.INVISIBLE);
        Toast.makeText(getApplicationContext(), "Progress is reset!", Toast.LENGTH_SHORT).show();
    }

}
