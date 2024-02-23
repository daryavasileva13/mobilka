package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MyApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "Загрузка приложения", Toast.LENGTH_LONG).show();
        Log.e(TAG, "Это мое сообщение для записи в журнале (ERROR)");
        Log.w(TAG, "Это мое сообщение для записи в журнале (WARNING)");
        Log.i(TAG, "Это мое сообщение для записи в журнале (INFO)");
        Log.d(TAG, "Это мое сообщение для записи в журнале (DEBUG)");
        Log.v(TAG, "Это мое сообщение для записи в журнале (VERBOSE)");
    }
    @Override
    protected void onStart(){
        super.onStart();

        Toast.makeText(this, "Старт", Toast.LENGTH_LONG).show();
        Log.i(TAG, "Это мое сообщение для записи в журнале (Старт)");

    }
    @Override
    protected void onStop(){
        super.onStop();

        Toast.makeText(this, "Стоп", Toast.LENGTH_LONG).show();
        Log.e(TAG, "Приложение остановлено");

    }
    @Override
    protected void onDestroy(){
        super.onDestroy();

        Toast.makeText(this, "Уничтожение", Toast.LENGTH_LONG).show();
        Log.v(TAG, "Это мое сообщение для записи в журнале (уничтожение)");

    }
    @Override
    protected void onPause(){
        super.onPause();

        Toast.makeText(this, "Пауза", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onResume(){
        super.onResume();

        Toast.makeText(this, "Возобновление", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onRestart(){
        super.onRestart();

        Toast.makeText(this, "Перезапуск", Toast.LENGTH_LONG).show();
    }
    public void b_exitClick(View view) {
        System.exit(0);
    }
}