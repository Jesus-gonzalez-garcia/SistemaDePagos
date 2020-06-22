package com.example.sistemadepagos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btn10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);
        btn4 = findViewById(R.id.btn_4);
        btn5 = findViewById(R.id.btn_5);
        btn6 = findViewById(R.id.btn_6);
        btn7 = findViewById(R.id.btn_7);
        btn8 = findViewById(R.id.btn_8);
        btn9 = findViewById(R.id.btn_9);
        btn10 = findViewById(R.id.btn_10);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn10.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_1:
                sendData(R.drawable.ic_agua,"El SACMEX Pone a tu disposicion la opcion de pago de derechos de agua por medio de internet,es muy facil y rapido de realizar\n\nSu Saldo a pagar es de: 300$");
                break;
            case R.id.btn_2:
                sendData(R.drawable.ic_telefono,"Los clientes tendran la opcion de realizar el pago de su factura mensual,Esta empresa pone a tu disposicion el servicio de pago en line por medio de su App o veia telefonica \n\n Su saldo a pagar es de: 500$");
                break;
            case R.id.btn_3:
                sendData(R.drawable.ic_luz,"Bienvenidos,desde su casa u oficina,podrias ver tu recibo,hacer aclaraciones del mismo y pagralo;contratar la luz,cabiar la carga o avisar fallas y hasta revisar el medidor\n\nSu saldo a pagar es de: 700$");
                break;
            case R.id.btn_4:
                sendData(R.drawable.ic_gas,"Para hacer tu vida mas comoda, ponemos a tu alcance laopcion de pago en App:Una forma facil,rapida y segura para pagar tu factura de gas natrural\n\n Su saldo a pagar es de: 900$");
                break;
            case R.id.btn_5:
                sendData(R.drawable.ic_cable,"Puedes hacer el pago de cable atravez de la App o presencialmente en OXXO y muchas sucursales mas\n\n Su saldo a pagar es de: 400$ ");
                break;
            case R.id.btn_6:
                sendData(R.drawable.ic_drenaje,"El recibo de drenaje sanitario operado por el Organismo Operado en el domicilio solicitado JAPAM puede hacer su pago a travez de la App \n\n Su salgo a pagar es de: 450$");
                break;
            case R.id.btn_7:
                sendData(R.drawable.ic_limpieza,"Utilizamos materiales biodegradables de primera calidad. Ofrecemos la mejor calidad en el mercado para sanitizar y desinfectar espacios en general\n\n Su saldo a pagar es de: 350$");
                break;
            case R.id.btn_8:
                sendData(R.drawable.ic_reparacion,"cobertura en todo Mexico para servicios y reparaciones\n\n Su saldo a pagar es: 200$");
                break;
            case R.id.btn_9:
                sendData(R.drawable.ic_medico,"Cuida la Salud de tu familia sin que Salgan de Casa, Atención Médica Vía Online. Conserva el Buen Estado de Salud de familiares Mediante Consultas Digitales\n\n Su salgo a pagar es de: 1,000$");
                break;
            case R.id.btn_10:
                sendData(R.drawable.ic_alimento,"Tenemos como finalidad elaborar y/o distribuir alimentación científicamente planificada de acuerdo a recomendaciones nutricionales nacionales e intern acionales, a través de platos preparados u otras preparaciones culinarias,todo esto atravez de nuestra App\n\n Su saldo a pagar es: 800$");
                break;
        }
    }

    private void sendData(int image, String text){
        Bundle bndle = new Bundle();
        bndle.putInt("img", image);
        bndle.putString("txt", text);
        Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
        intent.putExtras(bndle);
        startActivity(intent);
    }
}
