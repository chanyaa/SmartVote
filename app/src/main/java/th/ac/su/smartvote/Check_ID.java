package th.ac.su.smartvote;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Check_ID extends AppCompatActivity {

    String n = "1111111111111";
    String m = "2222222222222";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check__i_d);


        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText numberEditText = findViewById(R.id.Number);
                String numText = numberEditText.getText().toString();
                if(numText.equals(n) || numText.equals(m)) {
                    //มีสิทธิ์
                    AlertDialog.Builder dialog = new AlertDialog.Builder(Check_ID.this);
                    dialog.setTitle("ผลการตรวจสอบสิทธิเลือกตั้ง");
                    dialog.setMessage("คุณเป็นผู้มีสิทธิเลือกตั้ง");
                    dialog.setNegativeButton("OK", null);
                    dialog.show();
                }
                else if(numText.isEmpty()){
                    //ไม่กรอกเลข
                    Toast t = Toast.makeText(Check_ID.this,
                            "กรุณากรอกหมายเลขบัตรประชาชน 13 หลัก",
                            Toast.LENGTH_LONG);
                    t.show();
                }
                else{
                    //ไม่มีสิทธิ์
                    AlertDialog.Builder dialog = new AlertDialog.Builder(Check_ID.this);
                    dialog.setTitle("ผลการตรวจสอบสิทธิเลือกตั้ง");
                    dialog.setMessage("คุณไม่มีสิทธิเลือกตั้ง");
                    dialog.setNegativeButton("OK", null);
                    dialog.show();
                }
            }
        });
    }
}