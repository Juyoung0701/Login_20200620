package kr.co.namu.login_20200620

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        loginBtn.setOnClickListener {


            val inputID = idEdt.text.toString()
            val inputPW = pwEdt.text.toString()


            if (inputID == "admin" && inputPW == "qwer") {

                Toast.makeText(this, "관리자입니다.", Toast.LENGTH_SHORT).show()
            }
            else {
                Toast.makeText(this, "로그인에 실패했습니다.", Toast.LENGTH_SHORT).show()
            }
        }

    }
}